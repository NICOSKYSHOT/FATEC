<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inserir Usuario - Rede Lembranças</title>
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
        <form name="inserirUsuario" action="validaInserirUsuario.jsp" method="post">
            <h1>Formulário de Cadastro</h1>
                
            <table border="0">
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
           Obs: Tipo só pode ser redefinido em Alteração.
        </form>
    </body>
</html>
