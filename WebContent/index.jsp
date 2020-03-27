<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="ejercicio_examen.RaulServlet" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<p><%="Raul" %></p>

<p>Nombre desde el servlet: <%= RaulServlet.name() %></p>

</body>
</html>