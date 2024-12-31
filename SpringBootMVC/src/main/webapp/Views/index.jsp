<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
    <h1>Welcome to My JSP Page!</h1>
    <p>This is a basic JSP example page.</p>
    <p>The current date and time is: <%= new java.util.Date() %></p>
	
	<form action="addProgrammer">
		Enter your id: <input type="text" name="id"><br>
		Enter name: <input type="text" name="name"><br>
		<input type="submit">
	</form>
</body>
</html>
