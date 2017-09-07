<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inserir Usuario - Rede Lembranças</title>
    </head>
    <body>
        <form name="inserirUsuario" action="validaInserirUsuario.jsp" method="post">
            <h1>Formulário de Cadastro</h1>
                
            <table border="0">
            <tr>
                <td><b>Nome:</b></td>
                <td><input type="text" name="NOME" value=""></td>
            </tr>
            <tr>
                <td><b>Usuário:</b></td>
                <td> <input type="text" name="LOGIN" value=""> </td>
            </tr>
            <tr>
                <td><b>Senha:</b></td>
                <td><input type="password" name="SENHA" value=""></td>
            </tr>

            <tr>
                <td><input type="HIDDEN" name="STATUS" value="">
                    <input type="HIDDEN" name="TIPO" value="comum">
                    <input type="HIDDEN" name="ID" value=""></td>    
                <td><input type="submit" name="Enviar" value="CADASTRAR"></td>
            </tr>
        </table>
           Obs: Status e Tipo só podem ser definidos em Alteração.
        </form>
    </body>
</html>
