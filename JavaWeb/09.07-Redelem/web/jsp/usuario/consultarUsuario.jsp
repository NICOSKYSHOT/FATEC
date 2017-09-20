<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../../css/stylesheet.css"/>
        <title>Consultar Usuario - Rede Lembranças</title>
    </head>
    
    <body>
        <a href="../../index.jsp"> INDEX </a> |
        <a href="login.jsp"> LOGIN </a><br<br>
        <h1>Busca por Usuário</h1>
        <form name="consultarUsuario" action="validaConsultarUsuario.jsp" method="post">
            Login (nome de usuário): <input type="text" name ="login" value="">
            <input type="submit" name ="Enviar" value="Buscar"><br>
        </form>
        <br>Obs: Não é obrigatório especificar o login<br>
    </body>
</html>
