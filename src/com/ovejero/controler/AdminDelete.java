package com.ovejero.controler;

import com.ovejero.model.GestionNews;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
** Servlet pour la partie administration des news (supression des news)
*/
public class AdminDelete extends HttpServlet {
    public static final String VUE = "/WEB-INF/adminNewsDelete.jsp";

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        GestionNews news = new GestionNews();

        news.getAllNews();
        request.setAttribute("news", news);
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
    }


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        GestionNews news = new GestionNews();

        news.deleteUsers(request);
        news.getAllNews();
        request.setAttribute("news", news);
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
    }
}
