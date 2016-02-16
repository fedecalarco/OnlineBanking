<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>

<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
        <style type="text/css"><%@include file="/resources/css/styles.css" %></style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Online Banking ComunidadIT</title>
    </head>
    <body>
        <div class="container">
            <header>
                <%@include file="/resources/maquetacion/header.jsp" %>
            </header>
            <div class="container-fluid">
                <div><%@include file="/resources/maquetacion/barraSuperior.jsp" %></div>
                <div class="row">
                    <div>
                        <%@include file="/resources/maquetacion/menuIzquierdo.jsp" %>
                    </div>
                    <div class="col-md-8" id="tabla">
                        <h1>Resumen de cuenta</h1>
                        <h4>Titular: ${session_user.getPersona().getNombre()} ${session_user.getPersona().getApellido()}</h4>
                        <h4>Nº de cuenta: 648418/${session_user.getCuenta().getId()}</h4>
                        <h4>DNI: ${session_user.getPersona().getDni()}</h4>
                        <br>
                        <h4>Saldo: $${session_user.getCuenta().getSaldo()}</h4>
                        <h3>Ultimos movimientos</h3>
                        <table class="table table-hover" border="0">
                            <tr>
                                <th>Fecha</th>
                                <th>Movimiento</th>
                            </tr>
                            <c:forEach items="${session_user.getCuenta().getMovimietos()}" var="p">
                                <tr>
                                    <td>${p.fecha}</td>
                                    <td>${p.accion}</td>
                                </tr>
                            </c:forEach>
                        </table>
                    </div>
                    <div class="col-md-2" id="menuDerecha">
                        <br><br><br><br><br>
                        Signed in as <a href="#" class="navbar-link">${pageContext.request.remoteUser}</a>
                        <a href="<c:url value="/logout" />">Logout</a>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
