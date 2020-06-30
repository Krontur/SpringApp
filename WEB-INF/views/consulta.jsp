<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href='<c:url value="/resources/css/main.css"/>' rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Formulario de Consulta :: SpringApp</title>
</head>
<body>
<div class ="wrapper">
	<h1>Formulario de Consulta de Reservas</h1>
	<form:form method="post" commandName="consultaReserva">
		<form:select path="mes">
			<form:option value="enero">Enero</form:option>
			<form:option value="febrero">Febrero</form:option>
			<form:option value="marzo">Marzo</form:option>
			<form:option value="abril">Abril</form:option>
			<form:option value="mayo">Mayo</form:option>
			<form:option value="junio">Junio</form:option>
			<form:option value="julio">Julio</form:option>
			<form:option value="agosto">Agosto</form:option>
			<form:option value="septiembre">Septiembre</form:option>
			<form:option value="octubre">Octubre</form:option>
			<form:option value="noviembre">Noviembre</form:option>
			<form:option value="diciembre">Diciembre</form:option>
		</form:select>
			<br><br>
			<input class ="button" type="submit" value="Consultar">
			<a class ="button" href="<c:url value="home.htm"/>">Volver</a>
	</form:form><br>
</div>
</body>
</html>