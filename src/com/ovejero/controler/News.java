package com.ovejero.controler;

import com.ovejero.model.GestionNews;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
** Servlet pour la partie News
*/
public class News extends HttpServlet {
    public static final String VUE = "/WEB-INF/news.jsp";
    public static final String ATT_ERROR = "error";
    public static final String ATT_VALUE = "value";

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        GestionNews news = new GestionNews();

        news.getAllNews();
        request.setAttribute(ATT_VALUE, news.getValues());
        request.setAttribute(ATT_ERROR, news.getError());

        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
    }
}
