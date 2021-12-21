/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
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
import logica.Cliente;
import logica.Controladora;

/**
 *
 * @author FAMILIA
 */
@WebServlet(name = "SvModificaCliente", urlPatterns = {"/SvModificaCliente"})
public class SvModificaCliente extends HttpServlet {
    Controladora control = new Controladora();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SvModificaCliente</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SvModificaCliente at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            String conv = request.getParameter("fec_nac");
            Date fec_nac=null; 
            
            
            int id= Integer.parseInt(request.getParameter("id"));
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String direccion = request.getParameter("direccion");
            String dni = request.getParameter("dni");                       
            String nac = request.getParameter("nac");
            String celular = request.getParameter("celular");
            String email = request.getParameter("email");
           
            
        
            try {
                fec_nac= formato.parse(conv);
            } catch (ParseException ex) {
                Logger.getLogger(SvEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        Cliente clien =control.BuscarClie(id);
        clien.setNombre(nombre);
        clien.setApellido(apellido);
        clien.setDireccion(direccion);
        clien.setCelular(celular);
        clien.setDni(dni);
        clien.setFec_nac(fec_nac);
        clien.setEmail(email);
        clien.setNacionalidad(nac);
        
       control.modificarCliente(clien);
       response.sendRedirect("leer_Cliente.jsp");
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
          int id_cliente = Integer.parseInt(request.getParameter("id"));
        
        
          Cliente clie= control.BuscarClie(id_cliente);
          
           
          HttpSession misesion = request.getSession();
          misesion.setAttribute("cliente", clie);
        
            
            response.sendRedirect("modCliente.jsp");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
