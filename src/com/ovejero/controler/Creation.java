package com.ovejero.controler;

import com.ovejero.model.GestionInscription;
import com.ovejero.model.User;
import com.ovejero.sql.GestionSql;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/*
** Servlet pour la partie Creation de compte
*/
public class Creation extends HttpServlet {
    public static final String VUE = "/WEB-INF/creation.jsp";
    public static final String ATT_USER = "user";
    public static final String ATT_FORM = "form";

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        GestionInscription form = new GestionInscription();
        User user = form.inscUser(request);

        try {
            GestionSql sql = new GestionSql();
            sql.connect();
            sql.executUpdate("INSERT INTO users (login, password, name, surname, adress, email, news_letter) " +
                    "VALUES (\"" + user.getLogin() + "\", MD5(\"" + user.getPassword() + "\"), \"" + user.getName() + "\", \"" +
                    user.getSurname() + "\", \"" + user.getAdress() + "\", \"" + user.getEmail() + "\", \"" + user.getNews() + "\");");
            sql.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute(ATT_FORM, form);
        request.setAttribute(ATT_USER, user);

        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
    }
}
