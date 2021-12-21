/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import static java.awt.SystemColor.control;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;

/**
 *
 * @author Papá
 */
@WebServlet(name = "SvBuscaCliente1", urlPatterns = {"/SvBuscaCliente1"})
public class SvBuscaCliente1 extends HttpServlet {

     Controladora control = new Controladora();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SvBuscaCliente1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SvBuscaCliente1 at " + request.getContextPath() + "</h1>");
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
        processRequest(request, response);
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
          
        String dni = request.getParameter("buscarDNI");
        
        System.out.println("el dni reuperado es " + dni);
        
        //Cargo Id del Cliente
        String datoCliente = control.buscarCliente(dni);
        HttpSession misession1 = request.getSession(true);
        misession1.setAttribute("datoCliente",  datoCliente);
        
        //Cargo Id - nombre - apellido del Cliente
        String datoCliente2 = control.buscarCliente2(dni);
        HttpSession misession2 = request.getSession(true);
        misession2.setAttribute("datoCliente2",  datoCliente2);
      
        response.sendRedirect("venta_Serv_Turist.jsp");
        
    }
    

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
