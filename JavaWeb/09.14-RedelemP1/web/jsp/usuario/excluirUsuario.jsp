<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.redelem.bean.Usuario"%>
<%@page import="br.com.redelem.controler.UsuarioControler"%>

<%
    String cod = request.getParameter("COD");
    int id = Integer.parseInt(cod);
    Usuario usu = new Usuario(id,"","","","","");
    UsuarioControler usuCont = new UsuarioControler();
    usu = usuCont.excluirUsuario(usu);
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exclusão de Usuario</title>
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
        <h1>Usuário Excluido! </h1>
        <a href="consultarUsuario.jsp"><b>Voltar</b>
    </body>
</html>
