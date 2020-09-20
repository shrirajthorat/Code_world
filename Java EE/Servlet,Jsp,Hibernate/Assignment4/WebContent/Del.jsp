<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<table border="2">
<c:forEach var="myvar" items="${l}">
<tr>
<td>
${myvar.name}
</td>
<td>
${myvar.fees}
</td>
<td>
${myvar.courseModule}
</td>
<td>
<a href="DelServ?id=${myvar.id}"> delete </a>
</td>
</tr></c:forEach></table>

</body>
</html>