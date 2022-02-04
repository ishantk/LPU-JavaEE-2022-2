package com.auribises.controller;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.auribises.db.DB;
import com.auribises.model.User;


public class RegisterServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	DB db;
	
	// executed when Servlet object is craeted by web server
	public void init(ServletConfig config) throws ServletException {
		System.out.println("[RegisterServlet] - init");
		db = DB.getDB();
	}

	// executed when Servlet object is removed by web server
	public void destroy() {
		System.out.println("[RegisterServlet] - destroy");
		db.closeConnection();
	}

	// executed when client sends the request to Servlet
	// handles both get and post request from the client
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[RegisterServlet] - service");
		
		// In service method, we have HttpServletRequest object from which we can extract data

		// 1. Create User Object
		User user = new User();
		
		// 2. Read data from Request and put it inside the User Object :)
		user.name = request.getParameter("txtName");
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		System.out.println("[RegisterServlet] "+user);
		
		String sql = user.toInsertSQL();
		System.out.println("[RegisterServlet] "+sql);

		// 3. Save the Data in DataBase -> MySQL :)
		int result = db.executeUpdate(sql);
		String message = result > 0 ? "Thank You for Your Registration: "+user.name : "Registration Failed: "+user.name;
		
		// 4. Send Response to the Client
		// Use HttpServletResponse to send text or HTML back to the client
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); // PrintWriter Object will write the response back to client
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html><body><center>");
		buffer.append("<h3>"+message+"</h3>");
		buffer.append("<p>Registered On: "+user.regsiteredOn+"</p>");
		buffer.append("</center></body></html>");
		// Writing the response to the client
		out.print(buffer.toString());
		
	}

}
