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
							
                                   
       
        <h1><--Empleado--></h1>
        <form action="leer_Empleados.jsp" method="POST">
                  <table class="default" >
        
        <thead >
           <tr >
            <th >Nombre y Apellido</th>
            <th >Dirección</th>
            <th >DNI</th>
            <th >Fecha de Nacimiento</th>
            <th >Nacionalidad</th>
            <th >Celular</th>
            <th >E-mail</th>
            <th >Eliminar</th>
            <th >Modificar</th>           
          </tr>
        </thead>
        
        <tbody>
            <%
                    HttpSession misesion = request.getSession();    
                    List <Empleado> listEmpleado = (List) request.getSession().getAttribute("listaEmpleado");
                    for (Empleado empleado : listEmpleado) {    
                                        %>
              
             <tr class="row100 body">
                <%String nombreCompl = empleado.getNombre()+" "+empleado.getApellido();%>
               <td class="cell100 column2"><%=nombreCompl%></td>
               <%String direccion = empleado.getDireccion();%>
               <td class="cell100 column3"><%=direccion%></td>
               <%String dni = empleado.getDni();%>
               <td class="cell100 column4"><%=dni%></td>
               <%Date fec_nac = empleado.getFec_nac();%>
               <td class="cell100 column5"><%=fec_nac   %></td>
               <%String nacionalidad = empleado.getNacionalidad();%>
               <td class="cell100 column6"><%=nacionalidad%></td>
               <%String celular = empleado.getCelular();%>
               <td class="cell100 column7"><%=celular%></td>
               <%String email = empleado.getEmail();%>
               <td class="cell100 column8"><%=email%></td>
               <%String cargo = empleado.getCargo();%>
               <td class="cell100 column8"><%=cargo%></td>
               <% double sueldo = empleado.getSueldo();%>
               <td class="cell100 column8"><%=sueldo%></td>
               <% int id_cliente = empleado.getId_empleado();%>
                            
               <td>
                   <form name="frmeliminarempleados" action="SvEliminarEmpleado" method="POST" style="display: inline">
                       <input type="hidden" name="id" value="<%=id_cliente%>">
                       <button type="submit" class="btn btn-danger btn-xs" data-title="Delete" style="display: inline">Eliminar</button>                
                   </form>
               </td>
               <td>
                   <form name="frmmodificarempleados" action="SvModificarEmpleado" method="POST" style="display: inline">
                       <input type="hidden" name="id" value="<%=id_cliente%>">
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