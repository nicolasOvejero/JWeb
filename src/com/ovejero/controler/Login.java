package com.ovejero.controler;

import com.ovejero.model.GestionConnexion;
import com.ovejero.model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/*
** Servlet pour la partie Connexion d'un utilisateur sur le site
*/
public class Login extends HttpServlet {
    public static final String ATT_FORM = "form";
    public static final String ATT_SESSION_USER = "userSeesion";
    public static final String VUE = "/WEB-INF/login.jsp";

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher( VUE ).forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        GestionConnexion form = new GestionConnexion();

        User user = form.connexion(request);
        HttpSession session = request.getSession();
        if (form.getError().isEmpty())
        {
            session.setAttribute(ATT_SESSION_USER, user);
        }
        else
        {
            session.setAttribute(ATT_SESSION_USER, null);
        }
        request.setAttribute(ATT_FORM, form);
        this.getServletContext().getRequestDispatcher( VUE ).forward(request, response);
    }
}
