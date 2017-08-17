<%-- 
    Document   : inserirUsuario
    Created on : 17/08/2017, 09:49:49
    Author     : Vitfl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inserir - Sistema</title>
    </head>
    <body>
        <form name="inserirUsuario" action="validarInserirUsuario.jsp" method="post">
            Login: <input type="text" value="" name="login">
            Password: <input type="password" value="" name="senha"> 
            Status: <input type="text" value="" name="status">
            Tipo: <input type="text" value="" name="tipo"> 
            <input type="submit" name="enviar" value="OK">
        </form>
    </body>
</html>
