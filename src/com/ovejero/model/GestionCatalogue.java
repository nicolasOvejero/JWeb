package com.ovejero.model;

import com.ovejero.sql.GestionSql;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/*
** Class pour gérer le catalogue
*/
public class GestionCatalogue {

    private Map<Integer, String> values = new HashMap<Integer, String>();
    private Map<String, String> error = new HashMap<String, String>();
    private ResultSet resultat = null;

    public Map<String, String> getError() {
        return error;
    }

    public Map<Integer, String> getValues() {
        return values;
    }

    /*
    ** Fonction pour récupérer tous les produits
    */
    public void getAllProduct() {
        try {
            GestionSql sql = new GestionSql();
            sql.connect();
            resultat = sql.executeQuery("SELECT * FROM produits;");
            int i = 0;
            while (resultat.next()) {
                values.put(i, resultat.getInt("id") + "#" + resultat.getString("nom") + "#" +
                        resultat.getString("createur") + "#" + resultat.getDate("date_mise_vente") + "#" +
                        resultat.getString("description") + "#" + resultat.getInt("quantite") + "#" + resultat.getFloat("prix") +
                        "#" + resultat.getString("path"));
                i++;
            }
            sql.close();
        } catch (SQLException e) {
            error.put("Erreur", getStackTrace(e));
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            error.put("Erreur", getStackTrace(e));
            e.printStackTrace();
        }
    }

    /*
    ** Fonction pour récupérer les 3 premiers produits
    */
    public void getFirstCata() {
        ResultSet resultat = null;
        try {
            GestionSql sql = new GestionSql();
            sql.connect();
            resultat = sql.executeQuery("SELECT * FROM produits ORDER BY date_mise_vente DESC LIMIT 3");
            int i = 0;
            while (resultat.next()) {
                values.put(i, resultat.getInt("id") + "#" + resultat.getString("nom") + "#" +
                        resultat.getString("createur") + "#" + resultat.getDate("date_mise_vente") + "#" +
                        resultat.getString("description") + "#" + resultat.getInt("quantite") + "#" + resultat.getFloat("prix") +
                        "#" + resultat.getString("path"));
                i++;
            }
            sql.close();
        } catch (SQLException e) {
            error.put("Erreur", getStackTrace(e));
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            error.put("Erreur", getStackTrace(e));
            e.printStackTrace();
        }
    }

    /*
    ** fonction pour récupérer les erreurs dans une String
    */
    private String getStackTrace(Throwable aThrowable) {
        final Writer result = new StringWriter();
        final PrintWriter printWriter = new PrintWriter(result);
        aThrowable.printStackTrace(printWriter);
        return result.toString();
    }
}