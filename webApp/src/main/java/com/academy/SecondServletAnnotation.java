package com.academy;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SecondServletAnnotation", urlPatterns = "/secondServlet")
public class SecondServletAnnotation extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String a = request.getParameter("firstNum");
        String b = request.getParameter("secondNum");
        String operation = request.getParameter("operation");

        Double aa = new Double(a);
        Double bb = new Double(b);

        switch (operation) {
            case "plus":
                response.getWriter().println(a + " + " + b + " = " + SimpleCalc.sum(aa, bb));
                break;
            case "minus":
                response.getWriter().println(a + " - " + b + " = " + SimpleCalc.minus(aa, bb));
                break;
            case "mul":
                response.getWriter().println(a + " * " + b + " = " + SimpleCalc.mul(aa, bb));
                break;
            case "div":
                response.getWriter().println(a + " : " + b + " = " + SimpleCalc.div(aa, bb));
                break;
            default:response.getWriter().println("Look to operation");

        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("<h1>Second-Servlet-Annotation</h1>");
    }
}
