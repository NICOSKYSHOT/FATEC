<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.redelem.bean.Acontecimento"%>
<%@page import="br.com.redelem.controler.AcontecimentoControler"%>

<%
    String cod = request.getParameter("COD");
    int id = Integer.parseInt(cod);
    Acontecimento aco = new Acontecimento(id,"","","");
    AcontecimentoControler acoCont = new AcontecimentoControler();
    aco = acoCont.buscarAcontecimento(aco);
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alterar Acontecimento - Rede Lembranças</title>
    </head>
    
    <style type="text/css">
        td { text-align: center; }
    </style>
    
    <body>
        <form name="alterarAcontecimento" action="validaAlterarAcontecimento.jsp" method="post">
            <h1>Formulário de Alteração</h1>
                
            <table border="0">
            <tr>
                <td><b>Título:</b></td>
                <td><input type="text" name="TIT" value="<%=aco.getAtitulo()%>"></td>
            </tr>
            <tr>
                <td><b>Data:</b></td>
                <td> <input type="text" name="DATA" value="<%=aco.getAdata()%>"> </td>
            </tr>
            <tr>
                <td><b>Info:</b></td>
                <td><input type="text-area" name="INFO" value="<%=aco.getAinfo()%>"></td>
            </tr>
            <tr>
                <td> <input type="HIDDEN" name="COD" value="<%=aco.getAcod()%>"></td>    
                <td><input type="submit" name="Enviar" value="ALTERAR"></td>
            </tr>
        </table>
            <a href="../../index.jsp"><b>Voltar</b></a>
        </form>
    </body>
</html>