<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Airport Website</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-4">
        <h1>${welcomeMessage}</h1>
        <p>Explore flight schedules, book tickets, and discover airport services.</p>
        <div class="row">
            <div class="col-md-4">
                <a href="/flights" class="btn btn-primary">View Flights</a>
            </div>
            <div class="col-md-4">
                <a href="/services" class="btn btn-secondary">Airport Services</a>
            </div>
            <div class="col-md-4">
                <a href="/contact" class="btn btn-info">Contact Us</a>
            </div>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>