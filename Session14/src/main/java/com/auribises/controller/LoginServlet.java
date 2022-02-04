package com.auribises.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import com.auribises.db.DB;
import com.auribises.model.User;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {

	DB db;
	
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("[LoginServlet] - init");
		db = DB.getDB();
	}

	
	public void destroy() {
		System.out.println("[LoginServlet] - destroy");
		db.closeConnection();
	}

	// Will handle only the post request from the client
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("[LoginServlet] - doPost");
		
		User user = new User();
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		String sql = user.toSelectSQL();
		
		System.out.println("[LoginServlet] "+user);
		System.out.println("[LoginServlet] "+sql);
		
		ResultSet set = db.executeQuery(sql);
		
		String message = "";
		
		try {
			if(set != null && set.next()) {
				user.uid = set.getInt("uid");
				user.name = set.getString("name");
				user.regsiteredOn = set.getString("regsiteredOn");
				message = user.name+" Logged In Successfully with UID: "+user.uid+" and registered on "+user.regsiteredOn;
			}else {
				message = user.email+" Invalid Login Credentials. Please Try Again";
			}
		}catch (Exception e) {
			System.out.println("Exception: "+e);
		}
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); // PrintWriter Object will write the response back to client
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html><body><center>");
		buffer.append("<h3>"+message+"</h3>");
		buffer.append("</center></body></html>");
		// Writing the response to the client
		out.print(buffer.toString());
		
	}

}

// Assignment1: Hash the passwords using java security package with MessageDigest API and SHA Algo
//			 2: Implelemt DAO in the current project :)
