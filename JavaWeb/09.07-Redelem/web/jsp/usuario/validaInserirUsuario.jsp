<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.redelem.bean.Usuario"%>
<%@page import="br.com.redelem.controler.UsuarioControler"%>

<%
    String nome = request.getParameter("NOME");
    String login = request.getParameter("LOGIN");
    String senha = request.getParameter("SENHA");
    String nasc = request.getParameter("NASC");
    String tipo = request.getParameter("TIPO");
    
    Usuario usu = new Usuario(0,nome,login,senha,nasc,tipo);
    
    UsuarioControler usucont = new UsuarioControler();
    usu = usucont.inserirUsuario(usu);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../../css/stylesheet.css"/>
        <title>Confirmação de Cadastro</title>
    </head>
    
    <body>
        <a href="../../index.jsp">INDEX</a> |
        <a href="../acesso/login.jsp">LOGIN</a><br><br>
        <h1>O seguinte Usuário foi Cadastrado:</h1>
        <table border="0">   
             <tr>
                <td><b>Nome:</b></td>
                <td> <%=usu.getUnome()%></td>
            </tr>
            <tr>
                <td><b>Login:</b></td>
                <td> <%=usu.getUlogin()%> </td>
            </tr>
            <tr>
                <td><b>Senha:</b></td>
                <td> <%=usu.getUsenha()%></td>
            </tr>
            <tr>
                <td><b>DDN*:</b></td>
                <td> <%=usu.getUnasc()%></td>
            </tr>
            <tr>
                <td><b>Tipo:</b></td>
                <td> <%=usu.getUtipo()%></td>
            </tr>
        </table>
        <br><br>
            *Data de Nascimento<br><br>
    </body>
</html>
