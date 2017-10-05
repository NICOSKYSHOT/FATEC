<%@page import="java.util.List"%>
<%@page import="br.com.redelem.bean.Acontecimento"%>
<%@page import="br.com.redelem.bean.Usuario"%>
<%@page import="br.com.redelem.controler.UsuarioControler"%>
<%@page import="br.com.redelem.controler.AcontecimentoControler"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    AcontecimentoControler acoCont = new AcontecimentoControler();
    List<Acontecimento> acos = acoCont.listarTodosAcontecimento();
    
    UsuarioControler usuCont = new UsuarioControler();
    List<Usuario> usus = usuCont.listarTodosUsuario();
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../../css/stylesheet.css"/>
        <title>Inserir Memória - Rede Lembranças</title>
    </head>
    
        <div class="container"/>
            
            <form name="inseriMemoria" action="validaInserirMemoria.jsp" method="POST">
                <table>
                    <h1>Adicionar nova memória</h1>
                    <tr>
                        <td>Acontecimento:</td>
                        <td>
                            <select name ="MACOD">
                                <% for (Acontecimento aco : acos) { %>
                                    <option value="<%=aco.getAcod()%>"><%=aco.getAtitulo()%></option>
                                <% } %>
                            </select> 
                        </td>
                    </tr>
                    <tr>
                        <td>Usuario:</td>
                        <td>
                            <select name="MUID">
                                <% for (Usuario usu : usus) { %>
                                    <option value="<%=usu.getUid()%>"><%=usu.getUnome()%></option>
                                <% } %>
                            </select> 
                        </td>
                    </tr>
                    <tr>
                        <td>Lembrança:</td>
                        <td><input type="text" name="MCOM" value=""></td>
                    </tr>
                </table>    
                <input type="submit" name="Enviar" value="Enviar">  <br>
            </form>
        </div>                     
    
</html>
