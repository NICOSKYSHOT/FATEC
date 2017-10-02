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
    <a href="validaConsultarUsuario.jsp"></a>
        <link rel="stylesheet" type="text/css" href="../../css/stylesheet.css"/>
        <title>Confirmação de Alteração - Rede Lembranças</title>
    </head>
    <body>
        <a href="../../index.jsp">INDEX</a> |
        <a href="../acesso/login.jsp">LOGIN</a> |
        <a href="consultarUsuario.jsp">BUSCA</a><br><br>
        <h1>Alteração Realizada!</h1>
    </body>
</html>