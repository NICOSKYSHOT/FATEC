<%@page import="br.com.redelem.bean.Acontecimento"%>
<%@page import="br.com.redelem.bean.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String cod = request.getParameter("COD");
    int id = Integer.parseInt(cod);
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Inserir Acontecimento - Rede Lembranças</title>
    </head>
    
    
    <body>
        <form name="inserirAcontecimento" action="validaInserirMemoria.jsp" method="post">
            <h1>Formulário de Cadastro</h1>
                
            <table border="0">
            <tr>
                <td><b>Codigo do Acontecimento:</b></td>
                <td> <input type="text" name="ACOD" value=""><%String cod = request.getParameter("COD");%> </td>
            </tr>
            <tr>
                <td><b>Memória:</b></td>
                <td><input type="text" name="MEM" value=""></td>
            </tr>
            
            <tr>
                <td><b>Código do usuário:</b></td>
                <td><input type="text" name="UCOD" value=""></td>
                <td><a href="../usuario/consultarUsuario" target="_blank">Verificar Usuarios </a></td>
            </tr>
            <tr>
                    <input type="HIDDEN" name="ID" value=""></td>    
                <td><input type="submit" name="Enviar" value="CADASTRAR"></td>
            </tr>
        </table>
        <a href="../../index.jsp"><b>Voltar</b></a>
        </form>
    </body>
</html>
