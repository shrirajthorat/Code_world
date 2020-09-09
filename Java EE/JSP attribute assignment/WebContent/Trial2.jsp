<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- <%out.println(pageContext.getAttribute("module")) ; %>
	

		<%  out.println(request.getAttribute("uname")); %>
		<%  out.println(request.getAttribute("user")); %> 
		
			<%  out.println(session.getAttribute("course")); %> --%>
			
			<% out.println(application.getAttribute("server")); %>
</body>
</html>