<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Gautam Buddha International Airport</title>
</head>
<body>
    <h1><%= request.getAttribute("weather") %> - <%= request.getAttribute("location") %></h1>
    <section>
        <h2>Latest News</h2>
        <p><%= request.getAttribute("news") %></p>
    </section>
</body>
</html>