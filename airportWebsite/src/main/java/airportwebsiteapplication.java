package com.airportwebsite;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet("/AirportWebsiteApplication")
public class AirportWebsiteApplication extends HttpServlet {
    @Override
    public void init() throws ServletException {
        ServletContext context = getServletContext();
        // Initialize application-wide resources (e.g., load data)
        context.setAttribute("appName", "Gautam Buddha International Airport");
    }
}