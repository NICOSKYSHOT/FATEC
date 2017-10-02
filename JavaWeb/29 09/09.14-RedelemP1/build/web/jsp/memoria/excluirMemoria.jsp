<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.redelem.bean.Acontecimento"%>
<%@page import="br.com.redelem.controler.AcontecimentoControler"%>

<%
    String cod = request.getParameter("COD");
    int id = Integer.parseInt(cod);
    Acontecimento aco = new Acontecimento(id,"","","");
    AcontecimentoControler acoCont = new AcontecimentoControler();
    aco = acoCont.excluirAcontecimento(aco);
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exclusão de Usuario</title>
    </head>
    <body>
        <h1>Usuário Excluido! </h1>
        <a href="consultarAcontecimento.jsp"><b>Voltar</b>
    </body>
</html>
