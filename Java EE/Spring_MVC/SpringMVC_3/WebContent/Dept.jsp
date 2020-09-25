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
<form action="dept.do" method="post">
	<h1>Enter Location : <input type="text" name="loc"><br></h1>
	<h1><input type="submit" value="Submit"></h1>
	</form>
	
	<table border="1">
		<tr>
		<th align="left">no</th>
		<th align="left">Name</th>
		<th align="left">Location</th>
	</tr>
	<c:forEach var="comp"  items="${l}">
		<tr>
		<td> ${comp.deptno}</td>
			<td> ${comp.dname}</td>
			<td> ${comp.loc}</td>
		</tr>
		</c:forEach>
	</table>
	<br><br>
</body>
</html>