
package servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Cliente;
import logica.Controladora;
import logica.Empleado;


@WebServlet(name = "SvBuscaCliente", urlPatterns = {"/SvBuscaCliente"})
public class SvBuscaCliente extends HttpServlet {

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
       
        String dni = request.getParameter("buscarDNI");
        
        System.out.println("el dni reuperado es " + dni);
        boolean ver=control.verificarcliente(dni);
        
        
        if (ver) {
        
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("verificado", ver);
      
        response.sendRedirect("venta_Paq_Turist.jsp");
        
    }
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
