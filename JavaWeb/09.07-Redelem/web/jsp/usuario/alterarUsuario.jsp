<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.redelem.bean.Usuario"%>
<%@page import="br.com.redelem.controler.UsuarioControler"%>

<%
    int id = Integer.parseInt(request.getParameter("COD"));
    //int id = Integer.parseInt(cod);
    Usuario usu = new Usuario(id,"","","","","");
    UsuarioControler usuCont = new UsuarioControler();
    usu = usuCont.buscarUsuario(usu);
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../../css/stylesheet.css"/>
        <title>Alterar Usuario - Rede Lembranças</title>
    </head>
    
    <body>
        <form name="alterarUsuario" action="validaAlterarUsuario.jsp" method="post">
            <h1>Formulário de Alteração</h1>
                
            <table border="0">
            <tr>
                <td><b>Nome:</b></td>
                <td><input type="text" name="NOME" value="<%=usu.getUnome()%>"></td>
            </tr>
            <tr>
                <td><b>Login:</b></td>
                <td> <input type="text" name="LOGIN" value="<%=usu.getUlogin()%>"> </td>
            </tr>
            <tr>
                <td><b>Senha:</b></td>
                <td><input type="password" name="SENHA" value="<%=usu.getUsenha()%>"></td>
            </tr>
            <tr>
                <td><b>DDN*:</b></td>
                <td><input type="text" name="NASC" value="<%=usu.getUnasc()%>"></td>
            </tr>
            <tr>
                <td><b>Tipo:</b></td>
                <td><input type="text" name="TIPO" value="<%=usu.getUtipo()%>"></td>
            </tr>
            <tr>
                <td> <input type="HIDDEN" name="ID" value="<%=usu.getUid()%>"></td>    
                <td><input type="submit" name="Enviar" value="ALTERAR"></td>
            </tr>
        </table>
       
        <br><br>
            *Data de Nascimento<br><br>
            <a href="../../index.jsp"><b>Voltar</b></a>
        </form>
    </body>
</html>