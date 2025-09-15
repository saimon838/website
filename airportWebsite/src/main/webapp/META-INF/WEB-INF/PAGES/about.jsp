<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>About Gautam Buddha International Airport</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 20px; }
        h1 { color: #2c3e50; }
        p { line-height: 1.6; }
    </style>
</head>
<body>
    <h1>About Gautam Buddha International Airport</h1>
    <p><%= request.getAttribute("description") != null ? request.getAttribute("description") : "Loading description..." %></p>
    <p>Nepal's gateway to Lumbini, the birthplace of Lord Buddha, offering world-class facilities and connectivity to peace and heritage.</p>
    <a href="/home">Back to Home</a>
</body>
</html>