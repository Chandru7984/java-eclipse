package com.xworkz.job.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.job.dto.JobDTO;

@WebServlet(loadOnStartup = 2, urlPatterns = "/kill")
public class JobServlet extends HttpServlet {
	
	private List<JobDTO> dtos = new ArrayList<JobDTO>();
	
	public JobServlet() {
		System.out.println("Created "+ this.getClass().getSimpleName());
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Service is running in Job servlet");
		resp.setContentType("text/html");
		String Name = req.getParameter("name");
		String Email = req.getParameter("email");
		String Phone = req.getParameter("phone");
		String Alternate= req.getParameter("alternate");
		String Gender = req.getParameter("gender");
		String Qualification = req.getParameter("qualification");
		String Passout = req.getParameter("passout");
		String University = req.getParameter("university");
		String Address = req.getParameter("address");
		String Skills1 = req.getParameter("skills1");
		String Skills2 = req.getParameter("skills2");
		String Salary = req.getParameter("salary");
		String Experience = req.getParameter("experience");
		String Proof = req.getParameter("proof");
		String Number = req.getParameter("number");
		
		System.out.println("Name: "+Name);
		System.out.println("Email: "+Email);
		System.out.println("Phone: "+Phone);
		System.out.println("Alternate phone: "+Alternate);
		System.out.println("Gender: "+Gender);
		System.out.println("Qualification: "+Qualification);
		System.out.println("Passout: "+Passout);
		System.out.println("University: "+University);
		System.out.println("Address: "+Address);
		System.out.println("Skills: "+Skills1);
		System.out.println("Skills: "+Skills2);
		System.out.println("Salary: "+Salary);
		System.out.println("Experience: "+Experience);
		System.out.println("ID Proof: "+Proof);
		System.out.println("ID Proof No: "+Number);
		
		PrintWriter writer = resp.getWriter();
		writer.append("<html>")
		.append("<body>")
		.append("<h1>")
		.append("Registration is success...Below is the details")
		.append("</h1>")
		.append("Name: "+Name)
		.append("<br>")
		.append("Email: "+Email)
		.append("<br>")
		.append("Phone: "+Phone)
		.append("<br>")
		.append("Alternate phone: "+Alternate)
		.append("<br>")
		.append("Gender: "+Gender)
		.append("<br>")
		.append("Qualification: "+Qualification)
		.append("<br>")
		.append("Passout: "+Passout)
		.append("<br>")
		.append("University: "+University)
		.append("<br>")
		.append("Address: "+Address)
		.append("<br>")
		.append("Skills: "+Skills1)
		.append("<br>")
		.append("Skills: "+Skills2)
		.append("<br>")
		.append("Salary: "+Salary)
		.append("<br>")
		.append("Experience: "+Experience)
		.append("<br>")
		.append("ID Proof: "+Proof)
		.append("<br>")
		.append("ID Proof No: "+Number)
		.append("</body>")
		.append("</html");
		
		JobDTO dto = new JobDTO(Name, Email, Long.parseLong(Phone), Long.parseLong(Alternate), Gender, Qualification, Integer.parseInt(Passout), University, Address, Skills1, Skills2, Integer.parseInt(Salary), Experience, Proof, Long.parseLong(Number));
		dtos.add(dto);
	}

}
