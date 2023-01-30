<%@page import="DTO.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<body>
<h1>hey this is result</h1>



<%List<User> list=(List<User>)request.getAttribute("list"); %>
<table border="1">
<tr>
<th>User ID</th>
<th>User Name</th>
<th>User Email</th>
<th>User Mobile</th>
<th>User Adress</th>
<th>User Password</th>
<th>User Gender</th>
<th>Delete</th>
<th>Edit</th>
<th>logout</th>


</tr>

<%for(User user:list){%>
<tr>
<td><%=user.getId() %></td>
<td><%=user.getName() %></td>
<td><%=user.getEmail() %></td>
<td><%=user.getMobile()%></td>
<td><%=user.getAdress()%></td>
<td><%=user.getPassword()%></td>
<td><%=user.getGender()%></td>
<td> <a href="delete?email=<%=user.getEmail()%>"><button>Delete</button></a></td>
<td><a href="edit.jsp?email=<%=user.getEmail()%>"><button>edit</button></a></td>

</tr>
<%} %>
</table>
<button onclick="window.print()">print</button>
<button onclick="export_data()">export</button>
<br>
<a href="logout"><button>logout</button></a>

</body>
</html>