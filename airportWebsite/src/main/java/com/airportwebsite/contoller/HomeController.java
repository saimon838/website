package com.airportwebsite.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/home")
public class HomeController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("weather", "Kathmandu: 24°C, Sunny");
        request.setAttribute("location", "Nepal");
        request.setAttribute("news", "Scheduled runway maintenance from 10 PM to 4 AM tonight...");
        request.getRequestDispatcher("/WEB-INF/pages/home.jsp").forward(request, response);
    }
}