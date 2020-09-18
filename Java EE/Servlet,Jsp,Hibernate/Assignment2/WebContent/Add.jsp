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
	Enter roll no : <input type="number" name="no"> <br>
	Enter student name:<input type="text" name="name"> <br>
	Enter student address : <input type="text" name="add"> <br>
	Select persistent store :
	 <select name="Persistent">
  <option value="file">file </option>
  <option value="database">Database </option> 
  </select> <br>
	<input type="submit" value="Submit">
	</form>
</body>
</html>