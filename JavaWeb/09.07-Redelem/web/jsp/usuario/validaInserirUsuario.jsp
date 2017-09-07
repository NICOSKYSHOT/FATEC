<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.redelem.bean.Usuario"%>
<%@page import="br.com.redelem.controler.UsuarioControler"%>

<%
    String nome = request.getParameter("NOME");
    String login = request.getParameter("LOGIN");
    String senha = request.getParameter("SENHA");
    String status = request.getParameter("STATUS");
    String tipo = request.getParameter("TIPO");
    Usuario usu = new Usuario(0,login,nome,senha,status,tipo);
    UsuarioControler usucont = new UsuarioControler();
    usu = usucont.inserirUsuario(usu);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirmação de Cadastro</title>
    </head>
    <body>
        <h1>O seguinte Usuário foi Cadastrado:</h1>
        <table border="0">
           <tr>
                <td><b>ID:</b></td>
                <td> <%=usu.getId()%> </td>
            </tr>    
             <tr>
                <td><b>Nome:</b></td>
                <td> <%=usu.getNome()%></td>
            </tr>
            <tr>
                <td><b>Usuário:</b></td>
                <td> <%=usu.getLogin()%> </td>
            </tr>
            <tr>
                <td><b>Senha:</b></td>
                <td> <%=usu.getSenha()%></td>
            </tr>
            <tr>
                <td><b>Status:</b></td>
                <td> <%=usu.getStatus()%></td>
            </tr>
            <tr>
                <td><b>Tipo:</b></td>
                <td> <%=usu.getTipo()%></td>
            </tr>
        </table>
            
        <a href="../acesso/login.jsp"><b>Voltar</b></a>
    </body>
</html>
