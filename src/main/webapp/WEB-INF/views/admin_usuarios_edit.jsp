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




            <div class="container-fluid">


                <div><%@include file="/resources/maquetacion/barraSuperior.jsp" %></div>


                <div class="row">

                    <div>
                        <%@include file="/resources/maquetacion/menuIzquierdo.jsp" %>

                    </div>



                    <div class="col-md-8" id="tabla">
                        <h1>Resumen de cuenta</h1>
                        <f:form action="update" modelAttribute="Usuario">

                            <input type="hidden" name="userId" value="${user.userId}"/>

                            <label for="usernameid">Username: </label>
                            <input type="text" name="username" value="${user.username}" id="usernameid" class="input"/><br/>

                            <label for="passwordid">Password: </label>
                            <input type="password" name="password" id="passwordid" value="${user.password}" class="input"/><br/>

                            <label for="emailid">Correo: </label>
                            <input type="email" name="email" id="emailid" value="${user.email}" class="input"/><br/>

                            <label for="saldo">Saldo: </label>
                            <input type="text" name="cuenta.saldo" value="${user.getCuenta().getSaldo()}" id="saldo" class="input"/><br/>

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
