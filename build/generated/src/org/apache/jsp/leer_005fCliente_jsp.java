package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import logica.Cliente;
import logica.Empleado;
import java.text.SimpleDateFormat;
import java.util.List;
import logica.Venta;
import logica.Controladora;
import logica.Controladora;

public final class leer_005fCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>Lista Clientes</title>\r\n");
      out.write("\t\t<meta charset=\"utf-8\" />\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/main.css\" />\r\n");
      out.write("                <link rel=\"stylesheet\" href=\"assets/css/leer.css\" />\r\n");
      out.write("\t\t<noscript><link rel=\"stylesheet\" href=\"assets/css/noscript.css\" /></noscript>\r\n");
      out.write("                \r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body >\r\n");
      out.write("\t\t<div id=\"page-wrapper\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Header -->\r\n");
      out.write("\t\t\t\t<div id=\"header\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- Inner -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"inner\">\r\n");
      out.write("\t\t\t\t\t\t\t<header>\r\n");
      out.write("                                                            <hr />\r\n");
      out.write("                                                            <p id=\"logo\" >*****</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h1><a href=\"\" id=\"logo\">HOTEL ALENDA</a></h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t<hr />\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</header>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("                                   \r\n");
      out.write("       \r\n");
      out.write("        <h1><--Cliente--></h1>\r\n");
      out.write("        <form action=\"leer_Cliente.jsp\" method=\"POST\">\r\n");
      out.write("                  <table class=\"default\" >\r\n");
      out.write("        \r\n");
      out.write("        <thead >\r\n");
      out.write("           <tr >\r\n");
      out.write("            <th >Nombre y Apellido</th>\r\n");
      out.write("            <th >Dirección</th>\r\n");
      out.write("            <th >DNI</th>\r\n");
      out.write("            <th >Fecha de Nacimiento</th>\r\n");
      out.write("            <th >Nacionalidad</th>\r\n");
      out.write("            <th >Celular</th>\r\n");
      out.write("            <th >E-mail</th>\r\n");
      out.write("            <th >Eliminar</th>\r\n");
      out.write("            <th >Modificar</th>           \r\n");
      out.write("          </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        \r\n");
      out.write("        <tbody>\r\n");
      out.write("            ");

                    HttpSession misesion = request.getSession();    
                    List <Cliente> listCliente = (List) request.getSession().getAttribute("listaCliente");
                    for (Cliente cliente : listCliente) {    
                                        
      out.write("\r\n");
      out.write("              \r\n");
      out.write("             <tr class=\"row100 body\">\r\n");
      out.write("                ");
String nombreCompl = cliente.getNombre()+" "+cliente.getApellido();
      out.write("\r\n");
      out.write("               <td class=\"cell100 column2\">");
      out.print(nombreCompl);
      out.write("</td>\r\n");
      out.write("               ");
String direccion = cliente.getDireccion();
      out.write("\r\n");
      out.write("               <td class=\"cell100 column3\">");
      out.print(direccion);
      out.write("</td>\r\n");
      out.write("               ");
String dni = cliente.getDni();
      out.write("\r\n");
      out.write("               <td class=\"cell100 column4\">");
      out.print(dni);
      out.write("</td>\r\n");
      out.write("               ");
Date fec_nac = cliente.getFec_nac();
      out.write("\r\n");
      out.write("               <td class=\"cell100 column5\">");
      out.print(fec_nac   );
      out.write("</td>\r\n");
      out.write("               ");
String nacionalidad = cliente.getNacionalidad();
      out.write("\r\n");
      out.write("               <td class=\"cell100 column6\">");
      out.print(nacionalidad);
      out.write("</td>\r\n");
      out.write("               ");
String celular = cliente.getCelular();
      out.write("\r\n");
      out.write("               <td class=\"cell100 column7\">");
      out.print(celular);
      out.write("</td>\r\n");
      out.write("               ");
String email = cliente.getEmail();
      out.write("\r\n");
      out.write("               <td class=\"cell100 column8\">");
      out.print(email);
      out.write("</td>\r\n");
      out.write("               ");
 int id_cliente = cliente.getId_Cliente();
      out.write("\r\n");
      out.write("                            \r\n");
      out.write("               <td>\r\n");
      out.write("                   <form name=\"frmeliminarcliente\" action=\"SvEliminaCliente\" method=\"POST\" style=\"display: inline\">\r\n");
      out.write("                       <button type=\"submit\" class=\"btn btn-danger btn-xs\" data-title=\"Delete\" style=\"display: inline\">Eliminar</button>                \r\n");
      out.write("                       <input type=\"hidden\" name=\"id\" value=\"");
      out.print(id_cliente);
      out.write("\">\r\n");
      out.write("                   </form>\r\n");
      out.write("               </td>\r\n");
      out.write("               <td>\r\n");
      out.write("                   <form name=\"frmmodificarcliente\" action=\"SvModificaCliente\" method=\"post\" style=\"display: inline\">\r\n");
      out.write("                       <input type=\"hidden\" name=\"id\" value=\"");
      out.print(id_cliente);
      out.write("\">\r\n");
      out.write("                       <button type=\"submit\" class=\"btn btn-prymari \" data-title=\"Edit\" style=\"display: inline\">Modificar</button>                \r\n");
      out.write("                   </form>\r\n");
      out.write("               </td>\r\n");
      out.write("               \r\n");
      out.write("            </tr >\r\n");
      out.write("            ");
 } 
      out.write("\r\n");
      out.write("        </tbody>        \r\n");
      out.write("      </table>\r\n");
      out.write("\t\t<a href=\"cliente.jsp\" data-page-id=\"1079705\" class=\"u-btn u-btn-round u-button-style u-radius-26 u-btn-3\" data-animation-name=\"\" data-animation-duration=\"0\" data-animation-delay=\"0\" data-animation-direction=\"\">REGRESAR</a>\r\n");
      out.write("        <div class=\"u-table u-table-responsive u-table-1\">\r\n");
      out.write("        </div>\t\t\t\t\r\n");
      out.write(" </div>\r\n");
      out.write("</form>     \r\n");
      out.write("  \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("                                               \r\n");
      out.write("<!-- Copyright -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"copyright\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li>&copy; WebSite.</li><li>Creada por Pancho <a href=\"https://www.facebook.com/francisco.alenda/\"></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Scripts -->\r\n");
      out.write("\t\t\t<script src=\"assets/js/jquery.min.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"assets/js/jquery.dropotron.min.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"assets/js/jquery.scrolly.min.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"assets/js/jquery.scrollex.min.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"assets/js/browser.min.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"assets/js/breakpoints.min.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"assets/js/util.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"assets/js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
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
