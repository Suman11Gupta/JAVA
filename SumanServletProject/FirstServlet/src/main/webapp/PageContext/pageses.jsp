<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String str=(String)pageContext.getAttribute("format",PageContext.SESSION_SCOPE);
	String color=(String)pageContext.getAttribute("color",PageContext.APPLICATION_SCOPE);
	
	int size=Integer.parseInt(str);
	
	out.println("<font size="+size+" color="+color+">Entered font size is (Session Scope) "+size+"</font>");
	out.println("<br><font color="+color+">Color attribute requested from application scope</font>");
	
	%>
</body>
</html>