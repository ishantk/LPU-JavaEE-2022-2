<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>   
<%@ page errorPage="errorpage.jsp" %> 
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JSP TAGS INTRODUCTION</title>
	<style type="text/css">
		.content{
			margin: auto;
			align-content: center;
			max-width: 500px;
		}
	</style>
</head>
<body>
	
	<div class="content">
		<h3>Welcome to JSP Page</h3>
	
		<ul>
			<li>Scriptlet Tag</li>
			<li>Declarative Tag</li>
			<li>Expression Tag</li>
		</ul>
		
		<%-- Name is: <% out.print(name); %>  error --%>
	
		<%-- <h3>Promo Code is: <% out.print(promoCode); %></h3> --%>
		
		<!-- Expression Tag-->
		<h3>Promo Code is: <%= promoCode %></h3>
		<h3>Discount on 1000 amount is: <%= getDiscount("JUMBO", 1000) %></h3>
	
		<%
			// Java Code goes here
			// we can access the variables declared here only below this sciptlet tag
			int age = 21;
			String name = "John Watson";
			
			/*if(age>18){
				// out is available impilicitly in the JSP Pages, which is used to write response to the client from Java Code
				out.print("John Can Vote");
			}else{
				out.print("John Can Not Vote");
			}*/
			
			if(age>18){
		%>
				<p><b><i>You Can VOTE, Dear <% out.print(name); %></i></b></p>
		<%		
			}else{
		%>
				<p><b><i>You Can Not VOTE</i></b></p>
		<%		
			}
		
		%>
		
		<%!
			String promoCode = "JUMBO";
			
			double getDiscount(String code, double amount){
				
				if(promoCode.equals(code) && amount >=500){
					return 0.40;
				}else{
					return 0.10;
				}
			}
			
			int[] cashBacks = {10, 20, 30, 50, 100};
		
		%>
		
		<h3>CashBack Earned is: <%= cashBacks[3] %></h3>
		
		<!-- Action Tags -->
		<jsp:include page="header.jsp"/>
		
		<!-- Assignment: 1: Explore useBean, setProperty and getProperty Action Tags
					2: Explore Session Tracking with JSP -->
					
		<%
		
			// response and session are available implicitly in JSP
		
			Cookie c1 = new Cookie("appName", "eStore");
			response.addCookie(c1);
			
			session.setAttribute("appName", "eStore");
			
		%>					
		
	
	</div>
	
	
	
</body>
</html>