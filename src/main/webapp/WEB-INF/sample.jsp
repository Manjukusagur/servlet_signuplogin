<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String email=request.getParameter("email");
String password=request.getParameter("password");
%>
<%=email %>
<%=password %>
</body>
</html>