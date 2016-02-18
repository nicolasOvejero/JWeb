package com.ovejero.model;

import com.ovejero.email.Email;
import com.ovejero.sql.GestionSql;

import javax.servlet.http.HttpServletRequest;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/*
** Class pour la gestion des news
*/
public class GestionNews {
    private Map<Integer, String> values = new HashMap<Integer, String>();
    private Map<String, String> error = new HashMap<String, String>();
    private ResultSet resultat = null;
    private static final String CHAMP_INTI = "intitule";
    private static final String CHAMP_TEXT = "texte";

    public Map<String, String> getError() {
        return error;
    }

    public Map<Integer, String> getValues() {
        return values;
    }

    /*
    ** Fonction pour avec toutes les news
    */
    public void getAllNews() {
        try {
            GestionSql sql = new GestionSql();
            sql.connect();
            resultat = sql.executeQuery("SELECT * FROM news ORDER BY date_save DESC;");
            int i = 0;
            while (resultat.next()) {
                values.put(i, resultat.getInt("id") + ";" + resultat.getString("intitule") + ";" +
                        resultat.getString("newstext") + ";" + resultat.getTimestamp("date_save"));
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
    ** Fonction pour avoir les 2 premières news
    */
    public void getFirstNews() {
        ResultSet resultat = null;
        try {
            GestionSql sql = new GestionSql();
            sql.connect();
            resultat = sql.executeQuery("SELECT * FROM news ORDER BY date_save DESC LIMIT 2");
            int i = 0;
            while (resultat.next()) {
                values.put(i, resultat.getInt("id") + ";" + resultat.getString("intitule") + ";" +
                        resultat.getString("newstext") + ";" + resultat.getTimestamp("date_save"));
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
    ** Fonction pour inserer dans la base news un nouvelle news
    ** Cette fonction sert aussi à envoyer les news letter
    */
    public void insertNews(HttpServletRequest request) {
        String intitule = request.getParameter(CHAMP_INTI);
        String texte = request.getParameter(CHAMP_TEXT);

        try {
            GestionSql sql = new GestionSql();
            sql.connect();
            sql.executUpdate("INSERT INTO news (`intitule`, `newstext`, `date_save`) VALUES (\"" + intitule + "\", \"" + texte + "\", NOW())");
            ResultSet result = sql.executeQuery("SELECT * FROM users WHERE news_letter = 1");
            Email message = new Email();
            while (result.next())
            {
                message.sendEmail("News Letter BDVO", "Bonjour,\n\n" + intitule + "\n\n" + texte, result.getString("email"));
            }
            sql.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /*
    ** Fonction pour supprimer une/des news
    */
    public void deleteUsers(HttpServletRequest request) {
        String[] ids = null;

        ids = request.getParameterValues("id");
        if (ids != null) {
            try {
                GestionSql sql = new GestionSql();
                sql.connect();
                for (int i = 0; i < ids.length; i++) {
                    sql.executUpdate("DELETE FROM news WHERE id = " + ids[i]);
                }
                sql.close();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /*
    ** Fonction pour avoir l'erreur dans une string
    */
    private String getStackTrace(Throwable aThrowable) {
        final Writer result = new StringWriter();
        final PrintWriter printWriter = new PrintWriter(result);
        aThrowable.printStackTrace(printWriter);
        return result.toString();
    }
}