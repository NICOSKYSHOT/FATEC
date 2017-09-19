<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="br.com.redelem.bean.Usuario"%>
<%@page import="br.com.redelem.controler.UsuarioControler"%>

<%
    String login = request.getParameter("login");
    String senha = request.getParameter("senha");
    
    Usuario usu = new Usuario(0,"",login,senha,"","");
    UsuarioControler usucont = new UsuarioControler();
    
    usu = usucont.validaUsuario(usu);
    session.setAttribute("UsuarioLogado",usu);
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu - Rede Lembranças</title>
    </head>
    <style type="text/css">
        body{
            background-color: chartreuse;
            font-family: sans-serif;
            font-size: 26px;
            text-align: center;
        }
        
        table{
            margin: 0 auto;
        }
        
        a{
            text-decoration: none;
            color: snow;

        }
    </style>    
    <body>
        Opções: 
        <br>Usuarios -> |
        <a href="../usuario/consultarUsuario.jsp">Consultar (Alterar e Excluir)</a> |
        <a href="../usuario/inserirUsuario.jsp"> Inserir novo Usuario</a> |
        
        <% if (usu.getUtipo().equals("adm")) { %>
        <br>Acontecimentos -> |
        <a href="../acontecimento/consultarAcontecimento.jsp">Consultar (Alterar e Excluir)</a> |
        <a href="../acontecimento/inserirAcontecimento.jsp">Inserir novo Acontecimento</a> |
        <% } %>
        <br><br>
        
        <table border="0">
            <h1>Perfil Atual</h1>
            <tr>
                <td><b>ID:</b></td>
                <td> <%=usu.getUid()%> </td>
            </tr>    
             <tr>
                <td><b>Nome:</b></td>
                <td> <%=usu.getUnome()%></td>
            </tr>
            <tr>
                <td><b>Usuário:</b></td>
                <td> <%=usu.getUlogin()%> </td>
            </tr>
            <tr>
                <td><b>Senha:</b></td>
                <td> <%=usu.getUsenha()%></td>
            </tr>
            <tr>
                <td><b>Data de Nascimento:</b></td>
                <td> <%=usu.getUnasc()%></td>
            </tr>
            <tr>
                <td><b>Tipo:</b></td>
                <td> <%=usu.getUtipo()%></td>
            </tr>
        </table>
       
        <br><br><a href="../acesso/login.jsp">Voltar</a>
        
    </body>
</html>