<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login - Rede Lembranças</title>
    </head>
    <body>
        <form name="login" action="menu.jsp" method="post">
            <table border="0">
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
        <a href="../../index.jsp">Voltar</a>
    </body>
</html>