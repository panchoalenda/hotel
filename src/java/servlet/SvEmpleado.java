
package servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Controladora;

@WebServlet(name = "SvEmpleado", urlPatterns = {"/SvEmpleado"})
public class SvEmpleado extends HttpServlet {

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
        
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            String conv = request.getParameter("fec_nac");
            Date fec_nac=null; 
            
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String direccion = request.getParameter("direccion");
            String dni = request.getParameter("dni");                       
            String nac = request.getParameter("nac");
            String celular = request.getParameter("celular");
            String email = request.getParameter("email");
            String cargo = request.getParameter("cargo");
            Double sueldo = Double.parseDouble(request.getParameter("sueldo"));
            String nombreUsu = request.getParameter("nombreUsu");
            String contrasenia = request.getParameter("contrasenia");
            
        
            try {
                fec_nac= formato.parse(conv);
            } catch (ParseException ex) {
                Logger.getLogger(SvEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            control.crearEmpleado(nombre, apellido, direccion, fec_nac, dni, nac, celular, email, cargo, sueldo, nombreUsu, contrasenia);
            response.sendRedirect("index.jsp");
       
      
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
