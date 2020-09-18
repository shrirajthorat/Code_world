<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="AddServlet" method="post">
		Product name : <input type="text" name="name"> <br>
		Product price : <input type="number" name="price" > <br>
		Product quantity : <input type="number" name="number"> <br>
		<input type="submit" value="Submit">
	</form>
</body>
</html>