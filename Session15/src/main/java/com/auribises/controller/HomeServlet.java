package com.auribises.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import com.auribises.model.User;


public class HomeServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		// 2. Session Tracking with URL ReWriting - Read the data
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String uid = request.getParameter("uid");
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html><body><center>");
		buffer.append("<h3>Welcome to Home Dear User :)</h3>");
		buffer.append("<p>Its: "+new Date()+"</p>");
		
		// 1. Session Tracking with Cookies - Read the data
		// get all the cookies from the browser which are stored locally in it
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie : cookies) {
			buffer.append("<p>"+cookie.getName()+" | "+cookie.getValue()+"</p>");
		}

		// 3. Session Tracking with HttpSession - Read the data
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("keyUser");
		
		buffer.append("<p><b>[URL REWRTITNG] USER DETAILS: "+uid+" | "+name+" | "+email+"</b></p>");
		buffer.append("<p><b>[HTTP SESSION]  USER DETAILS: "+user.uid+" | "+user.name+" | "+user.email+" | "+user.regsiteredOn+"</b></p>");
		
		buffer.append("</center></body></html>");
		out.print(buffer.toString());
		
	}

}
