package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.lang.String;

public final class cliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html style=\"font-size: 16px;\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("         <title>Clientes</title>\n");
      out.write("\n");
      out.write("    <!-- inyecta los CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css\\nicepage.css\" media=\"screen\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css\\index.css\" media=\"screen\">\n");
      out.write("\n");
      out.write("    <!-- inyecta las fuentes de google -->   \n");
      out.write("    <link id=\"u-theme-google-font\" rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto+Condensed:300,300i,400,400i,700,700i|Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i\">\n");
      out.write("    <link id=\"u-page-google-font\" rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Lobster:400|Roboto+Condensed:300,300i,400,400i,700,700i\">\n");
      out.write("    \n");
      out.write("            \n");
      out.write("  </head>\n");
      out.write("  <body> \n");
      out.write("      ");
 
      HttpSession misession = request.getSession();
      String usu = (String) misession.getAttribute("usuario");
      if(usu == null){
          response.sendRedirect("login.jsp");
          
      }else{
      
      out.write("\n");
      out.write("    <section class=\"u-clearfix u-image u-typography-custom-page-typography-8--Introduction u-white u-section-1\" id=\"sec-a326\">\n");
      out.write("      <div class=\"u-clearfix u-sheet u-sheet-1\">\n");
      out.write("        <h1 class=\"u-custom-font u-font-lobster u-text u-text-white u-title u-text-1\">Bienvenidos</h1>\n");
      out.write("        <h1 class=\"u-text u-text-white u-text-2\">HOTEL <span style=\"font-weight: 700;\">ALENDA</span></h1>\n");
      out.write("            <!--Estrellas sobre el logo Alenda-->\n");
      out.write("            <span class=\"u-icon u-icon-circle u-text-white u-icon-1\"><svg class=\"u-svg-link\" preserveAspectRatio=\"xMidYMin slice\" viewBox=\"0 0 49.94 49.94\" style=\"\"><use xlink:href=\"#svg-5bd9\"></use></svg><svg class=\"u-svg-content\" viewBox=\"0 0 49.94 49.94\" x=\"0px\" y=\"0px\" id=\"svg-5bd9\" style=\"enable-background:new 0 0 49.94 49.94;\"><path d=\"M48.856,22.731c0.983-0.958,1.33-2.364,0.906-3.671c-0.425-1.307-1.532-2.24-2.892-2.438l-12.092-1.757\n");
      out.write("            c-0.515-0.075-0.96-0.398-1.19-0.865L28.182,3.043c-0.607-1.231-1.839-1.996-3.212-1.996c-1.372,0-2.604,0.765-3.211,1.996\n");
      out.write("            L16.352,14c-0.23,0.467-0.676,0.79-1.191,0.865L3.069,16.623C1.71,16.82,0.603,17.753,0.178,19.06\n");
      out.write("            c-0.424,1.307-0.077,2.713,0.906,3.671l8.749,8.528c0.373,0.364,0.544,0.888,0.456,1.4L8.224,44.702\n");
      out.write("            c-0.232,1.353,0.313,2.694,1.424,3.502c1.11,0.809,2.555,0.914,3.772,0.273l10.814-5.686c0.461-0.242,1.011-0.242,1.472,0\n");
      out.write("            l10.815,5.686c0.528,0.278,1.1,0.415,1.669,0.415c0.739,0,1.475-0.231,2.103-0.688c1.111-0.808,1.656-2.149,1.424-3.502\n");
      out.write("            L39.651,32.66c-0.088-0.513,0.083-1.036,0.456-1.4L48.856,22.731z M37.681,32.998l2.065,12.042c0.104,0.606-0.131,1.185-0.629,1.547\n");
      out.write("            c-0.499,0.361-1.12,0.405-1.665,0.121l-10.815-5.687c-0.521-0.273-1.095-0.411-1.667-0.411s-1.145,0.138-1.667,0.412l-10.813,5.686\n");
      out.write("            c-0.547,0.284-1.168,0.24-1.666-0.121c-0.498-0.362-0.732-0.94-0.629-1.547l2.065-12.042c0.199-1.162-0.186-2.348-1.03-3.17\n");
      out.write("            L2.48,21.299c-0.441-0.43-0.591-1.036-0.4-1.621c0.19-0.586,0.667-0.988,1.276-1.077l12.091-1.757\n");
      out.write("            c1.167-0.169,2.176-0.901,2.697-1.959l5.407-10.957c0.272-0.552,0.803-0.881,1.418-0.881c0.616,0,1.146,0.329,1.419,0.881\n");
      out.write("            l5.407,10.957c0.521,1.058,1.529,1.79,2.696,1.959l12.092,1.757c0.609,0.089,1.086,0.491,1.276,1.077\n");
      out.write("            c0.19,0.585,0.041,1.191-0.4,1.621l-8.749,8.528C37.866,30.65,37.481,31.835,37.681,32.998z\"></path></svg>\n");
      out.write("            </span>\n");
      out.write("\n");
      out.write("            <span class=\"u-icon u-icon-circle u-text-white u-icon-2\"><svg class=\"u-svg-link\" preserveAspectRatio=\"xMidYMin slice\" viewBox=\"0 0 49.94 49.94\" style=\"\"><use xlink:href=\"#svg-c012\"></use></svg><svg class=\"u-svg-content\" viewBox=\"0 0 49.94 49.94\" x=\"0px\" y=\"0px\" id=\"svg-c012\" style=\"enable-background:new 0 0 49.94 49.94;\"><path d=\"M48.856,22.731c0.983-0.958,1.33-2.364,0.906-3.671c-0.425-1.307-1.532-2.24-2.892-2.438l-12.092-1.757\n");
      out.write("            c-0.515-0.075-0.96-0.398-1.19-0.865L28.182,3.043c-0.607-1.231-1.839-1.996-3.212-1.996c-1.372,0-2.604,0.765-3.211,1.996\n");
      out.write("            L16.352,14c-0.23,0.467-0.676,0.79-1.191,0.865L3.069,16.623C1.71,16.82,0.603,17.753,0.178,19.06\n");
      out.write("            c-0.424,1.307-0.077,2.713,0.906,3.671l8.749,8.528c0.373,0.364,0.544,0.888,0.456,1.4L8.224,44.702\n");
      out.write("            c-0.232,1.353,0.313,2.694,1.424,3.502c1.11,0.809,2.555,0.914,3.772,0.273l10.814-5.686c0.461-0.242,1.011-0.242,1.472,0\n");
      out.write("            l10.815,5.686c0.528,0.278,1.1,0.415,1.669,0.415c0.739,0,1.475-0.231,2.103-0.688c1.111-0.808,1.656-2.149,1.424-3.502\n");
      out.write("            L39.651,32.66c-0.088-0.513,0.083-1.036,0.456-1.4L48.856,22.731z M37.681,32.998l2.065,12.042c0.104,0.606-0.131,1.185-0.629,1.547\n");
      out.write("            c-0.499,0.361-1.12,0.405-1.665,0.121l-10.815-5.687c-0.521-0.273-1.095-0.411-1.667-0.411s-1.145,0.138-1.667,0.412l-10.813,5.686\n");
      out.write("            c-0.547,0.284-1.168,0.24-1.666-0.121c-0.498-0.362-0.732-0.94-0.629-1.547l2.065-12.042c0.199-1.162-0.186-2.348-1.03-3.17\n");
      out.write("            L2.48,21.299c-0.441-0.43-0.591-1.036-0.4-1.621c0.19-0.586,0.667-0.988,1.276-1.077l12.091-1.757\n");
      out.write("            c1.167-0.169,2.176-0.901,2.697-1.959l5.407-10.957c0.272-0.552,0.803-0.881,1.418-0.881c0.616,0,1.146,0.329,1.419,0.881\n");
      out.write("            l5.407,10.957c0.521,1.058,1.529,1.79,2.696,1.959l12.092,1.757c0.609,0.089,1.086,0.491,1.276,1.077\n");
      out.write("            c0.19,0.585,0.041,1.191-0.4,1.621l-8.749,8.528C37.866,30.65,37.481,31.835,37.681,32.998z\"></path></svg>\n");
      out.write("            </span>\n");
      out.write("\n");
      out.write("            <span class=\"u-icon u-icon-circle u-text-white u-icon-3\"><svg class=\"u-svg-link\" preserveAspectRatio=\"xMidYMin slice\" viewBox=\"0 0 49.94 49.94\" style=\"\"><use xlink:href=\"#svg-55c1\"></use></svg><svg class=\"u-svg-content\" viewBox=\"0 0 49.94 49.94\" x=\"0px\" y=\"0px\" id=\"svg-55c1\" style=\"enable-background:new 0 0 49.94 49.94;\"><path d=\"M48.856,22.731c0.983-0.958,1.33-2.364,0.906-3.671c-0.425-1.307-1.532-2.24-2.892-2.438l-12.092-1.757\n");
      out.write("            c-0.515-0.075-0.96-0.398-1.19-0.865L28.182,3.043c-0.607-1.231-1.839-1.996-3.212-1.996c-1.372,0-2.604,0.765-3.211,1.996\n");
      out.write("            L16.352,14c-0.23,0.467-0.676,0.79-1.191,0.865L3.069,16.623C1.71,16.82,0.603,17.753,0.178,19.06\n");
      out.write("            c-0.424,1.307-0.077,2.713,0.906,3.671l8.749,8.528c0.373,0.364,0.544,0.888,0.456,1.4L8.224,44.702\n");
      out.write("            c-0.232,1.353,0.313,2.694,1.424,3.502c1.11,0.809,2.555,0.914,3.772,0.273l10.814-5.686c0.461-0.242,1.011-0.242,1.472,0\n");
      out.write("            l10.815,5.686c0.528,0.278,1.1,0.415,1.669,0.415c0.739,0,1.475-0.231,2.103-0.688c1.111-0.808,1.656-2.149,1.424-3.502\n");
      out.write("            L39.651,32.66c-0.088-0.513,0.083-1.036,0.456-1.4L48.856,22.731z M37.681,32.998l2.065,12.042c0.104,0.606-0.131,1.185-0.629,1.547\n");
      out.write("            c-0.499,0.361-1.12,0.405-1.665,0.121l-10.815-5.687c-0.521-0.273-1.095-0.411-1.667-0.411s-1.145,0.138-1.667,0.412l-10.813,5.686\n");
      out.write("            c-0.547,0.284-1.168,0.24-1.666-0.121c-0.498-0.362-0.732-0.94-0.629-1.547l2.065-12.042c0.199-1.162-0.186-2.348-1.03-3.17\n");
      out.write("            L2.48,21.299c-0.441-0.43-0.591-1.036-0.4-1.621c0.19-0.586,0.667-0.988,1.276-1.077l12.091-1.757\n");
      out.write("            c1.167-0.169,2.176-0.901,2.697-1.959l5.407-10.957c0.272-0.552,0.803-0.881,1.418-0.881c0.616,0,1.146,0.329,1.419,0.881\n");
      out.write("            l5.407,10.957c0.521,1.058,1.529,1.79,2.696,1.959l12.092,1.757c0.609,0.089,1.086,0.491,1.276,1.077\n");
      out.write("            c0.19,0.585,0.041,1.191-0.4,1.621l-8.749,8.528C37.866,30.65,37.481,31.835,37.681,32.998z\"></path></svg>\n");
      out.write("            </span>\n");
      out.write("\n");
      out.write("            <span class=\"u-icon u-icon-circle u-text-white u-icon-4\"><svg class=\"u-svg-link\" preserveAspectRatio=\"xMidYMin slice\" viewBox=\"0 0 49.94 49.94\" style=\"\"><use xlink:href=\"#svg-30b0\"></use></svg><svg class=\"u-svg-content\" viewBox=\"0 0 49.94 49.94\" x=\"0px\" y=\"0px\" id=\"svg-30b0\" style=\"enable-background:new 0 0 49.94 49.94;\"><path d=\"M48.856,22.731c0.983-0.958,1.33-2.364,0.906-3.671c-0.425-1.307-1.532-2.24-2.892-2.438l-12.092-1.757\n");
      out.write("            c-0.515-0.075-0.96-0.398-1.19-0.865L28.182,3.043c-0.607-1.231-1.839-1.996-3.212-1.996c-1.372,0-2.604,0.765-3.211,1.996\n");
      out.write("            L16.352,14c-0.23,0.467-0.676,0.79-1.191,0.865L3.069,16.623C1.71,16.82,0.603,17.753,0.178,19.06\n");
      out.write("            c-0.424,1.307-0.077,2.713,0.906,3.671l8.749,8.528c0.373,0.364,0.544,0.888,0.456,1.4L8.224,44.702\n");
      out.write("            c-0.232,1.353,0.313,2.694,1.424,3.502c1.11,0.809,2.555,0.914,3.772,0.273l10.814-5.686c0.461-0.242,1.011-0.242,1.472,0\n");
      out.write("            l10.815,5.686c0.528,0.278,1.1,0.415,1.669,0.415c0.739,0,1.475-0.231,2.103-0.688c1.111-0.808,1.656-2.149,1.424-3.502\n");
      out.write("            L39.651,32.66c-0.088-0.513,0.083-1.036,0.456-1.4L48.856,22.731z M37.681,32.998l2.065,12.042c0.104,0.606-0.131,1.185-0.629,1.547\n");
      out.write("            c-0.499,0.361-1.12,0.405-1.665,0.121l-10.815-5.687c-0.521-0.273-1.095-0.411-1.667-0.411s-1.145,0.138-1.667,0.412l-10.813,5.686\n");
      out.write("            c-0.547,0.284-1.168,0.24-1.666-0.121c-0.498-0.362-0.732-0.94-0.629-1.547l2.065-12.042c0.199-1.162-0.186-2.348-1.03-3.17\n");
      out.write("            L2.48,21.299c-0.441-0.43-0.591-1.036-0.4-1.621c0.19-0.586,0.667-0.988,1.276-1.077l12.091-1.757\n");
      out.write("            c1.167-0.169,2.176-0.901,2.697-1.959l5.407-10.957c0.272-0.552,0.803-0.881,1.418-0.881c0.616,0,1.146,0.329,1.419,0.881\n");
      out.write("            l5.407,10.957c0.521,1.058,1.529,1.79,2.696,1.959l12.092,1.757c0.609,0.089,1.086,0.491,1.276,1.077\n");
      out.write("            c0.19,0.585,0.041,1.191-0.4,1.621l-8.749,8.528C37.866,30.65,37.481,31.835,37.681,32.998z\"></path></svg>\n");
      out.write("            </span>\n");
      out.write("\n");
      out.write("            <span class=\"u-icon u-icon-circle u-text-white u-icon-5\"><svg class=\"u-svg-link\" preserveAspectRatio=\"xMidYMin slice\" viewBox=\"0 0 49.94 49.94\" style=\"\"><use xlink:href=\"#svg-86b8\"></use></svg><svg class=\"u-svg-content\" viewBox=\"0 0 49.94 49.94\" x=\"0px\" y=\"0px\" id=\"svg-86b8\" style=\"enable-background:new 0 0 49.94 49.94;\"><path d=\"M48.856,22.731c0.983-0.958,1.33-2.364,0.906-3.671c-0.425-1.307-1.532-2.24-2.892-2.438l-12.092-1.757\n");
      out.write("            c-0.515-0.075-0.96-0.398-1.19-0.865L28.182,3.043c-0.607-1.231-1.839-1.996-3.212-1.996c-1.372,0-2.604,0.765-3.211,1.996\n");
      out.write("            L16.352,14c-0.23,0.467-0.676,0.79-1.191,0.865L3.069,16.623C1.71,16.82,0.603,17.753,0.178,19.06\n");
      out.write("            c-0.424,1.307-0.077,2.713,0.906,3.671l8.749,8.528c0.373,0.364,0.544,0.888,0.456,1.4L8.224,44.702\n");
      out.write("            c-0.232,1.353,0.313,2.694,1.424,3.502c1.11,0.809,2.555,0.914,3.772,0.273l10.814-5.686c0.461-0.242,1.011-0.242,1.472,0\n");
      out.write("            l10.815,5.686c0.528,0.278,1.1,0.415,1.669,0.415c0.739,0,1.475-0.231,2.103-0.688c1.111-0.808,1.656-2.149,1.424-3.502\n");
      out.write("            L39.651,32.66c-0.088-0.513,0.083-1.036,0.456-1.4L48.856,22.731z M37.681,32.998l2.065,12.042c0.104,0.606-0.131,1.185-0.629,1.547\n");
      out.write("            c-0.499,0.361-1.12,0.405-1.665,0.121l-10.815-5.687c-0.521-0.273-1.095-0.411-1.667-0.411s-1.145,0.138-1.667,0.412l-10.813,5.686\n");
      out.write("            c-0.547,0.284-1.168,0.24-1.666-0.121c-0.498-0.362-0.732-0.94-0.629-1.547l2.065-12.042c0.199-1.162-0.186-2.348-1.03-3.17\n");
      out.write("            L2.48,21.299c-0.441-0.43-0.591-1.036-0.4-1.621c0.19-0.586,0.667-0.988,1.276-1.077l12.091-1.757\n");
      out.write("            c1.167-0.169,2.176-0.901,2.697-1.959l5.407-10.957c0.272-0.552,0.803-0.881,1.418-0.881c0.616,0,1.146,0.329,1.419,0.881\n");
      out.write("            l5.407,10.957c0.521,1.058,1.529,1.79,2.696,1.959l12.092,1.757c0.609,0.089,1.086,0.491,1.276,1.077\n");
      out.write("            c0.19,0.585,0.041,1.191-0.4,1.621l-8.749,8.528C37.866,30.65,37.481,31.835,37.681,32.998z\"></path></svg>\n");
      out.write("            </span>\n");
      out.write("\n");
      out.write("                <div class=\"u-border-4 u-border-palette-5-base u-line u-line-horizontal u-opacity u-opacity-75 u-line-1\"></div>\n");
      out.write("                <center><svg viewbox=\"-50 0 200 10\">\n");
      out.write("                    <defs>\n");
      out.write("                      <linearGradient id=\"gradient\" x1=\"0\" x2=\"0\" y1=\"0\" y2=\"0\">\n");
      out.write("                        <stop offset=\"10%\" stop-color= \"rgb(238, 130, 238)\"/>\n");
      out.write("                        <stop offset=\"95%\" stop-color=\"rgb(255, 250, 205)\"/>\n");
      out.write("                      </linearGradient>\n");
      out.write("                      <pattern id=\"wave\" x=\"0\" y=\"2\" width=\"120\" height=\"20\" patternUnits=\"userSpaceOnUse\">\n");
      out.write("                        <path id=\"wavePath\" d=\"M-100 9 Q-30 7 -20 9 T0 9 T20 9 T40 9 T60 9 T80 9 T100 9 T120 9 V20 H-40z\" mask=\"url(#mask)\" fill=\"url(#gradient)\"> \n");
      out.write("                          <animateTransform\n");
      out.write("                              attributeName=\"transform\"\n");
      out.write("                              begin=\"0s\"\n");
      out.write("                              dur=\"1.5s\"\n");
      out.write("                              type=\"translate\"\n");
      out.write("                              from=\"0,0\"\n");
      out.write("                              to=\"40,0\"\n");
      out.write("                              repeatCount=\"indefinite\" />\n");
      out.write("                        </path>\n");
      out.write("                      </pattern>\n");
      out.write("                    </defs>\n");
      out.write("                    \n");
      out.write("                    <text text-anchor=\"middle\" x=\"50\" y=\"15\" font-size=\"15\" fill=\"url(#wave)\"  fill-opacity=\"0.9\">¿QUE DESEA HACER?</text>\n");
      out.write("                    <text text-anchor=\"middle\" x=\"50\" y=\"15\" font-size=\"15\" fill=\"url(#gradient)\" fill-opacity=\"0.3\">¿QUE DESEA HACER?</text>\n");
      out.write("                    \n");
      out.write("                 </svg></center>\n");
      out.write("                 \n");
      out.write("                <!--<h2 class=\"u-text u-text-3\">¿ELIGE UNA OPCION PARA CONTINUAR?</h2>-->\n");
      out.write("                <button type=\"button\" onclick=\"window.location.href='/hotelAlenda/agregar_Cliente.jsp'\" class=\"u-btn u-btn-round u-btn-submit u-button-style u-radius-26 u-btn-1\">AGREGAR CLIENTE</button>                \n");
      out.write("                \n");
      out.write("                <form  action=\"SvConsultarCliente\" method=\"POST\">\n");
      out.write("                    <button type=\"submit\" class=\"u-btn u-btn-round u-btn-submit u-button-style u-radius-26 u-btn-1\">Lista de Clientes</button>                \n");
      out.write("                </form>\n");
      out.write("                <br><br><br><br>\n");
      out.write("                              \n");
      out.write("                <a href=\"index.jsp\" data-page-id=\"1080172\" class=\"u-btn u-btn-round u-button-style u-custom u-hover-feature u-radius-50 u-white u-btn-2\">VOLVER</a><br>\n");
      out.write("              </div>     \n");
      out.write("      \n");
      out.write("    </section>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <section class=\"u-backlink u-clearfix u-grey-80\">\n");
      out.write("      <span>WebSite</span>\n");
      out.write("      <p class=\"u-text\">\n");
      out.write("        <span>creada por</span>\n");
      out.write("      </p>\n");
      out.write("      <a class=\"u-link\" href=\"https://www.facebook.com/francisco.alenda/\" target=\"_blank\">\n");
      out.write("        <span>Pancho</span>\n");
      out.write("      </a>\n");
      out.write("    </section>\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("  </body>\n");
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
