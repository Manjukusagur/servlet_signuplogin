package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.UserDao;
import DTO.User;

@WebServlet("/delete")
public class Delete extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//
		if(req.getSession().getAttribute("id")==null)
		{
			resp.getWriter().print("<h1>invalid session login agin</h1>");
			req.getRequestDispatcher("Login.html").include(req, resp);
			
		}
		else {
			
		}
		
		//
		String email=req.getParameter("email");
		
		UserDao dao=new UserDao();
		
		User user=dao.find(email);
		
		dao.delete(user);
		
		List<User> list=dao.fetchAll();
		req.setAttribute("list", list);
     req.getRequestDispatcher("Result.jsp").forward(req, resp) ;   	
            
		
	}

}
