package com.ovejero.controler;


import com.ovejero.model.GestionCatalogue;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
** Servlet pour la partie Catalogue
*/
public class Catalogue extends HttpServlet {
    public static final String VUE = "/WEB-INF/catalogue.jsp";
    public static final String ATT_ERROR = "error";
    public static final String ATT_VALUE = "value";

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        GestionCatalogue cata = new GestionCatalogue();

        cata.getAllProduct();
        request.setAttribute(ATT_VALUE, cata.getValues());
        request.setAttribute(ATT_ERROR, cata.getError());

        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
    }

}
