<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.redelem.bean.Usuario"%>
<%@page import="br.com.redelem.controler.UsuarioControler"%>

<%
    String cod = request.getParameter("ID");
    int id = Integer.parseInt(cod);
    String nome = request.getParameter("NOME");
    String login = request.getParameter("LOGIN");
    String senha = request.getParameter("SENHA");
    String status = request.getParameter("STATUS");
    String tipo = request.getParameter("TIPO");

    Usuario usu = new Usuario(id,nome,login,senha,status,tipo);
    UsuarioControler usuCont = new UsuarioControler();
    usu = usuCont.alterarUsuario(usu);
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirmação de Alteração - Rede Lembranças</title>
    </head>
    <body>
        <h1>Alteração Realizada!</h1>
        <a href="consultarUsuario.jsp"><b>Voltar</b>
    </body>
</html>