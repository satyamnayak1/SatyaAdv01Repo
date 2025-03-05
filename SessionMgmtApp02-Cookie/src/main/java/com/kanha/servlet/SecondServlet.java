package com.kanha.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/secondurl")
public class SecondServlet extends HttpServlet {
	   
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//create Writer
				PrintWriter pw=res.getWriter();
				res.setContentType("text/html");
				//access the cookie
				Cookie [] cookie=req.getCookies();
				
				String name=null;String fname=null;String addrs=null;
				String ms=null;
				if(cookie!=null) {
					name=cookie[0].getValue();
					fname=cookie[1].getValue();
					addrs=cookie[2].getValue();
					ms=cookie[3].getValue();
					
				}
				
				
				
				String val1=req.getParameter("f2t1");
				String val2=req.getParameter("f2t2");
				
				pw.println("<h1>Fist form value "+name+" "+fname+" "+addrs+" "+ms+"</h1>");
				
				pw.println("<h1>Second form value"+val1+"  "+val2+"</h1>");
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		doGet(req, res);
	}

}
