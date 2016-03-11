<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enter Book Details</title>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
</head>
<body>

	<form:form method="Post" action="bookEntry.htm">
		<br>
		<hr>
		<label>Book Number :</label>
		<br>
		<form:input path="bookNumber" />
		<br>
		<br>
		<label>Subject :</label>
		<br>
		<form:select path="subject" items="${subjectCode}" />
		<br>
		<br>
		<label>Book Name :</label>
		<br>
		<form:input path="bookName" />
		<br>
		<hr>
		<input type="submit" value="Add">
	</form:form>
</body>
</html>