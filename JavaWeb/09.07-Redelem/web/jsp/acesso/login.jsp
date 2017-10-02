<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../../css/stylesheet.css" />
        <title>Login - Rede Lembranças</title>
    </head>
    <body>
        <a href="../../index.jsp">INDEX</a> |
        <a href="../usuario/inserirUsuario.jsp">NOVA CONTA</a><br><br>
        
        
        <form name="login" action="menu.jsp" method="post">
            <table border="0">
                Formulário de Login
                <tr>
                    <td><b>Usuario:</b></td>
                    <td><input type="text" name="login" value=""></td>
                </tr>
                <tr>
                    <td><b>Senha:</b></td>
                    <td> <input type="password" name="senha" value=""> </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" name="Enviar" value="ENTRAR"></td>
                </tr>
            </table>
        </form>
    </body>
</html>