<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar Memória - Rede Lembranças</title>
        <link rel="stylesheet" type="text/css" href="../../css/stylesheet.css"/>
    </head>
    <body>
        <h1>Busca por Memória</h1>
        <form name="consultarAcontecimento" action="validaConsultarMemoria.jsp" method="post">
            Lembrança: <input type="text" name ="memo" value="">
            <input type="submit" name ="Enviar" value="Buscar"><br>
        </form>
        <br>Obs: Não é obrigatório especificar a lembrança<br>
        <a href="../../index.jsp"><b>Voltar</b></a>
    </body>
</html>
