<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            margin-top: 50px;
        }
        h1 {
            color: #4CAF50;
        }
        p {
            font-size: 18px;
        }
    </style>
</head>
<body>
    <h1>Welcome to My JSP Result Page!</h1>
	<p>Programmer Details:</p>
	<p>ID: ${p1.id}</p>
	<p>Name: ${p1.name}</p>
	<p>Welcome back, ${p1.name}!</p>
	
</body>
</html>
