package com.ovejero.controler;

import com.ovejero.model.GestionUsers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
** Servlet pour la partie administration des utilisateur inscrit en base (supression des news)
*/
public class AdminUser extends HttpServlet {
    public static final String VUE = "/WEB-INF/adminUser.jsp";

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        GestionUsers users = new GestionUsers();

        users.getSqlUsers();
        request.setAttribute("users", users);
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        GestionUsers users = new GestionUsers();

        users.deleteUsers(request);
        users.getSqlUsers();
        request.setAttribute("users", users);
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
    }
}
