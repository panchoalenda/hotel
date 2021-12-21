/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;
import logica.Venta;

@WebServlet(name = "SvVenta_Serv_Turist", urlPatterns = {"/SvVenta_Serv_Turist"})
public class SvVenta_Serv_Turist extends HttpServlet {

    Controladora control = new Controladora();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
      
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String[] cod_serv = request.getParameterValues("cod_servi");
        String nomb_Empleado= request.getParameter("asigEmpleado");
        double ct_paquete=0;
               
      
      if (nomb_Empleado!=null){  
                
            ct_paquete=control.crerVentaPaquete(cod_serv);
            
            HttpSession misession2 = request.getSession(true);
            misession2.setAttribute("ct_paquete",  String.format("%.2f",ct_paquete));
           
        }else{
            response.sendRedirect("login.jsp");

        }
       
       //envío datos a la BD
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String conv = request.getParameter("fec_vta");
        String conv2 = request.getParameter("fec_Paq");
        Date fec_vta=null;
        Date fec_Paq=null;
            
       //número de cliente     
       String numCliente=request.getParameter("name");
       
       //fecha de venta
       try {
                fec_vta= formato.parse(conv);
            } catch (ParseException ex) {
                Logger.getLogger(SvEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
       
       //fecha de paquete
       try {
                fec_Paq= formato.parse(conv2);
            } catch (ParseException ex) {
                Logger.getLogger(SvEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
       
       
        //Datos al jsp
        String id_empleado = request.getParameter("idEmple");
        int id_emple = Integer.valueOf(id_empleado);
        String for_Pago= request.getParameter("for_Pago");
        int nu_cliente = Integer.valueOf(numCliente);
        String descripcion = request.getParameter("descripcion");
        String destino = request.getParameter("destino");
        
      
     
       int cod_servicio=control.traerCodServicio();        
       control.vtaServicio(cod_servicio, fec_vta, id_emple, nu_cliente,for_Pago);
       
       HttpSession misession7 = request.getSession(true);
       misession7.setAttribute("fec_vta",  conv);
       
       HttpSession misession4 = request.getSession(true);
       misession4.setAttribute("fec_paq",  conv2);
       
        
       HttpSession misession5 = request.getSession(true);
       misession5.setAttribute("descripcion",  descripcion);
       
       HttpSession misession6 = request.getSession(true);
       misession6.setAttribute("destino",  destino);
       
       HttpSession misession8 = request.getSession(true);
       misession8.setAttribute("for_Pago",  for_Pago);
       
       
       HttpSession misession = request.getSession();
       String usu = (String) misession.getAttribute("usuario");
       String asigEmpleado=control.devUsuario(usu);
       String asigEmplInput= control.devUsuarioInput(asigEmpleado);
       HttpSession misession9 = request.getSession(true);
       misession9.setAttribute("asigEmplInput",  asigEmplInput);
       HttpSession misession10 = request.getSession(true);
       misession10.setAttribute("cod_serv",  cod_serv);
                 
       
        response.sendRedirect("leer_Venta.jsp");
    }

        
       
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
