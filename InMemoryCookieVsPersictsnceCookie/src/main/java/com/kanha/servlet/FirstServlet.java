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
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//get Writer
		PrintWriter pw=res.getWriter();
		
		//set content type
		res.setContentType("text/html");
		
		//create cookies
		Cookie ck1=new Cookie("ts","hyd");
		Cookie ck2=new Cookie("ap","notavialable");
		
		Cookie ck3=new Cookie("mh","mumbai");
		Cookie ck4=new Cookie("odisha","bbsr");
		ck3.setMaxAge(120);
		ck4.setMaxAge(60);
		
		res.addCookie(ck1);
		res.addCookie(ck2);
		res.addCookie(ck3);
		res.addCookie(ck4);
		
		pw.println("<h1>cookies are there</h1>");
		
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}

}
