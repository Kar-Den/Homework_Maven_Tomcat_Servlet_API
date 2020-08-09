package com.academy;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FirstServletWebXml extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String a = request.getParameter("firstNum");
        String b = request.getParameter("secondNum");
        String operation = request.getParameter("operation");

        Double aa = new Double(a);
        Double bb = new Double(b);

        response.getWriter().println(a);
        response.getWriter().println(b);
        response.getWriter().println(operation);

        response.getWriter().println(SimpleCalc.div(aa, bb));

    }
}
