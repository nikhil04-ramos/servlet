package com.sessionmangement.rewritting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/next")
public class Next extends HttpServlet
{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
res.setContentType("text/html");
	String sid =req.getParameter("sid");
	String spass = req.getParameter("spass");
	
	//System.out.println(id+"  "+pass);
		 PrintWriter out= res.getWriter();
		 out.println("Student id="+sid+"password is"+spass);
		 out.print("<center><a href='next?sid="+sid+"&spass="+spass+"'>Click Here for next</a></center>");
		// out.print("<center><a href='next2?'sid="+sid+"'&'spass="+spass+"''>Click Here for next2</a></center>");
	
}

}
