<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar Acontecimento - Rede Lembranças</title>
    </head>
    <body>
        <h1>Busca por Acontecimento</h1>
        <form name="consultarAcontecimento" action="validaConsultarAcontecimento.jsp" method="post">
            Titulo: <input type="text" name ="titulo" value="">
            <input type="submit" name ="Enviar" value="Buscar"><br>
        </form>
        <br>Obs: Não é obrigatório especificar o nome<br>
        <a href="../../index.jsp"><b>Voltar</b></a>
    </body>
</html>
