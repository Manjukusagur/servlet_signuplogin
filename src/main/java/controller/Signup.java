package controller;

import java.io.IOException;


import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

import DAO.UserDao;
import DTO.User;

//@WebServlet("/manju"),
//@WebInitParam(name = "cbranch",value = "raj")

//@WebServlet(urlPatterns = "/manju",initParams = {
	//	@WebInitParam(name = "cbranch",value = "raj"),
		//@WebInitParam(name ="",value = "" )
//})
public class Signup extends GenericServlet {

	
	
	

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletConfig confi=getServletConfig();
		String cname=confi.getInitParameter("cname");
		String cbranch=getServletConfig().getInitParameter("cbranch");
		
		User user=new User();
		user.setMobile(Long.parseLong(req.getParameter("mobile")));
		user.setName(req.getParameter("name"));
		user.setEmail(req.getParameter("email"));
		
		user.setGender(req.getParameter("gender"));
		
		user.setAdress(req.getParameter("address"));
		user.setPassword(req.getParameter("password"));
		
		UserDao dao=new UserDao();
		try {

			dao.save(user);
			
			res.getWriter().print("<h1>acount created successfully"+" "+cname+" "+cbranch+"</h1>");
			RequestDispatcher rd=req.getRequestDispatcher("Login.html");
			rd.include(req, res);
			
			
		} catch (Exception e) {
			// TODO: handle exception

			
			
			res.getWriter().print("<h1>acount alresady exist"+" "+cname+" "+cbranch+"</h1>");
			RequestDispatcher rd=req.getRequestDispatcher("Login.html");
			rd.include(req, res);
			
		}
		
	//	req.getRequestDispatcher("login.html").forward(req,res);
	//	res.getWriter().print("<h1>acount signup successfully</h1><br><a href=\"Login.html\">click here to Login</a>");
		
		
	}

}
