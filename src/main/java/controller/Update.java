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

@WebServlet("/update")
public class Update extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		User user=new User();
		user.setId(Integer.parseInt(req.getParameter("id")));
		user.setMobile(Long.parseLong(req.getParameter("mobile")));
		user.setName(req.getParameter("name"));
		user.setEmail(req.getParameter("email"));
		
		user.setGender(req.getParameter("gender"));
		
		user.setAdress(req.getParameter("address"));
		user.setPassword(req.getParameter("password"));
		
		UserDao dao=new UserDao();
		dao.updateUser(user);
		
		List<User> list=dao.fetchAll();
		 req.setAttribute("list", list);
		 req.getRequestDispatcher("Result.jsp").forward(req, resp);
		
		
           
		
	}

}
