<%@page import="com.auribises.db.DB"%>
<%@ page import="com.auribises.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>REGISTER USER</title>

	<style type="text/css">
		.content{
			margin: auto;
			align-content: center;
			max-width: 500px;
			background-color: aqua;
		}
	</style>

</head>
<body>

	<div class="content">

		<%
			
			User user = new User();
		
			//request is available as implicit object i.e. it is the same HttpServlet Request Object
			user.name = request.getParameter("txtName");
			user.email = request.getParameter("txtEmail");
			user.password = request.getParameter("txtPassword");
			
			// Assignment: Implement DAO and use it with JSP Page for Database operations
			DB db = DB.getDB();
			String sql = user.toInsertSQL();
			int result = db.executeUpdate(sql);
			
			if(result>0){
		%>
			<h3>User Registered Successfully with Email: <%= user.email %> </h3>
			<jsp:forward page="tags.jsp"/>
		<%		
			}else{
		 %>
		 	<h3>User Not Registered</h3>
		 <%		
			}
		%>
	
	</div>

</body>
</html>