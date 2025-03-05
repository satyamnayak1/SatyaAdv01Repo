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
		//get writer
		PrintWriter pw=res.getWriter();
		
		//set coontent type
		res.setContentType("text/html");
		
		//Print the cookies
		
		
		Cookie [] cokies=req.getCookies();
		
		if(cokies!=null) {
			
			for(Cookie cokie:cokies) {
				
				pw.println("<h1>The value of cookies "+cokie.getName()+" "+cokie.getValue()+"</h1>");
				pw.println("<h1>cokie lengt"+cokies.length+"</h1>");
			}
			
			//close the stream
			pw.close();
			
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
