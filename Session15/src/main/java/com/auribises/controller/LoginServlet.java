package com.auribises.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import com.auribises.db.DB;
import com.auribises.model.User;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


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
		String urlToHome = "";
		String hiddenFormFieldsData="";
		
		try {
			if(set != null && set.next()) {
				user.uid = set.getInt("uid");
				user.name = set.getString("name");
				user.regsiteredOn = set.getString("regsiteredOn");
				
				message = user.name+" Logged In Successfully with UID: "+user.uid+" and registered on "+user.regsiteredOn;
				
				// 2. Session Tracking with URL ReWriting - Write the data
				String queryString = "Welcome?name="+user.name+"&email="+user.email+"&uid="+user.uid;
				
				urlToHome = "<p><a href='"+queryString+"'>Click to Navigate to Home</a></p>";
				
				// 1. Session Tracking with Cookies - Write the data
				Cookie cookie1 = new Cookie("keyName", user.name);
				Cookie cookie2 = new Cookie("keyEmail", user.email);
				Cookie cookie3 = new Cookie("keyUid", String.valueOf(user.uid));
				
				// We can customize the life of a cookie which is stored locally in the browser app 
				//cookie1.setMaxAge(1*60);
				
				response.addCookie(cookie1);
				response.addCookie(cookie2);
				response.addCookie(cookie3);
				
				// 2. Session Tracking with HttpSession - Write the data
				HttpSession session = request.getSession();
				session.setAttribute("keyUser", user);
				
				// 4. Session Tracking with Hidden Form Fields - Write the data
				hiddenFormFieldsData = "<form action='Welcome' method='post'>"
						+ "<input type='hidden' name='txtName' value='"+user.name+"'>"
						+ "<input type='hidden' name='txtEmail' value='"+user.email+"'>"
						+ "<input type='hidden' name='txtUid' value='"+user.uid+"'>"
						+ "<input type='submit' value='NAVIGATE TO HOME'>"
						+ "</form>";
				// Assignment: READ the DATA in HOME SERVLET for the Hiidern Form Fields :)
				
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
		buffer.append(urlToHome);
		buffer.append(hiddenFormFieldsData);
		buffer.append("</center></body></html>");
		// Writing the response to the client
		out.print(buffer.toString());
		
	}

}

// Assignment1: Hash the passwords using java security package with MessageDigest API and SHA Algo
//			 2: Implelemt DAO in the current project :)
