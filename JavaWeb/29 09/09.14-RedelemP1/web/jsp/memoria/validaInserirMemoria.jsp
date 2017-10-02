
<%@page import="br.com.redelem.controler.MemoriaControler"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.redelem.bean.Acontecimento"%>
<%@page import="br.com.redelem.bean.Usuario"%>
<%@page import="br.com.redelem.bean.Memoria"%>
<%@page import="br.com.redelem.controler.AcontecimentoControler"%>

<%
    String mcom = request.getParameter("MEM");
    int muid = Integer.parseInt(request.getParameter("UCOD"));
    int macod = Integer.parseInt(request.getParameter("ACOD"));
    
    Memoria mem = new Memoria(0,mcom,muid,macod);
    MemoriaControler memcont = new MemoriaControlerS();
    mem = memcont.inserirMemoria(mem);
%>S
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirmação de Cadastro</title>
    </head>
    
    <body>
        <h1>O seguinte Acontecimento foi Cadastrado:</h1>
        <table border="0">   
             <tr>
                <td><b>Codigo:</b></td>
                <td> <%=mem.getMcod()%></td>
            </tr>
            <tr>
                <td><b>Memoria:</b></td>
                <td> <%=mem.getMcom()%> </td>
            </tr>
            <tr>
                <td><b>Codigo do Acontecimento:</b></td>
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
