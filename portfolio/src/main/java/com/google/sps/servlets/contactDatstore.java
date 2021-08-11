package com.google.sps.servlets;

import com.google.cloud.datastore.Datastore;
import com.google.cloud.datastore.DatastoreOptions;
import com.google.cloud.datastore.Entity;
import com.google.cloud.datastore.FullEntity;
import com.google.cloud.datastore.KeyFactory;
import com.google.cloud.datastore.Query;
import com.google.cloud.datastore.QueryResults;
import com.google.cloud.datastore.StructuredQuery.OrderBy;
import com.google.gson.Gson;
import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Servlet responsible for listing tasks. */
@WebServlet("/datastore-contact")
public class contactDatstore<user> extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        //Get the user input from the form
        String messageName = request.getParameter("name");
        String messageEmail = request.getParameter("email");
        String messageText = request.getParameter("message");

        // Set kind and build user entity
        Datastore datastore = DatastoreOptions.getDefaultInstance().getService();
        KeyFactory keyFactory = datastore.newKeyFactory().setKind("user");
        FullEntity userEntity = Entity.newBuilder(keyFactory.newKey())
            .set("name", messageName)
            .set("email", messageEmail)
            .set("message", messageText)
            .build();
        datastore.put(userEntity);

        //Redirects back to homepage
        response.sendRedirect("http://pabah-sps-summer21.appspot.com/");

    }
}