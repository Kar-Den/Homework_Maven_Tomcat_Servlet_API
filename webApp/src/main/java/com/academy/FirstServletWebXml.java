package com.academy;

import sun.misc.CharacterEncoder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.academy.SimpleCalc.*;

public class FirstServletWebXml extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext context = getServletContext();
        RequestDispatcher dispatcher = context.getRequestDispatcher("/secondServlet");
        dispatcher.include(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String a = request.getParameter("firstNum");
        String b = request.getParameter("secondNum");
        String operation = request.getParameter("operation");

        Double aa = new Double(a);
        Double bb = new Double(b);

        switch (operation) {
            case "plus":
                response.getWriter().println(a + " + " + b + " = " + sum(aa, bb));
                break;
            case "minus":
                response.getWriter().println(a + " - " + b + " = " + minus(aa, bb));
                break;
            case "mul":
                response.getWriter().println(a + " * " + b + " = " + mul(aa, bb));
                break;
            case "div":
                response.getWriter().println(a + " : " + b + " = " + div(aa, bb));
                break;
            default:response.getWriter().println("Look to operation");

        }
    }
}
