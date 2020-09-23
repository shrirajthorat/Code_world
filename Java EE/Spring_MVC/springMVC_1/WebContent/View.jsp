<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<br><br>
	<h1>Person info</h1>
		<table border="1">
			<tr>
					<th align="left">Person Name</th>
					<th align="left">Address</th>
					<th align="left">Age</th>
			</tr>
			<tr>
					<td> ${mb.name}</td>
					<td> ${mb.address}</td>
					<td> ${mb.age}</td>
		</table>
		
			<br><br><br>
	<a href="person.do">Add more person</a>
</body>
</html>