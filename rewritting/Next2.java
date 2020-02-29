package com.sessionmangement.rewritting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/next2")
public class Next2 extends HttpServlet 
{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		String id =req.getParameter("sid");
		String pass = req.getParameter("spass");
			 PrintWriter out= res.getWriter();
			 out.println("Student id="+id+"password is= "+pass);
			
			 //out.print("<center><a href='next2'?sid='+id+'&spass='+pass+'>Click Here</a></center>");
	}

}
