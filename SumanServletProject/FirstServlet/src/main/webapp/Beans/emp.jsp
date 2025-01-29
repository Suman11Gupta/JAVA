<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <jsp:useBean class="Beans.EmpPojo" id="EmpPojo"/>
 		<jsp:setProperty property="empno" name="EmpPojo"/>
  		<jsp:setProperty property="ename" name="EmpPojo"/>

 
Hello <jsp:getProperty property="ename" name="EmpPojo"/>your ID
<jsp:getProperty property="empno" name="EmpPojo"/> is registered in our portel.
<% out.println(EmpPojo.getEname()); %>
</body>
</html>