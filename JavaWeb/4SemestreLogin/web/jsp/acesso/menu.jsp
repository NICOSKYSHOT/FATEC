<%@page import="br.com.fatec.bean.Usuario"%>
<%@page import="br.com.fatec.controler.UsuarioControler"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String login = request.getParameter("login");
    String senha = request.getParameter("senha");
            
    Usuario usu = new Usuario(0,login,senha,"","");
    
    usu.setLogin(login);
    usu.setSenha(senha);
    
    UsuarioControler usucont = new UsuarioControler();
    
    usu = usucont.validausuario(usu);
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MENU</title>
    </head>
    <body>
        <h1> Login = <%=usu.getLogin()%>;</h1><br>
        <h1> Senha = <%=usu.getSenha()%>;</h1><br>
        <h1> Status = <%=usu.getStatus()%>;</h1><br>
        <h1> Tipo = <%=usu.getTipo()%>;</h1><br>
        <a href="../usuario/inserirUsuario.jsp"> Inserir Usuário </a>
    </body>
</html>