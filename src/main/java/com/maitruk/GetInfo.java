package com.maitruk;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;


public class GetInfo extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String text = "<br>Message from servlet<br>"; //message you will recieve 
        String name = request.getParameter("name");
        String str = request.getParameter("str");
        PrintWriter out = response.getWriter();
        out.println(text + name+ "<br>" + str);
    }
            

    }


