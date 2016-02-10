<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
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
                        <h1>Resumen de cuenta</h1>
                        <f:form action="update.html" modelAttribute="Usuario">

                            <input type="hidden" name="userId" value="${user.userId}"/>

                            <label for="usernameid">Username: </label>
                            <input type="text" name="username" value="${user.username}" id="usernameid"/>

                            <label for="passwordid">Password: </label>
                            <input type="password" name="password" id="passwordid" value="${user.password}"/>

                            <label for="emailid">Correo: </label>
                            <input type="email" name="email" id="emailid" value="${user.email}"/>

                            <label for="saldo">Saldo: </label>
                            <input type="text" name="cuenta.saldo" value="${user.getCuenta().getSaldo()}" id="saldo"/>

                            <br/>

                            <input type="submit" id="Save" value="Guardar"/>

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
