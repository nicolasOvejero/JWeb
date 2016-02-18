package com.ovejero.controler;

import com.ovejero.model.GestionContact;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
** Servlet pour la partie Contact
*/
public class Contact extends HttpServlet {
    public static final String VUE = "/WEB-INF/contact.jsp";
    public static final String ATT_FORM = "form";

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        GestionContact form = new GestionContact();

        form.GetInfo(request);
        request.setAttribute(ATT_FORM, form);
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
    }
}
