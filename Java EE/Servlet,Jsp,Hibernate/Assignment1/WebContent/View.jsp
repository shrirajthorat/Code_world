
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:forEach var="str" items="${list}">
Product name : ${str.pname} <br>
Product Quantity : ${str.qty} <br>
Product price :	${str.price} <br> <br>
</c:forEach>

<br> <br>
<a href="Home.jsp">Go to home</a>

