<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar Usuario - Rede Lembranças</title>
    </head>
    <style type="text/css">
        body{
            background-color: chartreuse;
            font-family: sans-serif;
            font-size: 26px;
            text-align: center;
        }
        
        table{
            margin: 0 auto;
        }
        
        a{
            text-decoration: none;
            color: snow;

        }
    </style> 
    <body>
        <h1>Busca por Usuário</h1>
        <form name="consultarUsuario" action="validaConsultarUsuario.jsp" method="post">
            Login: <input type="text" name ="login" value="">
            <input type="submit" name ="Enviar" value="Buscar"><br>
        </form>
        <br>Obs: Não é obrigatório especificar o login<br>
        <a href="../../index.jsp"><b>Voltar</b></a>
    </body>
</html>
