package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import com.google.gson.Gson;

/**
 * Handles requests sent to the /hello URL. Try running a server and navigating
 * to /hello!
 */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ArrayList<String> arr = new ArrayList<String>(); // Creates an arrayList
        // Add Elements to the list
        arr.add("Well, you have found my flabbergast button, and guess what? You pressed it. -Schmidt, New girl");
        arr.add("I Was Never One To Hold A Grudge, Jeffrey. My Father Held Grudges. Ill Always Hate Him For That. -Pierce, Community");
        arr.add("My first girlfriend turned into the moon. That's rough, buddy. -Sokka & Zuko, Avatar the Last Airbender");
        arr.add("Its gonna be legen, wait for it and I hope you are not lactose-intolerant because the second half of that word is dary -Barney, How I met your Mother");
        arr.add("Stuff can be two things. -Detective Jake Peralta, Brooklyn Nine-Nine");
        // convert to json string
        String json = convertToJsonUsingGson(arr);

        response.setContentType("application/json;");
        response.getWriter().println(json);
    }

    private String convertToJsonUsingGson(ArrayList<String> arr) {
        Gson gson = new Gson();
        String json = gson.toJson(arr);
        return json;
    }
}