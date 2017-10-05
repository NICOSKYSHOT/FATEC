<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../../css/stylesheet.css"/>
        <title>Inserir Usuario - Rede Lembranças</title>
    </head>
    
    <body>
         <a href="../../index.jsp">INDEX</a> |
         <a href="../acesso/login.jsp">LOGIN</a><br><br>
        
        <form name="inserirUsuario" action="validaInserirUsuario.jsp" method="post">

            <table border="0">
            Formulário de Cadastro
            <tr>
                <td><b>Nome:</b></td>
                <td><input type="text" name="NOME" value=""></td>
            </tr>
            <tr>
                <td><b>Login:</b></td>
                <td> <input type="text" name="LOGIN" value=""> </td>
            </tr>
            <tr>
                <td><b>Senha:</b></td>
                <td><input type="password" name="SENHA" value=""></td>
            </tr>
            <tr>
                <td><b>DDN*:</b></td>
                <td><input type="text" name="NASC" value=""></td>
            </tr>
            <tr>
                <td><b>Tipo:</b></td>
                <td>COMUM</td>
            </tr>
            <tr>
                <td><input type="HIDDEN" name="TIPO" value="comum">
                    <input type="HIDDEN" name="ID" value=""></td>    
                <td><input type="submit" name="Enviar" value="CADASTRAR"></td>
            </tr>
        </table>
            <br><br>
            *Data de Nascimento<br><br>
           Obs: Tipo só pode ser redefinido em Alteração por uma conta adm.
        </form>
    </body>
</html>
