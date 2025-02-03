<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  	<c:set var="name" value="${param.name }"/>
  	<c:set var="age" value="${param.age }"/>
  	
  	Hello <c:out value="${name }"></c:out>
  	<br>
  	<c:if test="${age>=18 }">
  	     Eligible for voting.
  	     </c:if>
  	     
  	<c:choose>
  		<c:when test="${age>=18 }">
  		Eligible for voting.
  		</c:when>
  		
  		<c:otherwise>
  		 Not Eligible for voting.
  		</c:otherwise>
  	</c:choose>     
</body>
</html>