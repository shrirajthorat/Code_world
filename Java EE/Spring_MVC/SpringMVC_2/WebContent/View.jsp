<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
		<th align="left">id</th>
		<th align="left">Name</th>
		<th align="left">Price</th>
		<th align="left">Quantity</th>
	</tr>
	<c:forEach var="comp"  items="${l}">
		<tr>
		<td> ${comp.pid}</td>
			<td> ${comp.pname}</td>
			<td> ${comp.price}</td>
			<td> ${comp.qty}</td>
		</tr>
		</c:forEach>
	</table>
	<br><br>
	<a href="Home.jsp">Go Home</a>

</body>
</html>