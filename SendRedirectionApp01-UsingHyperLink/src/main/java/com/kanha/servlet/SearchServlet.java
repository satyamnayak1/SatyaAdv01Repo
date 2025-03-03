package com.kanha.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//get writer
		PrintWriter pw=res.getWriter();
		
		//set content type
		res.setContentType("text/html");
		
		
		String value=req.getParameter("ss");
		
		String ans=req.getParameter("rad");
		
		if(ans.equalsIgnoreCase("google")) 
			pw.println("<h1><a href='https://www.google.com/search?q="+value+"'>Google</a></h1>");
		if(ans.equalsIgnoreCase("bing")) 
			pw.println("<h1><a href='https://www.bing.com/search?q=java"+value+"'>Bing</a></h1>");
		
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, res);
	}


	

}
