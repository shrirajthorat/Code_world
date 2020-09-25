<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	.error
	{
		color:red;
	}
</style>
</head>
<body>
<h1>Login form</h1>
	<form:form method="post" modelAttribute="l">
	Username : <form:errors path="uname" cssClass="error"/> <br> 
		<form:input path="uname"/><br>
	Password : <form:errors  path="password" cssClass="error"/><br>
		<form:input path="password" /><br><br>
		<input type="submit" value="Login"/>
	</form:form>
</body>
</html>