<%@page import="logica.Cliente"%>
<%@page import="logica.ServicioTuristico"%>
<%@page import="java.util.List"%>
<%@page import="logica.Controladora"%>
<%@page import="java.time.LocalDate"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="font-size: 16px;">

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>Venta Paquete Turístico</title>
    
    <!-- inyecta los CSS -->
    <link rel="stylesheet" href="css/nicepage.css" media="screen">
    <link rel="stylesheet" href="css/paquete_turistico.css" media="screen">

    <!-- inyecta las fuentes de google --> 
    <link id="u-theme-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto+Condensed:300,300i,400,400i,700,700i|Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i">
    <link id="u-page-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lobster:400|Roboto+Condensed:300,300i,400,400i,700,700i">
    
    
    
  </head>
  <body class="u-body">
      <% 
      HttpSession misession = request.getSession();
      String usu = (String) misession.getAttribute("usuario");
      if(usu == null){
          response.sendRedirect("login.jsp");
          
      }else{
      %>
    <section class="u-clearfix u-image u-typography-custom-page-typography-8--Introduction u-white u-section-1" id="sec-a326">
      <div class="u-clearfix u-sheet u-sheet-1">
        <h1 class="u-custom-font u-font-lobster u-text u-text-white u-title u-text-1">Bienvenidos</h1>
        <h1 class="u-text u-text-white u-text-2">HOTEL <span style="font-weight: 700;">ALENDA</span>
        </h1>
        <span class="u-icon u-icon-circle u-text-white u-icon-1"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 49.94 49.94" style=""><use xlink:href="#svg-a9ef"></use></svg><svg class="u-svg-content" viewBox="0 0 49.94 49.94" x="0px" y="0px" id="svg-a9ef" style="enable-background:new 0 0 49.94 49.94;"><path d="M48.856,22.731c0.983-0.958,1.33-2.364,0.906-3.671c-0.425-1.307-1.532-2.24-2.892-2.438l-12.092-1.757
      	c-0.515-0.075-0.96-0.398-1.19-0.865L28.182,3.043c-0.607-1.231-1.839-1.996-3.212-1.996c-1.372,0-2.604,0.765-3.211,1.996
      	L16.352,14c-0.23,0.467-0.676,0.79-1.191,0.865L3.069,16.623C1.71,16.82,0.603,17.753,0.178,19.06
      	c-0.424,1.307-0.077,2.713,0.906,3.671l8.749,8.528c0.373,0.364,0.544,0.888,0.456,1.4L8.224,44.702
      	c-0.232,1.353,0.313,2.694,1.424,3.502c1.11,0.809,2.555,0.914,3.772,0.273l10.814-5.686c0.461-0.242,1.011-0.242,1.472,0
      	l10.815,5.686c0.528,0.278,1.1,0.415,1.669,0.415c0.739,0,1.475-0.231,2.103-0.688c1.111-0.808,1.656-2.149,1.424-3.502
      	L39.651,32.66c-0.088-0.513,0.083-1.036,0.456-1.4L48.856,22.731z M37.681,32.998l2.065,12.042c0.104,0.606-0.131,1.185-0.629,1.547
      	c-0.499,0.361-1.12,0.405-1.665,0.121l-10.815-5.687c-0.521-0.273-1.095-0.411-1.667-0.411s-1.145,0.138-1.667,0.412l-10.813,5.686
      	c-0.547,0.284-1.168,0.24-1.666-0.121c-0.498-0.362-0.732-0.94-0.629-1.547l2.065-12.042c0.199-1.162-0.186-2.348-1.03-3.17
      	L2.48,21.299c-0.441-0.43-0.591-1.036-0.4-1.621c0.19-0.586,0.667-0.988,1.276-1.077l12.091-1.757
      	c1.167-0.169,2.176-0.901,2.697-1.959l5.407-10.957c0.272-0.552,0.803-0.881,1.418-0.881c0.616,0,1.146,0.329,1.419,0.881
      	l5.407,10.957c0.521,1.058,1.529,1.79,2.696,1.959l12.092,1.757c0.609,0.089,1.086,0.491,1.276,1.077
      	c0.19,0.585,0.041,1.191-0.4,1.621l-8.749,8.528C37.866,30.65,37.481,31.835,37.681,32.998z"></path></svg>
      </span>

      <span class="u-icon u-icon-circle u-text-white u-icon-2"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 49.94 49.94" style=""><use xlink:href="#svg-0ae9"></use></svg><svg class="u-svg-content" viewBox="0 0 49.94 49.94" x="0px" y="0px" id="svg-0ae9" style="enable-background:new 0 0 49.94 49.94;"><path d="M48.856,22.731c0.983-0.958,1.33-2.364,0.906-3.671c-0.425-1.307-1.532-2.24-2.892-2.438l-12.092-1.757
      	c-0.515-0.075-0.96-0.398-1.19-0.865L28.182,3.043c-0.607-1.231-1.839-1.996-3.212-1.996c-1.372,0-2.604,0.765-3.211,1.996
      	L16.352,14c-0.23,0.467-0.676,0.79-1.191,0.865L3.069,16.623C1.71,16.82,0.603,17.753,0.178,19.06
      	c-0.424,1.307-0.077,2.713,0.906,3.671l8.749,8.528c0.373,0.364,0.544,0.888,0.456,1.4L8.224,44.702
      	c-0.232,1.353,0.313,2.694,1.424,3.502c1.11,0.809,2.555,0.914,3.772,0.273l10.814-5.686c0.461-0.242,1.011-0.242,1.472,0
      	l10.815,5.686c0.528,0.278,1.1,0.415,1.669,0.415c0.739,0,1.475-0.231,2.103-0.688c1.111-0.808,1.656-2.149,1.424-3.502
      	L39.651,32.66c-0.088-0.513,0.083-1.036,0.456-1.4L48.856,22.731z M37.681,32.998l2.065,12.042c0.104,0.606-0.131,1.185-0.629,1.547
      	c-0.499,0.361-1.12,0.405-1.665,0.121l-10.815-5.687c-0.521-0.273-1.095-0.411-1.667-0.411s-1.145,0.138-1.667,0.412l-10.813,5.686
      	c-0.547,0.284-1.168,0.24-1.666-0.121c-0.498-0.362-0.732-0.94-0.629-1.547l2.065-12.042c0.199-1.162-0.186-2.348-1.03-3.17
      	L2.48,21.299c-0.441-0.43-0.591-1.036-0.4-1.621c0.19-0.586,0.667-0.988,1.276-1.077l12.091-1.757
      	c1.167-0.169,2.176-0.901,2.697-1.959l5.407-10.957c0.272-0.552,0.803-0.881,1.418-0.881c0.616,0,1.146,0.329,1.419,0.881
      	l5.407,10.957c0.521,1.058,1.529,1.79,2.696,1.959l12.092,1.757c0.609,0.089,1.086,0.491,1.276,1.077
      	c0.19,0.585,0.041,1.191-0.4,1.621l-8.749,8.528C37.866,30.65,37.481,31.835,37.681,32.998z"></path></svg>
      </span>

      <span class="u-icon u-icon-circle u-text-white u-icon-3"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 49.94 49.94" style=""><use xlink:href="#svg-c7c0"></use></svg><svg class="u-svg-content" viewBox="0 0 49.94 49.94" x="0px" y="0px" id="svg-c7c0" style="enable-background:new 0 0 49.94 49.94;"><path d="M48.856,22.731c0.983-0.958,1.33-2.364,0.906-3.671c-0.425-1.307-1.532-2.24-2.892-2.438l-12.092-1.757
      	c-0.515-0.075-0.96-0.398-1.19-0.865L28.182,3.043c-0.607-1.231-1.839-1.996-3.212-1.996c-1.372,0-2.604,0.765-3.211,1.996
      	L16.352,14c-0.23,0.467-0.676,0.79-1.191,0.865L3.069,16.623C1.71,16.82,0.603,17.753,0.178,19.06
      	c-0.424,1.307-0.077,2.713,0.906,3.671l8.749,8.528c0.373,0.364,0.544,0.888,0.456,1.4L8.224,44.702
      	c-0.232,1.353,0.313,2.694,1.424,3.502c1.11,0.809,2.555,0.914,3.772,0.273l10.814-5.686c0.461-0.242,1.011-0.242,1.472,0
      	l10.815,5.686c0.528,0.278,1.1,0.415,1.669,0.415c0.739,0,1.475-0.231,2.103-0.688c1.111-0.808,1.656-2.149,1.424-3.502
      	L39.651,32.66c-0.088-0.513,0.083-1.036,0.456-1.4L48.856,22.731z M37.681,32.998l2.065,12.042c0.104,0.606-0.131,1.185-0.629,1.547
      	c-0.499,0.361-1.12,0.405-1.665,0.121l-10.815-5.687c-0.521-0.273-1.095-0.411-1.667-0.411s-1.145,0.138-1.667,0.412l-10.813,5.686
      	c-0.547,0.284-1.168,0.24-1.666-0.121c-0.498-0.362-0.732-0.94-0.629-1.547l2.065-12.042c0.199-1.162-0.186-2.348-1.03-3.17
      	L2.48,21.299c-0.441-0.43-0.591-1.036-0.4-1.621c0.19-0.586,0.667-0.988,1.276-1.077l12.091-1.757
      	c1.167-0.169,2.176-0.901,2.697-1.959l5.407-10.957c0.272-0.552,0.803-0.881,1.418-0.881c0.616,0,1.146,0.329,1.419,0.881
      	l5.407,10.957c0.521,1.058,1.529,1.79,2.696,1.959l12.092,1.757c0.609,0.089,1.086,0.491,1.276,1.077
      	c0.19,0.585,0.041,1.191-0.4,1.621l-8.749,8.528C37.866,30.65,37.481,31.835,37.681,32.998z"></path></svg>
      </span>

      <span class="u-icon u-icon-circle u-text-white u-icon-4"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 49.94 49.94" style=""><use xlink:href="#svg-acbf"></use></svg><svg class="u-svg-content" viewBox="0 0 49.94 49.94" x="0px" y="0px" id="svg-acbf" style="enable-background:new 0 0 49.94 49.94;"><path d="M48.856,22.731c0.983-0.958,1.33-2.364,0.906-3.671c-0.425-1.307-1.532-2.24-2.892-2.438l-12.092-1.757
      	c-0.515-0.075-0.96-0.398-1.19-0.865L28.182,3.043c-0.607-1.231-1.839-1.996-3.212-1.996c-1.372,0-2.604,0.765-3.211,1.996
      	L16.352,14c-0.23,0.467-0.676,0.79-1.191,0.865L3.069,16.623C1.71,16.82,0.603,17.753,0.178,19.06
      	c-0.424,1.307-0.077,2.713,0.906,3.671l8.749,8.528c0.373,0.364,0.544,0.888,0.456,1.4L8.224,44.702
      	c-0.232,1.353,0.313,2.694,1.424,3.502c1.11,0.809,2.555,0.914,3.772,0.273l10.814-5.686c0.461-0.242,1.011-0.242,1.472,0
      	l10.815,5.686c0.528,0.278,1.1,0.415,1.669,0.415c0.739,0,1.475-0.231,2.103-0.688c1.111-0.808,1.656-2.149,1.424-3.502
      	L39.651,32.66c-0.088-0.513,0.083-1.036,0.456-1.4L48.856,22.731z M37.681,32.998l2.065,12.042c0.104,0.606-0.131,1.185-0.629,1.547
      	c-0.499,0.361-1.12,0.405-1.665,0.121l-10.815-5.687c-0.521-0.273-1.095-0.411-1.667-0.411s-1.145,0.138-1.667,0.412l-10.813,5.686
      	c-0.547,0.284-1.168,0.24-1.666-0.121c-0.498-0.362-0.732-0.94-0.629-1.547l2.065-12.042c0.199-1.162-0.186-2.348-1.03-3.17
      	L2.48,21.299c-0.441-0.43-0.591-1.036-0.4-1.621c0.19-0.586,0.667-0.988,1.276-1.077l12.091-1.757
      	c1.167-0.169,2.176-0.901,2.697-1.959l5.407-10.957c0.272-0.552,0.803-0.881,1.418-0.881c0.616,0,1.146,0.329,1.419,0.881
      	l5.407,10.957c0.521,1.058,1.529,1.79,2.696,1.959l12.092,1.757c0.609,0.089,1.086,0.491,1.276,1.077
      	c0.19,0.585,0.041,1.191-0.4,1.621l-8.749,8.528C37.866,30.65,37.481,31.835,37.681,32.998z"></path></svg>
      </span>

      <span class="u-icon u-icon-circle u-text-white u-icon-5"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 49.94 49.94" style=""><use xlink:href="#svg-0558"></use></svg><svg class="u-svg-content" viewBox="0 0 49.94 49.94" x="0px" y="0px" id="svg-0558" style="enable-background:new 0 0 49.94 49.94;"><path d="M48.856,22.731c0.983-0.958,1.33-2.364,0.906-3.671c-0.425-1.307-1.532-2.24-2.892-2.438l-12.092-1.757
      	c-0.515-0.075-0.96-0.398-1.19-0.865L28.182,3.043c-0.607-1.231-1.839-1.996-3.212-1.996c-1.372,0-2.604,0.765-3.211,1.996
      	L16.352,14c-0.23,0.467-0.676,0.79-1.191,0.865L3.069,16.623C1.71,16.82,0.603,17.753,0.178,19.06
      	c-0.424,1.307-0.077,2.713,0.906,3.671l8.749,8.528c0.373,0.364,0.544,0.888,0.456,1.4L8.224,44.702
      	c-0.232,1.353,0.313,2.694,1.424,3.502c1.11,0.809,2.555,0.914,3.772,0.273l10.814-5.686c0.461-0.242,1.011-0.242,1.472,0
      	l10.815,5.686c0.528,0.278,1.1,0.415,1.669,0.415c0.739,0,1.475-0.231,2.103-0.688c1.111-0.808,1.656-2.149,1.424-3.502
      	L39.651,32.66c-0.088-0.513,0.083-1.036,0.456-1.4L48.856,22.731z M37.681,32.998l2.065,12.042c0.104,0.606-0.131,1.185-0.629,1.547
      	c-0.499,0.361-1.12,0.405-1.665,0.121l-10.815-5.687c-0.521-0.273-1.095-0.411-1.667-0.411s-1.145,0.138-1.667,0.412l-10.813,5.686
      	c-0.547,0.284-1.168,0.24-1.666-0.121c-0.498-0.362-0.732-0.94-0.629-1.547l2.065-12.042c0.199-1.162-0.186-2.348-1.03-3.17
      	L2.48,21.299c-0.441-0.43-0.591-1.036-0.4-1.621c0.19-0.586,0.667-0.988,1.276-1.077l12.091-1.757
      	c1.167-0.169,2.176-0.901,2.697-1.959l5.407-10.957c0.272-0.552,0.803-0.881,1.418-0.881c0.616,0,1.146,0.329,1.419,0.881
      	l5.407,10.957c0.521,1.058,1.529,1.79,2.696,1.959l12.092,1.757c0.609,0.089,1.086,0.491,1.276,1.077
      	c0.19,0.585,0.041,1.191-0.4,1.621l-8.749,8.528C37.866,30.65,37.481,31.835,37.681,32.998z"></path></svg>
      </span>

        <div class="u-border-4 u-border-palette-5-base u-line u-line-horizontal u-opacity u-opacity-75 u-line-1"></div>
        
        <h1 class="u-text u-text-3">VENTA PAQUETE TURISTICO</h1>
        <div class="u-form u-form-1">

          <form action="SvBuscaCliente" method="POST" class="u-clearfix u-form-spacing-10 u-form-vertical u-inner-form" name="form-1" style="padding: 10px;">
            <div class="u-form-group u-form-name">
              <label for="name-581c" class="u-form-control-hidden u-label"></label>
              <input type="text" placeholder="Ingrese el DNI de la persona" id="name-581c" name="buscarDNI" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white" required="">
            </div>
           <div class="u-align-left u-form-group u-form-submit">
                <button type="submit" class="u-btn u-btn-round u-btn-submit u-button-style u-radius-26 u-btn-1">BUSCAR CLIENTE</button>
            </div>                            
                        
          </form>


        </div>
        <div class="u-form u-gradient u-form-2">
            
            
            
          <form action="SvVenta_Paq_Turist" method="POST" class="u-clearfix u-form-spacing-19 u-form-vertical u-inner-form" name="form" style="padding: 13px;">
              <div class="u-form-date u-form-group u-form-group-4">
                  <%
                      Controladora control=new Controladora();
                      int cod_paq =control.traerCodPaquete()+1;
                  %>
              <label for="text-07cc" class="u-label u-label-3">Paquete Número </label>
              <input type="text" placeholder="" id="text-07cc" readonly="readonly" name="cod_paq" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white" value="<%=cod_paq%>">
            </div>
            <div class="u-form-group u-form-name u-form-group-3">
              <label for="name-dd17" class="u-label u-label-2">Número de Cliente</label>
              <%   
                  HttpSession misession1 = request.getSession();
                  String datoCliente = (String) misession1.getAttribute("datoCliente"); %>
             
                  <input type="text" placeholder="id_cliente"  id="name-dd17" readonly="readonly" name="name" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white" value="<%=datoCliente%>">
            </div>
            
            <div class="u-form-group u-form-name u-form-group-3">
              <label for="name-dd17" class="u-label u-label-2">(Código Cliente)- Nombre y Apellido</label>
              <%   
                  HttpSession misession0 = request.getSession();
                  String datoCliente2 = (String) misession0.getAttribute("datoCliente2"); %>
             
                  <input type="text" placeholder="id_cliente" id="name-dd17" readonly="readonly" name="name" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white" value="<%=datoCliente2%>">
            </div>
             

            <div class="u-form-date u-form-group u-form-group-4">
              <label for="text-07cc" class="u-label u-label-3">Fecha de Venta </label>
              <input type="date" placeholder="" id="text-07cc" name="fec_vta" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white" value="<%=LocalDate.now()%>">
            </div>
            
             <div class="u-form-date u-form-group u-form-group-4">
              <label for="text-07cc" class="u-label u-label-3">Fecha Paquete Turístico</label>
              <input type="date" placeholder="" id="text-07cc" required="required" name="fec_Paq" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white">
            </div>
            <div class="u-form-date u-form-group u-form-group-4">
              <label for="text-07cc" class="u-label u-label-3">Descripción</label>
              <input type="text" placeholder="" id="text-07cc" name="descripcion" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white">
            </div>
            <div class="u-form-date u-form-group u-form-group-4">
              <label for="text-07cc" class="u-label u-label-3">Destino</label>
              <input type="text" placeholder="" id="text-07cc" name="destino" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white">
            </div>
            <div class="u-form-date u-form-group u-form-group-4">
            <label for="text-07cc" class="u-label u-label-3">Forma de Pago</label>
                <select name="for_Pago">
                    <option>Efectivo: Sin Comisión</option>
                    <option>Tarjeta de Débito: +3%</option>
                    <option>Tarjeta de Crédito: +9%</option>
                    <option>Monedero Virtual: Sin comisión</option>
                    <option>Transferencia: +2,45%</option>
                </select>
            </div>
            
            <!-- Seleción de Empleados-->
            
            
            
            <div class="u-form-date u-form-group u-form-group-4">
                <%
                   
                    String asigEmpleado=control.devUsuario(usu);
                    String asigEmplInput= control.devUsuarioInput(asigEmpleado);
                    String idEmple = control.devUsuario(usu);
                    %>
                    <label for="text-07cc" class="u-label u-label-3">____________________________________________________________________</label><br><br>
              <label for="text-07cc" class="u-label u-label-3">Cod. Empleado</label>
              <input type="text" placeholder="" id="text-07cc" name="idEmple" value="<%=asigEmpleado%>" readonly="true"><br>
                <label for="text-07cc" class="u-label u-label-3">Empleado</label>
                <input type="text" placeholder="" id="text-07cc" name="asigEmpleado" value="<%=asigEmplInput%>" readonly="true" class="u-border-1 u-border-grey-30  u-input-rectangle u-white">
                <br><label for="text-07cc" class="u-label u-label-3">____________________________________________________________________</label><br>
            </div>
             <div class="u-form-date u-form-group u-form-group-4">
                 <label for="text-07cc" class="u-label u-label-3">SELECCIONE LOS PAQUETES A VENDER</label><br>
              <label for="text-07cc" >(Recuerde que el mínimo son 2 paquetes)</label>
             </div>

             <!--Muestro la lista de servicios para comprar en un paquete-->  
             <%
                    
                
                List<ServicioTuristico> Servicios = control.traerlistaServicios();
               
                    for(ServicioTuristico ser : Servicios) { 
                    
                    String item = ser.getNombre();
                    String ct_item = String.valueOf(ser.getCosto_servicio());
                    %>
                    
            <div class=" u-form-group  u-form-group-5">                
                <input type="checkbox" id="checkbox" name="cod_servi" value="<%=ser.getCodigo_servicio()%>" >
                <label type="checkbox-f604"  class="u-label u-label-4"><%=item%>( $<%=ct_item%> )</label>
            </div>
            <% } %>
           
           
                
            <div class="u-align-left u-form-group u-form-submit">              
                <button type="submit" class="u-btn u-btn-round u-btn-submit u-button-style u-radius-26 u-btn-2">VENDER</button>
            </div>
            
          </form>
          
          
        </div>            
        <a href="ventas.jsp" data-page-id="1079705" class="u-btn u-btn-round u-button-style u-radius-26 u-btn-3" data-animation-name="" data-animation-duration="0" data-animation-delay="0" data-animation-direction="">CANCELAR</a>
        <div class="u-table u-table-responsive u-table-1">
        </div>
         
          <%   
                  HttpSession misession2 = request.getSession();
                  String ct_paquete = (String) misession2.getAttribute("ct_paquete");
                  if(ct_paquete!=null){
                      
                  %>
        <h1 name="total" id="ptotal" class="u-text u-text-5">$<%=ct_paquete%> </h1><br>
        <% }%>
            
           
      </div>
      <br> <br><br> <br><br> <br>
                   </section>
    
    
    
   <section class="u-backlink u-clearfix u-grey-80">
      <span>WebSite</span>
      <p class="u-text">
        <span>creada por</span>
      </p>
      <a class="u-link" href="https://www.facebook.com/francisco.alenda/" target="_blank">
        <span>Pancho</span>
      </a>
    </section>
    <% } %>
  </body>
</html>