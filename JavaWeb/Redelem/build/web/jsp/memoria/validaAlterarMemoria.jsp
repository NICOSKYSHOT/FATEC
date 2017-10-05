<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.redelem.bean.Memoria"%>
<%@page import="br.com.redelem.controler.MemoriaControler"%>

<%
    int mcod = Integer.parseInt(request.getParameter("ID"));

    int muid = Integer.parseInt(request.getParameter("muid"));
    int macod = Integer.parseInt(request.getParameter("macod"));
    String mcom = request.getParameter("LEM");
    
    Memoria mem = new Memoria(mcod,muid,macod,mcom);
    MemoriaControler memCont = new MemoriaControler();
    mem = memCont.alterarMemoria(mem);
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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