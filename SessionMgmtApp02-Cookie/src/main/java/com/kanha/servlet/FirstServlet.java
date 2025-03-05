package com.kanha.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/firsturl")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	 
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//create Writer
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		//get the parameters
		String pname=req.getParameter("pname");
		String fname=req.getParameter("fname");
		String addrs=req.getParameter("addrs");
		String ms=req.getParameter("ms");
		
		//create cookie
		Cookie ck1=new Cookie("pname",pname);
		Cookie ck2=new Cookie("fname",fname);
		Cookie ck3=new Cookie("addrs",addrs);
		Cookie ck4=new Cookie("ms",ms);
		
		//send the cookie
		res.addCookie(ck1);
		res.addCookie(ck2);
		res.addCookie(ck3);
		res.addCookie(ck4);
		
		
		
		
		if(ms.equalsIgnoreCase("married")) {
			pw.println("<form action='secondurl' method='POST'>");
			pw.println("<table>");
			pw.println("<tr><td>Spouse Name</td><td><input type='text' name='f2t1'></td>");
			pw.println("<tr><td>Kids No</td><td><input type='text' name='f2t2'></td>");
			pw.println("<tr><td><input type='submit' value='Register'></td>");
			pw.println("</table>");
		}else {
			pw.println("<form action='secondurl' method='POST'>");
			pw.println("<table>");
			pw.println("<tr><td>Why do you Want to Marry</td><td><input type='text' name='f2t1'></td>");
			pw.println("<tr><td>When You Marry</td><td><input type='text' name='f2t2'></td>");
			pw.println("<tr><td><input type='submit' value='Register'></td>");
			pw.println("</table>");
		}
		
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}

}
