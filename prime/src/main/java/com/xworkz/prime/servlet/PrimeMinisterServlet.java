package com.xworkz.prime.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2, urlPatterns = {"/prime","/Show Registers"})
public class PrimeMinisterServlet extends HttpServlet {
	
	public PrimeMinisterServlet() {
		System.out.println("Default constructor");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running dopost in servlet");
		resp.setContentType("text/html");
		String name = req.getParameter("Name");
		String country = req.getParameter("Country");
		String marriage = req.getParameter("Marriage");
		String party = req.getParameter("Party");
		String age = req.getParameter("Age");
		String gender = req.getParameter("Gender");
		String period = req.getParameter("Period");
		String times = req.getParameter("Times");
		
		req.setAttribute("Name", name);
		req.setAttribute("Country", country);
		req.setAttribute("Marriage", marriage);
		req.setAttribute("Party", party);
		req.setAttribute("Age", age);
		req.setAttribute("Gender", gender);
		req.setAttribute("Period", period);
		req.setAttribute("Times", times);
		
		RequestDispatcher dispatch = req.getRequestDispatcher("/Savesuccess.jsp");
		dispatch.forward(req, resp);
	}

}
