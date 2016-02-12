<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
                <div class="row">
                    <div class="col-md-2">
                    </div>
                    <div class="col-md-7" id="imagen">
                        <img src="https://www.santanderrio.com.ar/common/images/nuevo-login-obp/login-ingreso-online-banking-baja.jpg" class="img-responsive"/>
                    </div>
                    <div class="col-md-3" id="login">
                        <h3 style="color: whitesmoke">Ingrese sus datos para operar</h3><br>
                        <p style="color:red">${ok}</p>
                        <f:form action="login/verificar.html" modelAttribute="Usuario">
                            <label style="color: whitesmoke" for="usernameid">Usuario: </label> <br/>
                            <input type="text" name="username" id="usernameid" value=""/><br/>
                            <label  style="color: whitesmoke" for="passwordid">Clave: </label><br/>
                            <input type="password" name="password" id="passwordid" value="" />
                            <br>
                            <br>
                            <input type="submit" class="btn btn-success btn-sm" value="Ingresar"/>
                            <a href="<c:url value="/user/registrar.html" />" class="btn btn-warning btn-sm" role="button">Crear cuenta</a> 
                        </f:form>
                        <br>
                        <br><br>
                        <br><br>
                        <br><br>
                        <br><br>
                        <br><br>
                        <br><br>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>