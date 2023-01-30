<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% %>
<h1>hello world</h1>
<%List list=new ArrayList() ;
list.add(0);
list.add(1);
%>
<%=list %>


<%
int a=5;
System.out.println(a);
 out.print("<h1>"+a+"</h1>");
%>
<h1>First:   <%=a %></h1>
<%--below line declares globle variable  --%>
<%! int a=9; %>
<h1>Second:<%=this.a %></h1>

</body>
</html>