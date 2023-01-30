package controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import DAO.Infuser;
import DTO.Biodata;

@WebServlet("/info")
public class Information extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		Biodata bio=new Biodata();
		bio.setFirstname(req.getParameter("name"));
		bio.setMiddlename(req.getParameter("middle"));
		bio.setLastname(req.getParameter("last"));
		bio.setMobile(Long.parseLong(req.getParameter("mobile")));
		bio.setGmail(req.getParameter("gmail"));
		bio.setGender(req.getParameter("gender"));
		bio.setSSLC(Double.parseDouble(req.getParameter("sslc")));
		bio.setPUC(Double.parseDouble(req.getParameter("puc")));
		bio.setDiploma(Double.parseDouble(req.getParameter("dip")));
		bio.setDegree(Double.parseDouble(req.getParameter("dig")));
		bio.setAdress(req.getParameter("addr"));
		
		Infuser in=new Infuser();
		in.Infam(bio);
		res.getWriter().print("uploaded");
	}

}
