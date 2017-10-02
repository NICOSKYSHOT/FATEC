package org.apache.jsp.jsp.acontecimento;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.redelem.bean.Acontecimento;
import br.com.redelem.controler.AcontecimentoControler;

public final class alterarAcontecimento_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String cod = request.getParameter("COD");
    int id = Integer.parseInt(cod);
    Acontecimento aco = new Acontecimento(id,"","","");
    AcontecimentoControler acoCont = new AcontecimentoControler();
    aco = acoCont.buscarAcontecimento(aco);

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Alterar Acontecimento - Rede Lembranças</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <style type=\"text/css\">\n");
      out.write("        td { text-align: center; }\n");
      out.write("    </style>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <form name=\"alterarAcontecimento\" action=\"validaAlterarAcontecimento.jsp\" method=\"post\">\n");
      out.write("            <h1>Formulário de Alteração</h1>\n");
      out.write("                \n");
      out.write("            <table border=\"0\">\n");
      out.write("            <tr>\n");
      out.write("                <td><b>Título:</b></td>\n");
      out.write("                <td><input type=\"text\" name=\"TIT\" value=\"");
      out.print(aco.getAtitulo());
      out.write("\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><b>Data:</b></td>\n");
      out.write("                <td> <input type=\"text\" name=\"DATA\" value=\"");
      out.print(aco.getAdata());
      out.write("\"> </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><b>Info:</b></td>\n");
      out.write("                <td><input type=\"text-area\" name=\"INFO\" value=\"");
      out.print(aco.getAinfo());
      out.write("\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td> <input type=\"HIDDEN\" name=\"ID\" value=\"");
      out.print(usu.getUid());
      out.write("\"></td>    \n");
      out.write("                <td><input type=\"submit\" name=\"Enviar\" value=\"ALTERAR\"></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("       \n");
      out.write("        <br><br>\n");
      out.write("            *Data de Nascimento<br><br>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
