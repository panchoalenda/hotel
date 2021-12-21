
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;


@WebServlet(name = "SvUsuario", urlPatterns = {"/SvUsuario"})
public class SvUsuario extends HttpServlet {
    
    Controladora control = new Controladora(); //Con esta linea conecto el Servlet con la logica
    
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
        
        String usuario = request.getParameter("usuario"); //Los valores entre parentesis y comillas son los que traemos desde el jsp
        String contrasenia = request.getParameter("contrasenia");
        
        boolean verificado = control.verificarUsuario(usuario, contrasenia);
        String busUsuario = "";
        
        if (verificado == true){
            
            //obtengo la sesion y le asigno el usuario y contraseña a validar
            HttpSession misession = request.getSession(true);
            misession.setAttribute("usuario", usuario);
            misession.setAttribute("contrasenia", contrasenia);
            control.devUsuario(busUsuario);
            
            response.sendRedirect("index.jsp");//Si esta todo ok, redirijo a principal
        } else {
            response.sendRedirect("login.jsp");  //En caso que no coincidan usuario y/o contraseña, redirijo a login nuevamente
        }
        
        
            
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
