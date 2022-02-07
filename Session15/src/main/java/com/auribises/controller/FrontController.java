package com.auribises.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class FrontController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); // PrintWriter Object will write the response back to client
		
		String typeOfRequest = request.getParameter("txtType");
		String urlPattern = "";
		
		
		if(typeOfRequest.equals("register")) {
			urlPattern = "Register.do";
		}else if(typeOfRequest.equals("login")) {
			urlPattern = "Auth";
		}else {
			out.print("Invalid Request");
		}
		
		if(!urlPattern.isEmpty()) {
			// RequestDispatcher API is used to send the request to the Servlet 
			// it takes input as the URL Pattern for the Servlet :)
			RequestDispatcher dispatcher = request.getRequestDispatcher(urlPattern);
			//dispatcher.forward(request, response);
			dispatcher.include(request, response);
		}
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html><body><center>");
		buffer.append("<h3>Welcome to Front Controller</h3>");
		buffer.append("</center></body></html>");
		out.print(buffer.toString());
	}

}
