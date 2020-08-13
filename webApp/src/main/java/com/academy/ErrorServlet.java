package com.academy;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "ErrorServlet", urlPatterns = "/errorServlet")
public class ErrorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            Date timestamp = new Date();
            DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

            throw new RuntimeException ("timestamp " + dateFormat.format(timestamp));
        } catch (RuntimeException e){
            e.printStackTrace();
            System.out.println(e);
            response.getWriter().println(e);
        }
    }
}
