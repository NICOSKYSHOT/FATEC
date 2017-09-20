<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login - Rede Lembranças</title>
    </head>
    
    <body>
        <a href="../../index.jsp"><b>>> INDEX <<</b></a><br><br>
        <form name="login" action="menu.jsp" method="post">
            <table border="0">
            Formulário de Login
                <tr>
                    <td><b>Login:</b></td>
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