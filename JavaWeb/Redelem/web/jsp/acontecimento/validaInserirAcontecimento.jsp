<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.redelem.bean.Acontecimento"%>
<%@page import="br.com.redelem.controler.AcontecimentoControler"%>

<%
    String atitulo = request.getParameter("TIT");
    String adata = request.getParameter("DATA");
    String ainfo = request.getParameter("INFO");
    Acontecimento aco = new Acontecimento(0,atitulo,adata,ainfo);
    AcontecimentoControler acocont = new AcontecimentoControler();
    aco = acocont.inserirAcontecimento(aco);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../../css/stylesheet.css"/>
        <title>Confirmação de Cadastro</title>
    </head>
    
    <body>
        <h1>O seguinte Acontecimento foi Cadastrado:</h1>
        <table border="0">   
             <tr>
                <td><b>Titulo:</b></td>
                <td> <%=aco.getAtitulo()%></td>
            </tr>
            <tr>
                <td><b>Data:</b></td>
                <td> <%=aco.getAdata()%> </td>
            </tr>
            <tr>
                <td><b>Descrição:</b></td>
                <td> <%=aco.getAinfo()%></td>
            </tr>
        </table>
        <br><br>
        <a href="../../index.jsp"><b>Voltar</b></a>
    </body>
</html>
