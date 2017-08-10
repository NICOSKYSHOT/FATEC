<%-- 
    Document   : login
    Created on : 10/08/2017, 10:06:05
    Author     : Vitfl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login -Sistema</title>
    </head>
    <body>
        <form name="login" action="menu.jsp" method="post">
            Login: <input type="text" value="" name="nome">
            Password: <input type="password" value="100" name="senha"> 
            <input type="submit" name="enviar" value="OK">
        </form>
    </body>
</html>
