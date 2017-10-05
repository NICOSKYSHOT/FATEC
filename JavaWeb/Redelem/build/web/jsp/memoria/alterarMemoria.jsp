<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.util.List"%>
<%@page import="br.com.redelem.bean.Memoria"%>
<%@page import="br.com.redelem.controler.MemoriaControler"%>
<%@page import="br.com.redelem.bean.Usuario"%>
<%@page import="br.com.redelem.controler.UsuarioControler"%>
<%@page import="br.com.redelem.bean.Acontecimento"%>
<%@page import="br.com.redelem.controler.AcontecimentoControler"%>

<%
    UsuarioControler usuCont = new UsuarioControler();
    List<Usuario> usus = usuCont.listarTodosUsuario();

    AcontecimentoControler acoCont = new AcontecimentoControler();
    List<Acontecimento> acos = acoCont.listarTodosAcontecimento();

    String cod = request.getParameter("ID");
    int id = Integer.parseInt(cod);
    
    Memoria mem = new Memoria(id,0,0,"");
    MemoriaControler memCont = new MemoriaControler();
    mem = memCont.buscarMemoria(mem);
    String mbusca = request.getParameter("MBUSCA");
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../../css/stylesheet.css"/>
        <title>Alterar Memória - Rede Lembranças</title>
    </head>
    <body>
     
        <form name="alterarUsuarioPessoa" action="validaAlterarMemoria.jsp" method="post">
            <h1>Formulário de Alteração</h1>
            
            <table>
                <tr>
                    <td>Usuario:</td>
                        <td>
                            <select NAME="muid" class="browser-default">
                                <% for (Usuario usu : usus) { %>
                                    <% if( usu.getUid() == mem.getMuid() ) { %>
                                        <option selected value="<%=usu.getUid()%>"><%=usu.getUnome()%></option>
                                    <% } else { %>
                                        <option value="<%=usu.getUid()%>"><%=usu.getUnome()%></option>
                                    <% } %>
                                <% } %>
                            </select> 
                        </td>
                </tr>
                <tr>
                        <td>Pessoa:</td>
                        <td>
                            <select NAME ="macod" class="browser-default">
                                <% for (Acontecimento aco : acos) { %>
                                    <% if( aco.getAcod()== mem.getMacod() ) { %>
                                        <option selected value="<%=aco.getAcod()%>"><%=aco.getAtitulo()%></option>
                                    <% } else { %>
                                        <option value="<%=aco.getAcod()%>"><%=aco.getAtitulo()%></option>
                                    <% } %>
                                <% } %>
                            </select> 
                        </td>
                    </tr>
                    <tr>
                        <td>Lembrança:</td>
                        <td><input type="text" name="LEM" value="<%=mem.getMcom()%>"></td>
                    </tr>
                </table>    
            <input type="HIDDEN" name="ID" value="<%=mem.getMcod()%>"> <br>
            <input type="submit" name="Enviar" value="OK">
        </form>
       
    </body>
</html>