<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.redelem.bean.Usuario"%>
<%@page import="java.util.List"%>
<%@page import="br.com.redelem.bean.Memoria"%>
<%@page import="br.com.redelem.controler.MemoriaControler"%>

<%
    String com = request.getParameter("memo");
    Memoria mem = new Memoria(0,0,0,com);
    MemoriaControler memcont = new MemoriaControler();
    List<Memoria> mems = memcont.listarMemoria(mem);
  
    Usuario usuLogado = (Usuario) session.getAttribute("UsuarioLogado");
%>

<html>
    <head>
    <title>Consulta Memórias - Rede Lembranças</title>
    <link rel="stylesheet" type="text/css" href="../../css/stylesheet.css"/>
    </head>
    <body>
        <a href="../../index.jsp"> INDEX </a> |
        <a href="../acesso/login.jsp"> LOGIN </a> |
        <a href="consultarUsuario.jsp"> BUSCAR </a><br><br>
        <h2>Lista de Usuários - Rede Lembranças</h2>
        
        Obs: É necessário estar logado como uma conta de tipo "adm" para poder Excluir e Alterar <br><br>
       
        <table border="1" cellpadding="10" class="striped responsive-table">
            <thead>
              <tr>
                  <th data-field="imem">Código Memória</th>
                  <th data-field="caco">Código Acontecimento</th>
                  <th data-field="taco">Título Acontecimento</th>
                  <th data-field="idusu">Código Usuário</th>
                  <th data-field="nusu">Nome Usuário</th>
                  <th data-field="lem">Lembrança</th>
                  <th data-field="ex">Excluir</th>
                  <th data-field="al">Alterar</th>
              </tr>
            </thead>
            <% if (!(mems.isEmpty())) { %>    
                <tbody>
                    <% for (Memoria listaMemoria : mems) { %>
                        <tr>
                            <td><%=listaMemoria.getMcod()%></td>
                            <td><%=listaMemoria.getMacod()%></td>
                            <td><%=listaMemoria.getAco().getAtitulo()%></td>
                            <td><%=listaMemoria.getMuid()%></td>
                            <td><%=listaMemoria.getUsu().getUnome()%></td>       
                            <td><%=listaMemoria.getMcom()%></td>
                            <% if (usuLogado.getUtipo().equals("adm") || usuLogado.getUid()==listaMemoria.getMuid()) { %>
                                <td><a href="excluirMemoria.jsp?COD=<%=listaMemoria.getMcod()%>">Excluir</a></td>
                                <td><a href="alterarMemoria.jsp?COD=<%=listaMemoria.getMcod()%>">Alterar</a></td>
                            <% } %>
                        </tr>
                    <% } %>
                </tbody>
            <% } %>
    </body>
</html>