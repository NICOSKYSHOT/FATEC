<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.redelem.bean.Usuario"%>
<%@page import="br.com.redelem.controler.UsuarioControler"%>

<%
    String cod = request.getParameter("ID");
    int uid = Integer.parseInt(cod);
    String unome = request.getParameter("NOME");
    String ulogin = request.getParameter("LOGIN");
    String usenha = request.getParameter("SENHA");
    String unasc = request.getParameter("NASC");
    String utipo = request.getParameter("TIPO");

    Usuario usu = new Usuario(uid,unome,ulogin,usenha,unasc,utipo);
    UsuarioControler usuCont = new UsuarioControler();
    usu = usuCont.alterarUsuario(usu);
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirmação de Alteração - Rede Lembranças</title>
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
        <h1>Alteração Realizada!</h1>
        <a href="consultarUsuario.jsp"><b>Voltar</b>
    </body>
</html>