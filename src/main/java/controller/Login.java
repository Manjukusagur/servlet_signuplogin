package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.UserDao;
import DTO.User;

//@WebServlet("/login")
//@WebInitParam(name = "cbranch",value = "banglore")
public class Login  extends HttpServlet{
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
		ServletConfig confi=getServletConfig();
		String cname=confi.getInitParameter("cname");
		String cbranch=getServletConfig().getInitParameter("cbranch");
		
		
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		 
		UserDao dao=new UserDao();
		User user=dao.find(email);
		
		
		if(user==null) {
		resp.getWriter().print("<h1>invalid email</h1>");
		req.getRequestDispatcher("Login.html").include(req, resp);
		}
	else {
		
		if(user.getPassword().equals(password)) 
		{
			//
			req.getSession().setAttribute("id", "sdsdf6783");
			//
		//	resp.getWriter().print("<h1>login success in"+" "+cname+" "+cbranch+"</h1>");
			
			//resp.sendRedirect("https://www.youtube.com");
			//sendRedict aceess throw one server to another server
			//resp.getWriter().print("<h1>login succesfuly</h1>");
			
	    //        List<User> list=dao.fetchAll();
//	            for(User u:list)
//	            {
//	            
//	            resp.getWriter().print("<h1>UserName:"+u.getName()+"</h1>");
//	            resp.getWriter().print("<h1>UserEmail:"+u.getEmail()+"</h1>");
//	            resp.getWriter().print("<h1>UserMobile:"+u.getMobile()+"</h1>");
//	            resp.getWriter().print("<h1>UserAdress:"+u.getAdress()+"</h1>");
//	            resp.getWriter().print("<h1>UserPassword:"+u.getPassword()+"</h1>");
//	            resp.getWriter().print("<h1>UserGender:"+u.getGender()+"</h1>");
//	            resp.getWriter().print("<h1>------------------</h1>");
//	            
//	            }
	            
//	            resp.getWriter().print("<h1>-------------------------</h1>");
//	            resp.getWriter().print(
//	            		"<table border=\"1\">"
//	            		+ "<tr>"
//	            		+"<th>User Name</th>"
//	            		+"<th>User Email</th>"
//	            		+"<th>User Mobile</th>"
//	            		+"<th>User Adress</th>"
//	            		+"<th>User NPassword</th>"
//	            		+"<th>User Gerder </th>"
//	            		+"</tr>");
//	            		
//	            for(User u:list)
//	            		{
//	            			resp.getWriter().print(
//	            			"<th>"+u.getName()+"</th>"
//	            		+ "<th>"+u.getEmail()+"</th>"
//	            		+ "<th>"+u.getMobile()+"</th>"
//	         			+ "<th>"+u.getAdress()+"</th>"
//	            		+ "<th>"+u.getPassword()+"</th>"
//	  					+ "<th>"+u.getGender()+"</th>"
//	  					+"</tr>");
//	            		}
	            //		resp.getWriter().print("</table>");
			List<User> list=dao.fetchAll();
			req.setAttribute("list", list);
	     req.getRequestDispatcher("Result.jsp").forward(req, resp) ;   	
	            
			
		}
		else {
			resp.setContentType("text/html");
			//above line not required u want both text and html using above method
			resp.getWriter().print("invalid password");
			req.getRequestDispatcher("Login.html").include(req, resp);
			
			//resp.sendRedirect("Login.html");
		}
		
		}	
	}
	


//class Login extends GenericServlet {
//
//	@Override
//	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		String email=req.getParameter("email");
//		String password=req.getParameter("password");
////		
////		System.out.println(email);
////		System.out.println(password);
//		
//		
//		UserDao dao=new UserDao();
//		User user=dao.find(email);
//		if(user==null) {
//			res.getWriter().print("invalid email");
//		}
//		else {
//		
//		if(user.getPassword().equals(password)) 
//		{
//			res.getWriter().print("login succesfuly");
//		}
//		else {
//			res.getWriter().print("<h1>invalid password</h1>");
	//	}
		
	//	}
//	}

}
