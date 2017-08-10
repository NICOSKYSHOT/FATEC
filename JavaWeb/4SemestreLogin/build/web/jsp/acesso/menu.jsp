<%-- 
    Document   : menu
    Created on : 10/08/2017, 10:40:57
    Author     : Vitfl
--%>

<%@page import="br.com.fatec.bean.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String login = request.getParameter("login");
    String senha = request.getParameter("senha");
            
    Usuario usu = new Usuario();
    
    usu.setLogin(login);
    usu.setSenha(senha);
    
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MENU</title>
    </head>
    <body>
        <h1> Login = <%=usu.getLogin()%>;</h1><br>
        <h1> Senha = <%=usu.getSenha()%>;</h1>
    </body>
</html>