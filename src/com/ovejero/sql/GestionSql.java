package com.ovejero.sql;

import java.sql.*;

/*
** Class pour la gestion sql
*/
public class GestionSql {
    private String url = "jdbc:mysql://localhost:3306/bdd_jweb";
    private String utilisateur = "root";
    private String motDePasse = "";
    private Connection connexion = null;
    private Statement statement = null;

    /*
    ** Constructeur de la classe
    ** Connect automatiquement le driver sql
    */
    public GestionSql() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
    }

    /*
    ** Fonction pour se conncter à la base
    */
    public void connect() throws SQLException {
        connexion = DriverManager.getConnection(url, utilisateur, motDePasse);
    }

    /*
    ** Fonction pour SELECT dans la base
    */
    public ResultSet executeQuery(String query) throws SQLException {
        statement = connexion.createStatement();
        return statement.executeQuery(query);
    }

    /*
    ** Fonction pour INSERT, UPDATE, DELETE dans la base
    */
    public void executUpdate(String query) throws SQLException {
        statement = connexion.createStatement();
        statement.executeUpdate(query);
    }

    /*
    ** Fonction pour fermer la connection
    */
    public void close() throws SQLException {
        connexion.close();
    }

}
