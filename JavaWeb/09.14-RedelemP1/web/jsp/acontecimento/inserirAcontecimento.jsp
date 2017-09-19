<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inserir Acontecimento - Rede Lembranças</title>
    </head>
    
    <style type="text/css">
        td { text-align: center; }
    </style>
    
    <body>
        <form name="inserirAcontecimento" action="validaInserirAcontecimento.jsp" method="post">
            <h1>Formulário de Cadastro</h1>
                
            <table border="0">
            <tr>
                <td><b>Titulo:</b></td>
                <td><input type="text" name="TIT" value=""></td>
            </tr>
            <tr>
                <td><b>Data:</b></td>
                <td> <input type="text" name="DATA" value=""> </td>
            </tr>
            <tr>
                <td><b>Info:</b></td>
                <td><input type="text" name="INFO" value=""></td>
            </tr>
            <tr>
                    <input type="HIDDEN" name="ID" value=""></td>    
                <td><input type="submit" name="Enviar" value="CADASTRAR"></td>
            </tr>
        </table>
        <a href="../../index.jsp"><b>Voltar</b></a>
        </form>
    </body>
</html>
