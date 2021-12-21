
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Cliente;
import logica.Empleado;
import logica.PaqueteTuristico;
import logica.ServicioTuristico;
import logica.Usuario;
import logica.Venta;
import persistencia.exceptions.NonexistentEntityException;


public class ControladoraPersistencia {
    
    EmpleadoJpaController empleJPA = new EmpleadoJpaController();
    UsuarioJpaController usuJPA = new UsuarioJpaController();
    ClienteJpaController clieJPA = new ClienteJpaController();
    ServicioTuristicoJpaController servJPA = new ServicioTuristicoJpaController();
    VentaJpaController ventJPA = new VentaJpaController();
    PaqueteTuristicoJpaController paqueteJPA = new PaqueteTuristicoJpaController();
    
    
    
    public void crearEmpleado(Empleado emple, Usuario usu){
       usuJPA.create(usu);
       empleJPA.create(emple);
       
}

    public void crearCliente(Cliente clie) {
        
        try {
            clieJPA.create(clie);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Usuario> traerUsuario() {
       return usuJPA.findUsuarioEntities();
    }

    public List<Cliente> traerCliente() {
        return clieJPA.findClienteEntities();
    }

    public void crearServicio(ServicioTuristico servi) {
        servJPA.create(servi);
    }

    public List<ServicioTuristico> crearListaServicio() {
    
        return servJPA.findServicioTuristicoEntities();           
    }    

    public List<ServicioTuristico> traerListaSer() {
       return servJPA.findServicioTuristicoEntities();
    }

    public List<Empleado> leerListaEmple() {
        return empleJPA.findEmpleadoEntities();
    }

    public List<Usuario> traerListaUd() {
        return usuJPA.findUsuarioEntities();
    }

    public void crearVentaPaq(Venta ventpaq) {
        ventJPA.create(ventpaq);
    }

    public void crearPaquete(PaqueteTuristico paq) {
        paqueteJPA.create(paq);
    }

    public List<Venta> leerListaVenta() {
    return ventJPA.findVentaEntities();
    }

    public List<PaqueteTuristico> leerListaPaquete() {
        return paqueteJPA.findPaqueteTuristicoEntities();
    }

    public List<Venta> traerlistaFechaComp() {
        return  ventJPA.findVentaEntities();
    }

    public List<ServicioTuristico> leerListaServicio() {
        return servJPA.findServicioTuristicoEntities();
    }

    public List<Venta> traerlistaVenta() {
      return ventJPA.findVentaEntities();
    }

    public List<Cliente> crearListaCliente() {
     return clieJPA.findClienteEntities();
    }

    public void eliminarServ(int id_serv) {
        try {
            servJPA.destroy(id_serv);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<PaqueteTuristico> traerListaPaq() {
 return paqueteJPA.findPaqueteTuristicoEntities();
    }

    public void eliminarPaq(int id_paq) {
        try {
            paqueteJPA.destroy(id_paq);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarClie(int id_cliente) {
        try {
            clieJPA.destroy(id_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarEmple(int id_emple) {
        try {
            empleJPA.destroy(id_emple);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Cliente buscarCliente(int id_cliente) {
    return clieJPA.findCliente(id_cliente);
    }

    public void modCliente(Cliente clien) {
        try {
            clieJPA.edit(clien);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }}



    

