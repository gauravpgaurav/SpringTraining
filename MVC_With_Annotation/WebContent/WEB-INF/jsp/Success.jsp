<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success Page</title>
</head>
<body>
	<b>One Car Rental booking With Following Details Added</b>
	<ul>
		<li>Book Number : ${bookObj.bookNumber}</li>
		<li>Book Subject : ${bookObj.subject}</li>
		<li>Book Name : ${bookObj.bookName}</li>
		<li>${bookObj.code}</li>
	</ul>

</body>
</html>