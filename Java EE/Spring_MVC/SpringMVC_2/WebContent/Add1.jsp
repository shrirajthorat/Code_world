<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Entry</title>
</head>
<body>
<h1>Add New Product</h1>
<form:form method="post" modelAttribute="p">
Product Name:<br>
<form:input path="pname"/> <br><br>
Product price:<br><br>
<form:input path="price"/><br><br>
Product quantity : 
<form:input path="qty"/><br><br>
<input type=submit value="Add_Product"/>
</form:form>	
</body>
</html>







