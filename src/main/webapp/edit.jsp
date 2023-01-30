<%@page import="DTO.User"%>
<%@page import="DAO.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
if(session.getAttribute("id")==null){
	

	response.getWriter().print("<h1>logout successful</h1>");
	request.getRequestDispatcher("Login.html").include(request, response);
}
else{

%>
<%String email=request.getParameter("email");
UserDao dao=new UserDao();
User user=dao.find(email);
%>

<form action="update" method="post">
<input type="text" name="id" value="<%=user.getId() %>" hidden="hidden">
Name:<input type="text" name="name" value="<%=user.getName()%>"><br>
Phono:<input type="text" name="mobile" value="<%=user.getMobile()%>"><br>
Email:<input type="text" name="email" value="<%=user.getEmail()%>"><br>
Password:<input type="password" name="password" value="<%=user.getPassword()%>"><br>
Gender:
<%if(user.getGender().equals("Male")){ %>
<input type="radio" name="gender" value="Male" checked="checked"> male
<input type="radio" name="gender" value="Female">female<br> 
<%}else{ %> 

<input type="radio" name="gender" value="Male"> male
<input type="radio" name="gender" value="Female" checked="checked">female<br> <%}%>
<br>

Adress:<textarea rows="10" cols="32" name="address" ><%=user.getAdress()%></textarea>
<button>Update</button>
<button type="reset ">cancel</button></form>
<%} %>

</body>
</html>