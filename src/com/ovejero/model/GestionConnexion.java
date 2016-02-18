package com.ovejero.model;

import com.ovejero.sql.GestionSql;

import javax.servlet.http.HttpServletRequest;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/*
** Class pour gérer la connection
*/
public class GestionConnexion {
    private static final String CHAMP_LOGIN = "login";
    private static final String CHAMP_PASS = "pass";
    private Map<String, String> error = new HashMap<String, String>();

    /*
    ** Fonction pour vérifier et connecter un utilisateur
    */
    public User connexion(HttpServletRequest request)
    {
        String login = getValeurChamp(request, CHAMP_LOGIN);
        String pass = getValeurChamp(request, CHAMP_PASS );

        User user = new User();

        try
        {
            validation(login, "login");
        } catch (Exception e)
        {
            setError(CHAMP_LOGIN, e.getMessage());
        }
        user.setLogin(login);

        try
        {
            validation(pass, "mot de passe");
        } catch (Exception e)
        {
            setError(CHAMP_PASS, e.getMessage());
        }
        user.setPassword(pass);

        if (error.isEmpty())
        {
            try
            {
                GestionSql sql = new GestionSql();
                sql.connect();
                ResultSet result = sql.executeQuery("SELECT * FROM users WHERE login = \"" + login + "\" && password = MD5(\"" + pass + "\")");
                int i = 0;
                while (result.next())
                {
                    user.setLevel(result.getInt("level"));
                    i++;
                }
                if (i == 0)
                {
                    setError("errorUser", "Vous ne faite pas partie de notre base");
                }
                sql.close();
            }
            catch (ClassNotFoundException e)
            {
                e.printStackTrace();
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
        return user;
    }

    /*
    ** Fonction pour vérifier les champs de l'input
    */
    private void validation(String str, String who) throws Exception
    {
        if (str != null)
        {
            if (str.length() < 3)
            {
                throw new Exception( "Le champ : " + who + " doit contenir au moins 3 caractères." );
            }
        }
        else
        {
            throw new Exception( "Merci de saisir votre " + who + "." );
        }
    }

    /*
    ** Fonction pour récupérer un champs
    */
    private static String getValeurChamp(HttpServletRequest request, String str)
    {
        String valeur = request.getParameter(str);
        if (valeur == null || valeur.trim().length() == 0)
        {
            return null;
        } else
        {
            return valeur;
        }
    }

    public Map<String, String> getError()
    {
        return error;
    }

    public void setError(String who, String what)
    {
        this.error.put(who, what);
    }
}
