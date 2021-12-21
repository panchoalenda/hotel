<%@page import="logica.ServicioTuristico"%>
<%@page import="java.util.Date"%>
<%@page import="logica.Cliente"%>
<%@page import="logica.Empleado"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.List"%>
<%@page import="logica.Venta"%>
<%@page import="logica.Controladora"%>
<%@page import="logica.Controladora"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Lista Clientes</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="assets/css/main.css" />
                <link rel="stylesheet" href="assets/css/leer.css" />
		<noscript><link rel="stylesheet" href="assets/css/noscript.css" /></noscript>
                
	</head>
	<body >
		<div id="page-wrapper">

			<!-- Header -->
				<div id="header">

					<!-- Inner -->
						<div class="inner">
							<header>
                                                            <hr />
                                                            <p id="logo" >*****</p>
								<h1><a href="" id="logo">HOTEL ALENDA</a></h1>
								<hr />
								
							</header>
							
                                   
       
        <h1><--Lista de Servicio--></h1>
        <form action="leer_Cliente.jsp" method="POST">
                  <table class="default" >
        
        <thead >
           <tr >
            <th >Código Servicio</th>
            <th >Nombre</th>
            <th >Destino</th>
            <th >Descripción</th>
            <th >Costo</th>           
          </tr>
        </thead>
        
        <tbody>
            <%
                    HttpSession misesion = request.getSession();    
                    List <ServicioTuristico> listServicio = (List) request.getSession().getAttribute("listaServ");
                    for (ServicioTuristico servicio : listServicio) {    
                                        %>
              
             <tr class="row100 body">
                <%int codigo_servicio = servicio.getCodigo_servicio();%>
               <td class="cell100 column2"><%=codigo_servicio%></td>
               <%String nombre = servicio.getNombre();%>
               <td class="cell100 column3"><%=nombre%></td>
               <%String destino = servicio.getDestino_servicio();%>
               <td class="cell100 column4"><%=destino%></td>
               <%String descripcion = servicio.getDescripcion();%>
               <td class="cell100 column5"><%=descripcion   %></td>
               <%double costo = servicio.getCosto_servicio();%>
               <td class="cell100 column6"><%=costo%></td>
                                        
               <td>
                   <form name="frmeliminarServicio" action="SvEliminaServicio" method="POST" style="display: inline">
                       <input type="hidden" name="id" value="<%=codigo_servicio%>">
                       <button type="submit" class="btn btn-danger btn-xs" data-title="Delete" style="display: inline">Eliminar</button>                
                   </form>
               </td>
               <td>
                   <form name="frmmodificarServicio" action="SvmodificaServicio" method="POST" style="display: inline">
                       <input type="hidden" name="id" value="<%=codigo_servicio%>">
                       <button type="submit" class="btn btn-prymari " data-title="Edit" style="display: inline">Modificar</button>                
                   </form>
               </td>
               
            </tr >
            <% } %>
        </tbody>        
      </table>
		<a href="cliente.jsp" data-page-id="1079705" class="u-btn u-btn-round u-button-style u-radius-26 u-btn-3" data-animation-name="" data-animation-duration="0" data-animation-delay="0" data-animation-direction="">REGRESAR</a>
        <div class="u-table u-table-responsive u-table-1">
        </div>				
 </div>
</form>     
  
        
        
                                               
<!-- Copyright -->
									<div class="copyright">
										<ul class="menu">
											<li>&copy; WebSite.</li><li>Creada por Pancho <a href="https://www.facebook.com/francisco.alenda/"></a></li>
										</ul>
									</div>

							</div>

						</div>
					</div>
				</div>

		</div>

		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/jquery.dropotron.min.js"></script>
			<script src="assets/js/jquery.scrolly.min.js"></script>
			<script src="assets/js/jquery.scrollex.min.js"></script>
			<script src="assets/js/browser.min.js"></script>
			<script src="assets/js/breakpoints.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main.js"></script>

	</body>
</html>