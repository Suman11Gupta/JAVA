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
	 String color=request.getParameter("mycolor");
	int size=Integer.parseInt(request.getParameter("size"));
	out.println("<font color=>"+color+" size="+size+"Welcome to page context</font>");
	String s=String.valueOf(size);
	
	pageContext.setAttribute("format",s,PageContext.SESSION_SCOPE);
	pageContext.setAttribute("color",color,PageContext.APPLICATION_SCOPE);
	
	%>
	<a href="pageses.jsp">Please visit session page</a><br><br>
	<a href="applications.jsp">Please visit to check application session</a>
</body>
</html>