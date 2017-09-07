<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.redelem.bean.Usuario"%>
<%@page import="br.com.redelem.controler.UsuarioControler"%>

<%
    String cod = request.getParameter("COD");
    int id = Integer.parseInt(cod);
    Usuario usu = new Usuario(id,"","","","","");
    UsuarioControler usuCont = new UsuarioControler();
    usu = usuCont.buscarUsuario(usu);
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alterar Usuario - Rede Lembranças</title>
    </head>
    <body>
        <form name="alterarUsuario" action="validaAlterarUsuario.jsp" method="post">
            <h1>Formulário de Alteração</h1>
                
            <table border="0">
            <tr>
                <td><b>Nome:</b></td>
                <td><input type="text" name="NOME" value="<%=usu.getNome()%>"></td>
            </tr>
            <tr>
                <td><b>Usuário:</b></td>
                <td> <input type="text" name="LOGIN" value="<%=usu.getLogin()%>"> </td>
            </tr>
            <tr>
                <td><b>Senha:</b></td>
                <td><input type="password" name="SENHA" value="<%=usu.getSenha()%>"></td>
            </tr>
            <tr>
                <td><b>Status:</b></td>
                <td><input type="text" name="STATUS" value="<%=usu.getStatus()%>"></td>
            </tr>
            <tr>
                <td><b>Tipo:</b></td>
                <td><input type="text" name="TIPO" value="<%=usu.getTipo()%>"></td>
            </tr>
            <tr>
                <td> <input type="HIDDEN" name="ID" value="<%=usu.getId()%>"></td>    
                <td><input type="submit" name="Enviar" value="ALTERAR"></td>
            </tr>
        </table>
       
            
        </form>
    </body>
</html>