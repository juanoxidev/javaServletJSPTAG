
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- Seteamos los valores en datos -->
<c:set var="datos" value="Ana,Lopez,Directora,75000"></c:set>

<!-- Usamos la Function Split con el set, la function toma la variable datos, separa el string por ',' y retorna un array de strings que seteamos en la variable datosArray -->
<c:set var="datosArray" value="${fn:split(datos, ',')}"/>

<input type=text value="${datosArray[0]}"><br/>
<input type=text value="${datosArray[1]}"><br/>
<input type=text value="${datosArray[2]}"><br/>
<input type=text value="${datosArray[3]}"><br/>
</body>
</html>