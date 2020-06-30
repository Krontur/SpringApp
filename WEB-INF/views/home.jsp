
<%@include file="/WEB-INF/views/include.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href='<c:url value="/resources/css/main.css"/>' rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><fmt:message key="title"/></title>
    </head>
    <body>
        <div class = "wrapper">
        <h1><fmt:message key="heading"/></h1>
        <h3>Reservas</h3>
        <table>
            <tr>
                <th>ID</th>
                <th>HOTEL</th>
                <th>MES RESERVA</th>
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
            
        </table>
        <br>
        <a class ="button" href="<c:out value="formulario.htm"/>">+Nueva Reserva</a>
        <a class = "button" href="<c:out value="consulta.htm" />">Consulta</a>
        <br><br>
        </div>
            
    </body>
</html>
