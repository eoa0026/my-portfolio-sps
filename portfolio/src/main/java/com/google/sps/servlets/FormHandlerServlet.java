package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form-handler")
public class FormHandlerServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        // Get the value entered in the form.
        String textValue = request.getParameter("name");
        String textValue2 = request.getParameter("email");
        String textValue3 = request.getParameter("message");

        // Print the value so you can see it in the server logs.
        System.out.println("You submitted: " + textValue);
        System.out.println("You submitted: " + textValue2);
        System.out.println("You submitted: " + textValue3);

        // Write the value to the response so the user can see it.
        response.getWriter().println("You submitted: " + textValue);
        response.getWriter().println("You submitted: " + textValue2);
        response.getWriter().println("You submitted: " + textValue3);
        
        //Redirects back to the linked webpage
        response.sendRedirect("http://pabah-sps-summer21.appspot.com/");
    }
}