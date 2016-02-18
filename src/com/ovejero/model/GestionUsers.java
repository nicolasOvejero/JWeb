package com.ovejero.model;

import com.ovejero.sql.GestionSql;

import javax.servlet.http.HttpServletRequest;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/*
** Class pour la gestion des utilisateur coté admin
*/
public class GestionUsers {
    private Map<Integer, String> values = new HashMap<Integer, String>();

    /*
    ** Function pour recupere tous les utilisateurs
    */
    public void getSqlUsers() {
        ResultSet result = null;

        try {
            GestionSql sql = new GestionSql();
            sql.connect();
            result = sql.executeQuery("SELECT * FROM users;");
            int i = 0;
            while (result.next()) {
                values.put(i, i + ";" + result.getString("login") + ";" + result.getString("name") + ";" +
                        result.getString("surname") + ";" + result.getString("adress") + ";" + result.getString("email")
                        + ";" + result.getInt("id") + ";" + result.getInt("news_letter"));
                i++;
            }
            sql.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*
    ** Fonction pour supprimer un utilisateur de la base users
    */
    public void deleteUsers(HttpServletRequest request) {
        String[] ids = null;

        ids = request.getParameterValues("id");
        if (ids != null) {
            try {
                GestionSql sql = new GestionSql();
                sql.connect();
                for (int i = 0; i < ids.length; i++) {
                    sql.executUpdate("DELETE FROM users WHERE id = " + ids[i]);
                }
                sql.close();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public Map<Integer, String> getValues() {
        return values;
    }

    public void setValues(Map<Integer, String> values) {
        this.values = values;
    }
}
