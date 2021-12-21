/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Controladora;


@WebServlet(name = "SvServicioTuristico", urlPatterns = {"/SvServicioTuristico"})
public class SvServicioTuristico extends HttpServlet {

    Controladora control = new Controladora();
    
    
            
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre_servicio = request.getParameter("nombre_servicio");
        String descripcion = request.getParameter("descripcion");
        String destino_servicio = request.getParameter("destino_servicio");        
        Double costo_servicio = Double.parseDouble(request.getParameter("costo_servicio"));
        
        control.agregarServicio(nombre_servicio,descripcion,destino_servicio,costo_servicio);
        
        response.sendRedirect("Serv_Turist.jsp");
        
        
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
