<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.redelem.bean.Usuario"%>
<%@page import="br.com.redelem.controler.UsuarioControler"%>

<%
    String nome = request.getParameter("nome");
    Usuario  usu = new Usuario(0,nome,"","","","");
    UsuarioControler usucont = new UsuarioControler();
    List<Usuario> usus = usucont.listarUsuario(usu);
    Usuario usuLogado = (Usuario) session.getAttribute("UsuarioLogado");
%>

<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>Consulta Usuarios - Rede Lembranças</title>
    <body>
        <h2>Lista de Usuários - Rede Lembranças</h2>
        Obs: É necessário estar logado como uma conta de tipo "adm" para poder Excluir e Alterar 
        | <a href="../acesso/login.jsp"><b>Voltar</b></a>
        <table class="striped responsive-table">
            <thead>
              <tr>
                  <th data-field="Id">Id</th>
                  <th data-field="Nome">Nome</th>
                  <th data-field="Login">Login</th>
                  <th data-field="Senha">Senha</th>
                  <th data-field="Status">Status</th>
                  <th data-field="Tipo">Tipo</th>
                  <th data-field="Excluir">Excluir</th>
                  <th data-field="Alterar">Alterar</th>
              </tr>
            </thead>
            <% if (!(usus.isEmpty())) { %>    
                <tbody>
                    <% for (Usuario listaUsuario : usus) { %>
                        <tr>
                            <td><%=listaUsuario.getId()%></td>
                            <td><%=listaUsuario.getNome()%></td>
                            <td><%=listaUsuario.getLogin()%></td>
                            <td><%=listaUsuario.getSenha()%></td>
                            <td><%=listaUsuario.getStatus()%></td>
                            <td><%=listaUsuario.getTipo()%></td>
                            <% if (usuLogado.getTipo().equals("adm")) { %>
                                <td><a href="excluirUsuario.jsp?COD=<%=listaUsuario.getId()%>">Excluir</a></td>
                                <td><a href="alterarUsuario.jsp?COD=<%=listaUsuario.getId()%>">Alterar</a></td>
                            <% } %>
                        </tr>
                    <% } %>
                </tbody>
            <% } %>
    </body>
</html>