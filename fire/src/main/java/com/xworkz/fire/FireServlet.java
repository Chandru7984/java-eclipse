package com.xworkz.fire;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 6, urlPatterns = "/nanu")
public class FireServlet extends HttpServlet {
	
	public FireServlet() {
		System.out.println("Creating default constructor in Fire");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Creating service in Fire Servlet");
		String Name = req.getParameter("alias");
		String Company = req.getParameter("company");
		String Package = req.getParameter("salary");
		System.out.println("Name :" .concat(Name));
		System.out.println("Company :".concat(Company));
		System.out.println("Package :".concat(Package));
		
		
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.append("<html>")
		.append("<body>")
		.append("<h1>")
		.append("this is list")
		.append("</h1>")
		.append("Name: "+Name)
		.append("<br>")
		.append("Company: "+Company)
		.append("<br>")
		.append("Package: "+Package)
		.append("</body>")
		.append("</html>");
	}

}
