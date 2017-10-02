<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.redelem.bean.Usuario"%>
<%@page import="br.com.redelem.controler.UsuarioControler"%>

<%
    String nome = request.getParameter("NOME");
    Usuario usu = new Usuario(0,nome,"","","","");
    UsuarioControler usucont = new UsuarioControler();
    List<Usuario> usus = usucont.listarUsuario(usu);
    Usuario usuLogado = (Usuario) session.getAttribute("UsuarioLogado");
%>

<html>
    <head>
    <title>Consulta Usuarios - Rede Lembranças</title>
    <link rel="stylesheet" type="text/css" href="../../css/stylesheet.css"/>
    </head>
    
    <body>
        <a href="../../index.jsp"> INDEX </a> |
        <a href="../acesso/login.jsp"> LOGIN </a> |
        <a href="consultarUsuario.jsp"> BUSCAR </a><br<br>
        <h2>Lista de Usuários - Rede Lembranças</h2>
        
        Obs: É necessário estar logado como uma conta de tipo "adm" para poder Excluir e Alterar <br><br>
       
        <table border="1" cellpadding="10" class="striped responsive-table">
            <thead>
              <tr>
                  <th data-field="Id">Id</th>
                  <th data-field="Nome">Nome</th>
                  <th data-field="Login">Login</th>
                  <th data-field="Senha">Senha</th>
                  <th data-field="Nasc">Data de Nascimento</th>
                  <th data-field="Tipo">Tipo</th>
                  <th data-field="Excluir">Excluir</th>
                  <th data-field="Alterar">Alterar</th>
              </tr>
            </thead>
            
            <% if (!(usus.isEmpty())) { %>    
                <tbody>
                    <% for (Usuario listaUsuario : usus) { %>
                        <tr>
                            <td><%=listaUsuario.getUid()%></td>
                            <td><%=listaUsuario.getUnome()%></td>
                            <td><%=listaUsuario.getUlogin()%></td>
                            <td><%=listaUsuario.getUsenha()%></td>
                            <td><%=listaUsuario.getUnasc()%></td>
                            <td><%=listaUsuario.getUtipo()%></td>
                            <% if (usuLogado.getUtipo().equals("adm")) { %>
                                <td><a href="excluirUsuario.jsp?COD=<%=listaUsuario.getUid()%>">[Excluir]</a></td>
                                <td><a href="alterarUsuario.jsp?COD=<%=listaUsuario.getUid()%>">[Alterar]</a></td>
                            <% } %>
                        </tr>
                    <% } %>
                </tbody>
            <% } %>
            
    </body>
</html>