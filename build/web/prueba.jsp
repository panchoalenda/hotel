<%-- 
    Document   : prueba
    Created on : 19/12/2021, 12:37:12
    Author     : Papá
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@page import="logica.Venta"%>
<%@page import="logica.Controladora"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" href="css/nicepage.css" media="screen">
          <link rel="stylesheet" href="css/leer.css" media="screen">
    </head>
    <body>
        
         <h1 class="u-text u-text-3">VENTAS REALIZADAS</h1>
        <table class="u-text u-text-5">
            <thead>
                <tr>
                    <th class="u-text u-text-5">a</th>
                    <th>Fecha de Venta</th>
                    <th></th>
                    <th></th>
                    <th></th>
                    <th>Costo Paquete</th>                    
                </tr>                    
            </thead>
                       
        </table>
            <div class="u-container-layout u-valign-middle u-block-596c-31"><div class="u-expanded-width u-table u-table-responsive u-block-596c-32"><div class="hidden u-border-1 u-border-grey-30 u-border-no-left u-border-no-right u-first-col-div u-block-596c-33"></div><div class="hidden u-table-header-style-div u-block-596c-34"></div><div class="hidden u-border-1 u-border-grey-30 u-border-no-left u-border-no-right u-border-no-top u-table-footer-style-div u-block-596c-35"></div><div class="hidden u-border-1 u-border-grey-30 u-border-no-left u-border-no-right u-table-body-style-div u-block-596c-36"></div>
      <table class="u-table-entity u-block-596c-37">
        <colgroup>
          <col width="20%">
          <col width="20%">
          <col width="20%">
          <col width="20%"><col width="20%">
        </colgroup>
        <thead class="u-custom-font u-font-courier-new u-gradient u-table-header u-block-596c-38">
          <tr style="height: 83px;">
            <th class="u-table-cell u-block-596c-39">Código de Vent</th>              
            <th class="u-table-cell u-block-596c-39">Fecha de Venta</th>
            <th class="u-table-cell u-block-596c-40">Medio de Pago</th>
            <th class="u-table-cell u-block-596c-41">Venta Realizada por</th>
            <th class="u-table-cell u-block-596c-41">Cliente</th>
            <th class="u-table-cell u-block-596c-42">Costo Paquete</th>
            
          </tr>
        </thead>
        <tbody class="u-table-body u-block-596c-44">
          <tbody>
                <%
                    Controladora control = new Controladora();
                    List<Venta> listVenta = control.traerlistaVentas();
                   
                    for (Venta vt : listVenta) {                         
                %>
                
                <tr>
                    <%
                        int codigoVenta = vt.getId();
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd"); 
                        String fechaComoCadena = sdf.format(vt.getFec_venta());
                        String med_pago = vt.getMedio_pago();
                       // double cost_ser =vt.getSer_turistico().getCosto_servicio();
                        int emple = vt.getEmpleado().getId_empleado();
                        //String clie = vt.getCliente().getNombre()+" "+ vt.getCliente().getApellido();
                        
                        
                   
                     %>        
                </tr>
                 
            </tbody>
             <tr style="height: 77px;">
            <td class="u-border-1 u-border-grey-30 u-border-no-left u-border-no-right u-table-cell u-block-596c-50"><%=codigoVenta%></td>
            <td class="u-border-1 u-border-grey-30 u-border-no-left u-border-no-right u-table-cell u-block-596c-51"> <%=fechaComoCadena%></td>
            <td class="u-border-1 u-border-grey-30 u-border-no-left u-border-no-right u-table-cell u-block-596c-52"><%=med_pago%></td>
            <td class="u-border-1 u-border-grey-30 u-border-no-left u-border-no-right u-table-cell u-block-596c-52"></td>
            <td class="u-border-1 u-border-grey-30 u-border-no-left u-border-no-right u-table-cell u-block-596c-52"></td>
            <td class="u-border-1 u-border-grey-30 u-border-no-left u-border-no-right u-table-cell u-block-596c-52"></td>
            </tr><% } %></tbody>
        <tfoot class="u-table-footer u-block-596c-65">
          
        </tfoot>
      </table>
    </div></div>
              </body>
</html>
