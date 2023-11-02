<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>JPS Tag Core</h1>
	<!--  Iteracion for each con jsp tag core c:forEach -->
	<c:forEach var="nombreVariableTemporal" items="${coleccionAIterar}"></c:forEach>
	<!--Condicional con jsp tag core c:if, si se cumple la condicion se muestra algo -->
	<c:if test="${VariableAnalizar>o<o=Numero}">
	${ejecutaesto} 
	</c:if>
	<!-- Switch case en jsp tag core C:Choose, c:when son los cases -->
	<c:choose>
	<c:when test="${VariableAnalizar>o<o=Numero}">${ejecutaesto}</c:when>
	<c:otherwise>${ejecutaestoOtro} </c:otherwise>
	</c:choose>

</body>
</html>