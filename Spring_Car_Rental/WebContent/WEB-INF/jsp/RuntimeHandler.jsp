<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exception Page</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
</head>
<body>
	<h2>My Exception Handler</h2>
	Exception URL : ${url } Cause : ${msg } Stack Trace:
	<ul style="color: red; font-size: 0.85em;">
		<c:forEach items="${Exception.stackTrace}" var="item">
			<li><c:out value="${item}"></c:out></li>
		</c:forEach>
	</ul>
</body>
</html>