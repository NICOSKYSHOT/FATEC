<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.redelem.bean.Memoria"%>
<%@page import="br.com.redelem.controler.MemoriaControler"%>

<%
    String cod = request.getParameter("ID");
    int id = Integer.parseInt(cod);
    Memoria mem = new Memoria(id,0,0,"");
    MemoriaControler memCont = new MemoriaControler();
    mem = memCont.excluirMemoria(mem);
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exclusão de Usuario</title>
    </head>
    <body>
        <h1>Usuário Excluido! </h1>
        <a href="consultarMemoria.jsp"><b>Voltar</b>
    </body>
</html>
