<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.redelem.bean.Usuario"%>
<%@page import="br.com.redelem.controler.UsuarioControler"%>

<%
    String login = request.getParameter("login");
    Usuario  usu = new Usuario(0,"",login,"","","");
    UsuarioControler usucont = new UsuarioControler();
    List<Usuario> usus = usucont.listarUsuario(usu);
    Usuario usuLogado = (Usuario) session.getAttribute("UsuarioLogado");
%>

<html>
    <%//@include file="../../inc/materalizeWeb.inc" %>
    <title>Consulta Usuarios - Rede Lembranças</title>
    
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
        <h2>Lista de Usuários - Rede Lembranças</h2>
        Obs: É necessário estar logado como uma conta de tipo "adm" para poder Excluir e Alterar 
        | <a href="../acesso/login.jsp"><b>Voltar</b></a>
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
                                <td><a href="excluirUsuario.jsp?COD=<%=listaUsuario.getUid()%>">Excluir</a></td>
                                <td><a href="alterarUsuario.jsp?COD=<%=listaUsuario.getUid()%>">Alterar</a></td>
                            <% } %>
                        </tr>
                    <% } %>
                </tbody>
            <% } %>
    </body>
</html>