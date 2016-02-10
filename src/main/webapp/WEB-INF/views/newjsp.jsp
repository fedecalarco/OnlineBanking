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
                        <h1>CUERPO</h1>
                        <--  
                        
                        CUERPO
                        
                        
                        
                        
                        
                        
                        
                        
                        ->
                    </div>
                    <div class="col-md-2" id="menuDerecha">
                        <br><br><br><br><br>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
