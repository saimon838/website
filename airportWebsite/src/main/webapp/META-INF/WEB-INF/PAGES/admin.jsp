<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Admin Dashboard - Gautam Buddha International Airport</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 20px; }
        h1 { color: #2c3e50; }
        .chart-placeholder { background-color: #f0f0f0; padding: 20px; text-align: center; }
    </style>
</head>
<body>
    <h1>Admin Dashboard</h1>
    <% if (request.getSession().getAttribute("user") == null) { %>
        <p>Please <a href="/login">login</a> to access the dashboard.</p>
    <% } else { %>
        <p>Welcome, <%= request.getSession().getAttribute("user") %>!</p>
        <div class="chart-placeholder">
            <p><%= request.getAttribute("monthlyData") != null ? request.getAttribute("monthlyData") : "Loading data..." %></p>
            <!-- Add Chart.js or other charting library here if desired -->
        </div>
        <a href="/admin/operations">Go to Operations</a> | <a href="/logout">Logout</a>
    <% } %>
    <a href="/home">Back to Home</a>
</body>
</html>