<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/resources/maquetacion/taglibs.jsp" %>
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



            ${estado}
            <div class="container-fluid">



                <div class="row">
                    <div class="col-md-12" id="registro">

                        <f:form action="${pageContext.request.contextPath}/user/registrar" modelAttribute="Usuario">

                            <label for="usernameid">Username: </label><br/>
                            <input type="text" name="username" id="usernameid" value=""/><br/><br/>

                            <label for="passwordid">Password: </label><br/>
                            <input type="password" name="password" id="passwordid" value=""/><br/><br/>

                            <label for="emailid">Correo: </label><br/>
                            <input type="email" name="email" id="emailid" value=""/><br/><br/>

                            <label for="nombreid">Nombre: </label><br/>
                            <input type="text" name="Persona.nombre" id="nombreid" value=""/><br/><br/>

                            <label for="apellidoid">Apellido: </label><br/>
                            <input type="text" name="Persona.apellido" id="apellidoid" value=""/><br/><br/>

                            <label for="dniid">DNI:  </label><br/>
                            <input type="text" name="Persona.dni" id="diniid" value=""/><br/><br/>

                            <label for="telefonoid">Telefono: </label><br/>
                            <input type="text" name="Persona.telefono" id="telefonoid" value=""/><br/><br/>

                            <br/>
                            <a href="${pageContext.request.contextPath}/" class="btn btn-warning btn-lg" role="button">Cancelar</a> 
                            <input type="submit" class="btn btn-success btn-lg" value="Registrar"/>

                        </f:form>

                    </div>
                </div>

            </div>


        </div>

    </body>
</html>
