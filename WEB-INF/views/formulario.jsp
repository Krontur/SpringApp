<%@include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href='<c:url value="/resources/css/main.css"/>' rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><fmt:message key="title"/></title>
    </head>
    <body>
        <div class ="wrapper">
        <h1><fmt:message key="formulario.heading"/></h1>
        <form:form method="post" commandName="addReserva">
             <table>
                <tr>
                    <td class="campos">Id de Reserva:</td>
                    <td>
                        <form:input path="id" readonly="true"/>
                    </td>
                    <td class="errores">
                        <form:errors path="id" cssClass="error"/>
                    </td>
                </tr>
                 <tr>
                    <td class="campos">Hotel:</td>
                    <td>
                        <form:input path="hotel"/>
                    </td>
                    <td class="errores">
                        <form:errors path="hotel" cssClass="error"/>
                    </td>
                </tr>
                <tr>
                    <td class="campos">Mes de la reserva:</td>
                    <td>
                        <form:input path="mes"/>
                    </td>
                    <td class="errores">
                        <form:errors path="mes" cssClass="error"/>
                    </td>
                </tr>
                <tr>
                    <td class="campos">Número de reservas:</td>
                    <td>
                        <form:input path="nreservas"/>
                    </td>
                    <td class="errores">
                        <form:errors path="nreservas" cssClass="error"/>
                    </td>
                </tr>
                <tr>
                    <td class="campos">Personas:</td>
                    <td>
                        <form:input path="pax"/>
                    </td>
                    <td class="errores">
                        <form:errors path="pax" cssClass="error"/>
                    </td>
                </tr>
                <tr>
                    <td class="campos">Coste:</td>
                    <td>
                        <form:input path="coste"/>
                    </td>
                    <td class="errores">
                        <form:errors path="coste" cssClass="error"/>
                    </td>
                </tr>
                <tr>
                    <td class="campos">Precio:</td>
                    <td>
                        <form:input path="precio"/>
                    </td>
                    <td class="errores">
                        <form:errors path="precio" cssClass="error"/>
                    </td>
                </tr>
            </table>
            <br>
            <input class ="button" type="submit" value="Añadir">
            <a class ="button" href="<c:url value="home.htm"/>">Volver</a>
        </form:form>
            <br><br>
        </div>
    </body>
</html>
