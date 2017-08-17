<%@page import="br.com.fatec.bean.Usuario"%>
<%@page import="br.com.fatec.controler.UsuarioControler"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% 
    String login = request.getParameter("login");
    String senha = request.getParameter("senha");
    String status = request.getParameter("status");
    String tipo = request.getParameter("tipo");
    
    Usuario usu = new Usuario(0,login,senha,status,tipo);
    %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
