	
	<%@ page import="java.util.*" %>
	
<% List l= (List)request.getAttribute("Shree"); %>

<%@ taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>

<a:forEach var="str" items="<%= l %>">
${str }
</a:forEach>

	
	
	
