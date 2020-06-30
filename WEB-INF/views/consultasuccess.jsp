<%@ include file="/WEB-INF/views/include.jsp" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
        <link href='<c:url value="/resources/css/main.css"/>' rel="stylesheet">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Resultado de Consulta</title>
	</head>
<body>
<div class ="wrapper">	
	<h2> Resultado de busqueda </h2>
	<table>
            <tr>
                <th>ID</th>
                <th>HOTEL</th>
                <th>MES</th>
                <th>N.RESERVAS</th>
                <th>PERSONAS</th>
                <th>COSTE</th>
                <th>PRECIO</th>
            </tr>
            <c:forEach items="${model.reservas}" var="resv">
                <tr>
                    <td><c:out value="${resv.id}"/></td>
                    <td><c:out value="${resv.hotel}"/></td>
                    <td><c:out value="${resv.mes}"/></td>
                    <td><c:out value="${resv.nreservas}"/></td>
                    <td><c:out value="${resv.pax}"/></td>
                    <td><c:out value="${resv.coste}"/></td>
                    <td><c:out value="${resv.precio}"/></td>    
                </tr>
            </c:forEach>
        </table><br><br>
        <a class ="button" href="<c:url value="home.htm"/>">Volver</a><br><br>
	</div>
</body>
</html>