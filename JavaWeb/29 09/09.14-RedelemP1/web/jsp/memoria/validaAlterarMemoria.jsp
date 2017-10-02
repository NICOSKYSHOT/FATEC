<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.redelem.bean.Acontecimento"%>
<%@page import="br.com.redelem.controler.AcontecimentoControler"%>

<%
    String cod = request.getParameter("COD");
    int acod = Integer.parseInt(cod);
    String atitulo = request.getParameter("TIT");
    String adata = request.getParameter("DATA");
    String ainfo = request.getParameter("INFO");

    Acontecimento aco = new Acontecimento(acod,atitulo,adata,ainfo);
    AcontecimentoControler acoCont = new AcontecimentoControler();
    aco = acoCont.alterarAcontecimento(aco);
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirmação de Alteração - Rede Lembranças</title>
    </head>
    <body>
        <h1>Alteração Realizada!</h1>
        <a href="consultarAcontecimento.jsp"><b>Voltar</b>
    </body>
</html>