package com.ovejero.controler;

import com.ovejero.model.GestionCatalogue;
import com.ovejero.model.GestionNews;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
** Servlet pour la premiere page
*/
public class Home extends HttpServlet {
    public static final String VUE = "/WEB-INF/home.jsp";
    public static final String ATT_ERRORN = "error";
    public static final String ATT_VALUEN = "LastNews";
    public static final String ATT_ERRORC = "error";
    public static final String ATT_VALUEC = "LastCata";

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        GestionCatalogue cata = new GestionCatalogue();
        GestionNews news = new GestionNews();

        cata.getFirstCata();
        request.setAttribute(ATT_VALUEC, cata.getValues());
        request.setAttribute(ATT_ERRORC, cata.getError());

        news.getFirstNews();
        request.setAttribute(ATT_VALUEN, news.getValues());
        request.setAttribute(ATT_ERRORN, news.getError());

        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
    }
}
