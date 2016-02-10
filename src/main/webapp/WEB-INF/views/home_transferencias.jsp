<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
        <style type="text/css">
            <%@include file="css/styles.css" %>
        </style> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Online Banking ComunidadIT</title>
    </head>




    <body>

        <div class="container">

            <header>
                <%@include file="maquetacion/header.jsp" %>
            </header>




            <div class="container-fluid">

                <div><%@include file="maquetacion/barraSuperior.jsp" %></div>



                <div class="row">
                    <div>
                        <%@include file="maquetacion/menuIzquierdo.jsp" %>

                    </div>

                    <div class="col-md-8" id="tabla">
                        <h1>Transferencias</h1>
                        <h3 style="color: green">${ok}</h3>
                        <f:form action="transferencia.html" modelAttribute="transferencia">

                            <input type="hidden" name="a" id="a" value="${session_user.getUserId()}"/><br>

                            <label for="b">Nº cuenta a depositar: </label> <br>
                            <input type="text" name="nroCuenta_destino" id="b" value=""/><br>

                            <label for="dinero">Cantidad: </label> <br>
                            <input type="text" name="dinero" id="dinero" value="0"/><br>


                            <input type="submit" class="btn btn-success btn-sm" value="Trasnferir"/>

                        </f:form>







                    </div>

                    <div class="col-md-2" id="menuDerecha">

                        <br><br><br><br><br>

                    </div>


                </div>




            </div>



        </div>
    </body>
</html>
