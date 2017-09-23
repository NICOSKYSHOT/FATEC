<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.redelem.bean.Acontecimento"%>
<%@page import="br.com.redelem.bean.Usuario"%>
<%@page import="java.util.List"%>
<%@page import="br.com.redelem.controler.AcontecimentoControler"%>
<%@page import="br.com.redelem.controler.UsuarioControler"%>

<%
    String atitulo = request.getParameter("titulo");
    Acontecimento aco = new Acontecimento(0,atitulo,"","");
    AcontecimentoControler acocont = new AcontecimentoControler();
    List<Acontecimento> acos = acocont.listarAcontecimento(aco);
    
    
    Usuario  usu = new Usuario(0,"","","","","");
    UsuarioControler usucont = new UsuarioControler();
    List<Usuario> usus = usucont.listarUsuario(usu);
    Usuario usuLogado = (Usuario) session.getAttribute("UsuarioLogado");
%>

<html>
    <%//@include file="../../inc/materalizeWeb.inc" %>
    <title>Consulta Acontecimentos - Rede Lembranças</title>
    
    <style type="text/css">
        td { text-align: center; 
             font-family: courier}
    </style>
    
    <body>
        <h2>Lista de ADM - Rede Lembranças</h2>
        Obs: É necessário estar logado como uma conta de tipo "adm" para poder Excluir e Alterar 
        | <a href="../acesso/login.jsp"><b>Voltar</b></a>
        <table border="1" cellpadding="10" class="striped responsive-table">
            <thead>
              <tr>
                  <th data-field="Id">Código</th>
                  <th data-field="Nome">Título</th>
                  <th data-field="Login">Data</th>
                  <th data-field="Senha">Descrição</th>
                  <th data-field="Excluir">Excluir</th>
                  <th data-field="Alterar">Alterar</th>
              </tr>
            </thead>
            <% if (!(acos.isEmpty())) { %>    
                <tbody>
                    <% for (Acontecimento listaAcontecimento : acos) { %>
                        <tr>
                            <td><%=listaAcontecimento.getAcod()%></td>
                            <td><%=listaAcontecimento.getAtitulo()%></td>
                            <td><%=listaAcontecimento.getAdata()%></td>
                            <td><%=listaAcontecimento.getAinfo()%></td>
                            <% if (usuLogado.getUtipo().equals("adm")) { %>
                                <td><a href="excluirAcontecimento.jsp?COD=<%=listaAcontecimento.getAcod()%>">Excluir</a></td>
                                <td><a href="alterarAcontecimento.jsp?COD=<%=listaAcontecimento.getAcod()%>">Alterar</a></td>
                            <% } %>
                        </tr>
                    <% } %>
                </tbody>
            <% } %>
    </body>
</html>