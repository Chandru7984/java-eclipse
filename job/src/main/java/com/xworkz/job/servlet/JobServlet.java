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
		String a = req.getParameter("name");
		String b = req.getParameter("email");
		String c = req.getParameter("phone");
		String d = req.getParameter("alternate");
		String e = req.getParameter("gender");
		String f = req.getParameter("qualification");
		String g = req.getParameter("passout");
		String h = req.getParameter("university");
		String i = req.getParameter("address");
		String j = req.getParameter("skills");
		String k = req.getParameter("salary");
		String l = req.getParameter("experience");
		String m = req.getParameter("proof");
		String n = req.getParameter("number");
		
		System.out.println("Name: "+a);
		System.out.println("Email: "+b);
		System.out.println("Phone: "+c);
		System.out.println("Alternate phone: "+d);
		System.out.println("Gender: "+e);
		System.out.println("Qualification: "+f);
		System.out.println("Passout: "+g);
		System.out.println("University: "+h);
		System.out.println("Address: "+i);
		System.out.println("Skills: "+j);
		System.out.println("Salary: "+k);
		System.out.println("Experience: "+l);
		System.out.println("ID Proof: "+m);
		System.out.println("ID Proof No: "+n);
		
		PrintWriter writer = resp.getWriter();
		writer.append("<html>")
		.append("<body>")
		.append("<h1>")
		.append("Registration is success...Below is the details")
		.append("</h1>")
		.append("Name: "+a)
		.append("<br>")
		.append("Email: "+b)
		.append("<br>")
		.append("Phone: "+c)
		.append("<br>")
		.append("Alternate phone: "+d)
		.append("<br>")
		.append("Gender: "+e)
		.append("<br>")
		.append("Qualification: "+f)
		.append("<br>")
		.append("Passout: "+g)
		.append("<br>")
		.append("University: "+h)
		.append("<br>")
		.append("Address: "+i)
		.append("<br>")
		.append("Skills: "+j)
		.append("<br>")
		.append("Salary: "+k)
		.append("<br>")
		.append("Experience: "+l)
		.append("<br>")
		.append("ID Proof: "+m)
		.append("<br>")
		.append("ID Proof No: "+n)
		.append("</body>")
		.append("</html");
		
		JobDTO dto = new JobDTO(a, b, Long.parseLong(c), Long.parseLong(d), e, f, Integer.parseInt(g), h, i, j, Integer.parseInt(k), l, m, Long.parseLong(n));
		dtos.add(dto);
	}

}
