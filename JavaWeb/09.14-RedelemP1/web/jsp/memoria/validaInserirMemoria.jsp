
<%@page import="br.com.redelem.controler.MemoriaControler"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.redelem.bean.Acontecimento"%>
<%@page import="br.com.redelem.bean.Usuario"%>
<%@page import="br.com.redelem.bean.Memoria"%>
<%@page import="br.com.redelem.controler.AcontecimentoControler"%>

<%
    int muid = Integer.parseInt(request.getParameter("MUID"));
    int macod = Integer.parseInt(request.getParameter("MACOD"));
    String mcom = request.getParameter("MCOM");
    
    Memoria mem = new Memoria(0,muid,macod,mcom);
    MemoriaControler memcont = new MemoriaControler();
    mem = memcont.inserirMemoria(mem);
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../../css/stylesheet.css"/>
        <title>Confirmação de Cadastro</title>
    </head>
    
    <body>
        <h1>A seguinte memória foi Cadastrada:</h1>
        <table border="0">   
            <tr>
                <td><b>Lembrança:</b></td>
                <td> <%=mem.getMcom()%> </td>
            </tr>
            <tr>
                <td><b>Codigo do Usuário:</b></td>
                <td> <%=mem.getMuid()%></td>
            </tr>
            <tr>
                <td><b>Codigo do Acontecimento:</b></td>
                <td> <%=mem.getMacod()%></td>
            </tr>
            
        </table>
        <br><br>
        <a href="../../index.jsp"><b>Voltar</b></a>
    </body>
</html>
