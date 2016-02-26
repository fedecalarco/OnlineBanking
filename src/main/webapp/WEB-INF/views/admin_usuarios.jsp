<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/resources/maquetacion/taglibs.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
        <style type="text/css">
            <%@include file="/resources/css/styles.css" %>
        </style> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Online Banking ComunidadIT</title>
    </head>

    <body>

        <div class="container">

            <header>
                <%@include file="/resources/maquetacion/header.jsp" %>
            </header>



            <div class="container-fluid" > 


                <div><%@include file="/resources/maquetacion/barraSuperior.jsp" %></div>

                <div class="row">

                    <div>
                        <%@include file="/resources/maquetacion/menuIzquierdo.jsp" %>

                    </div>




                    <div class="col-md-8" id="tabla">
                        
                        <h2>Administracion de usuarios</h2>
                        <a href="<c:url value="/user/registrar"/>">Agregar</a>
                        <table class="table table-hover" border="0">
                            <tr>
                                <th>ID</th>
                                <th>Username</th>
                                <th>Contraseña</th>
                                <th>Email</th>
                                <th>Saldo</th>
                                <th>Accion</th>
                            </tr>
                            <c:forEach items="${lst}" var="p">
                                <tr>
                                    <td>${p.userId}</td>
                                    <td>${p.username}</td>
                                    <td>${p.password}</td>
                                    <td>${p.email}</td>
                                    <td>$ ${p.getCuenta().getSaldo()}</td>


                                    <td>
                                        <a href="edit?id=${p.userId}">Edit</a>
                                        <a href="remove?id=${p.userId}" onclick="return confirm('Estas seguro?')">Remove</a>
                                    </td>


                                </tr>
                            </c:forEach>



                        </table>

                    </div>
                        
                        <div class="col-md-2" id="menuDerecha">

                        <br><br><br><br><br>

                    </div>
                </div>
            </div>



        </div>






        




    </body>
</html>
