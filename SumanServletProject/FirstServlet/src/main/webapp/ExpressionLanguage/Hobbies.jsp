<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4> Using JSP</h4>
	<% String user=request.getParameter("username"); %>
	Hello <% out.println(user); %>
	
	<h4> Using Expression Language</h4>
	Hello ${param.username}
	
	<ul>
		<li>${paramValues.hobbie[0]}
		<li>${paramValues.hobbie[1]}
		<li>${paramValues.hobbie[2]}
		<li>${paramValues.hobbie[3]}
	</ul>
</body>
</html>