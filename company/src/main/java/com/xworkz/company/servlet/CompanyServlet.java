package com.xworkz.company.servlet;

import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.company.dto.CompanyDTO;

@WebServlet(loadOnStartup = 2, urlPatterns = {"/nanu","/Show Details"})
public class CompanyServlet extends HttpServlet {
	
	private List<CompanyDTO> dtos = new ArrayList<CompanyDTO>();
	
	public CompanyServlet() {
		System.out.println("default Constructor");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running dopost on servlet");
		resp.setContentType("text/html");
		String name = req.getParameter("Name");
		String founder = req.getParameter("Founder");
		String since = req.getParameter("Since");
		String employees = req.getParameter("Employees");
		String address = req.getParameter("Address");
		String business = req.getParameter("Business");
		System.out.println("Company Name: "+name);
		System.out.println("Founder: "+founder);
		System.out.println("Since: "+since);
		System.out.println("Employees: "+employees);
		System.out.println("Address: "+address);
		System.out.println("Business: "+business);
		
		PrintWriter writer = resp.getWriter();
		writer.append("<html>")
		.append("<body>")
		.append("<h1>")
		.append("Company Details")
		.append("</h1>")
		.append("Company Name: "+name)
		.append("<br>")
		.append("Founder: "+founder)
		.append("<br>")
		.append("Since: "+since)
		.append("<br>")
		.append("Employees: "+employees)
		.append("<br>")
		.append("Address: "+address)
		.append("<br>")
		.append("Business: "+business)
		.append("</body>")
		.append("</html>");
		
		CompanyDTO dto = new CompanyDTO(name, founder, since, employees, address, business);
		dtos.add(dto);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doget in servlet");
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.append("<html>")
		.append("<body>")
		.append("<h1>")
		.append("Details Bandide")
		.append("</h1>")
		.append("<table>");
		for (CompanyDTO companyDTO : dtos) {
		writer.append("<tr>")
		.append("<td>")
		.append("Company Name: "+companyDTO.getName())
		.append("</td>")
		.append("&nbsp")
		.append("<td>")
		.append("Founder: "+companyDTO.getFounder())
		.append("</td>")
		.append("&nbsp")
		.append("<td>")
		.append("Since: "+companyDTO.getSince())
		.append("</td>")
		.append("&nbsp")
		.append("<td>")
		.append("Employees: "+companyDTO.getEmployees())
		.append("</td>")
		.append("&nbsp")
		.append("<td>")
		.append("Address: "+companyDTO.getAddress())
		.append("</td>")
		.append("&nbsp")
		.append("<td>")
		.append("Business: "+companyDTO.getBusiness())
		.append("</td>")
		.append("</tr>")
		.append("</table>")
		.append("</body>")
		.append("</html>");
		}
	}

}
