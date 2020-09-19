<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="DataServlet">
	Search By loc:- <input type="text" name="loc"> <br>
	<input type="submit" value="Submit" >
</form>

 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:forEach var="str" items="${list}">
Dept no : ${str.deptno} <br>
Dept name : ${str.dname} <br>
</c:forEach>

<br> <br>

</body>
</html>