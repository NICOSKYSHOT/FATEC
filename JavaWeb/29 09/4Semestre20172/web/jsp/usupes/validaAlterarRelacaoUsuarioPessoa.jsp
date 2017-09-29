<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.fatec.bean.UsuarioPessoa"%>
<%@page import="br.com.fatec.controler.UsuarioPessoaControler"%>

<%
    String cod = request.getParameter("ID");
    int id = Integer.parseInt(cod);
    int idUsuario = Integer.parseInt(request.getParameter("ID_USUARIO"));
    int idPessoa = Integer.parseInt(request.getParameter("ID_PESSOA"));
    String obs = request.getParameter("OBS");
    UsuarioPessoa usupes = new UsuarioPessoa(id,idUsuario,idPessoa,obs);
    UsuarioPessoaControler usupescont = new UsuarioPessoaControler();
    usupes = usupescont.alterarUsuarioPessoa(usupes);
%>    
    
    