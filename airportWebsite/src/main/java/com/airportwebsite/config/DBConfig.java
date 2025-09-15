package com.airportwebsite.config;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class DBConfig implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // Initialize database connection or in-memory data
        sce.getServletContext().setAttribute("dbUrl", "jdbc:h2:mem:testdb");
        sce.getServletContext().setAttribute("dbUsername", "sa");
        sce.getServletContext().setAttribute("dbPassword", "");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // Cleanup
    }
}