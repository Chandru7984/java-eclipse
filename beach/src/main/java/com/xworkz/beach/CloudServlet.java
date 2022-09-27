package com.xworkz.beach;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2, urlPatterns = "/rain")
public class CloudServlet extends HttpServlet {

	public CloudServlet() {
		System.out.println("Created MoonServlet using default constructor");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running service on MoonServlet");
		resp.setContentType("text/richtext");
		PrintWriter writer = resp.getWriter();
		writer.append("<html><body bgcolor='black' ><h1 style='color:white;'> Idu Black</h1></body></html>");
	}
}
