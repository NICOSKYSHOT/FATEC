<%-- 
    Document   : excluirUsuario
    Created on : 31/08/2017, 09:57:18
    Author     : ProfAlexandre
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.fatec.bean.Usuario"%>
<%@page import="br.com.fatec.bean.PessoaFisica"%>
<%@page import="br.com.fatec.controler.UsuarioControler"%>

<%
    String cod = request.getParameter("COD");
    int id = Integer.parseInt(cod);
    Usuario usu = new Usuario(id,"","","","","");
    UsuarioControler usuCont = new UsuarioControler();
    usu = usuCont.buscarUsuario(usu);
    PessoaFisica pes = (PessoaFisica) usu.getPes();
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ALTERAR - SISTEMA</title>
    </head>
    <body>
        <form name="alterarUsuario" action="validaAlterarUsuario.jsp" method="post">
            Nome: <input type="text" name="NOME" value="<%=usu.getNome()%>"> <br>
            Login: <input type="text" name="LOGIN" value="<%=usu.getLogin()%>"> <br>
            Senha: <input type="password" name="SENHA" value="<%=usu.getSenha()%>"> <br>
            Status: <input type="text" name="STATUS" value="<%=usu.getStatus()%>"> <br>
            Tipo: <input type="text" name="TIPO" value="<%=usu.getTipo()%>"> <br>
            <input type="HIDDEN" name="ID" value="<%=usu.getId()%>"> <br>

            <input type="submit" name="Enviar" value="OK">
        </form>
    </body>
</html>