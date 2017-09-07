<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar Usuario - Rede Lembranças</title>
    </head>
    <body>
        <h1>Busca por Usuário</h1>
        <form name="consultarUsuario" action="validaConsultarUsuario.jsp" method="post">
            Nome: <input type="text" name ="nome" value="">
            <input type="submit" name ="Enviar" value="Buscar"><br>
        </form>
        <br>Obs: Não é obrigatório especificar o nome
    </body>
</html>
