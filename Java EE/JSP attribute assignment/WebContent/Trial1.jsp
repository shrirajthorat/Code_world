<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
<%-- 	<%pageContext.setAttribute("module","java");%>
	<%out.println(pageContext.getAttribute("module")) ; %>
	

	
	<% request.setAttribute("uname","abc"); %>
	
	<%  out.println(request.getAttribute("uname")); %>
	<% request.setAttribute("user","admin"); %>
	<jsp:forward page="Trial2.jsp"/> 
	
	<--for session -->
	
	<% session.setAttribute("course","dac");%>
	<% out.println(session.getAttribute("course")); %>--%>

<% application.setAttribute("server","apache"); %>
<% out.println(application.getAttribute("server")); %>
	
</body>
</html>