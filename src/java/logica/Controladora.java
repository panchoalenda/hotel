
package logica;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import persistencia.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia controlPersi = new ControladoraPersistencia();
    Empleado emple = new Empleado();
    Usuario usu = new Usuario();
    Cliente clie = new Cliente();
    ServicioTuristico servi = new ServicioTuristico();
    PaqueteTuristico paq = new PaqueteTuristico();
    Venta ventpaq = new Venta();
    
    
    //Creo Empleado y su usuario correspondiente
    public void crearEmpleado(String nombre, String apellido, String direccion, Date fec_nac, String dni, String nac, String celular, String email, String cargo, Double sueldo, String nombreUsu, String contrasenia) {
        
        //Asigno valores a empleado
        emple.setNombre(nombre);
        emple.setApellido(apellido);
        emple.setDireccion(direccion);
        emple.setFec_nac(fec_nac);
        emple.setDni(dni);
        emple.setNacionalidad(nac);
        emple.setCelular(celular);
        emple.setEmail(email);
        emple.setCargo(cargo);
        emple.setSueldo(sueldo);
        
        //Asigno valores a usuario
        usu.setNombreUsu(nombreUsu);
        usu.setContrasenia(contrasenia);
        
        //Asigno usuario a empleado
        emple.setUsu(usu);
        
        controlPersi.crearEmpleado(emple,usu); 
    }
    
    
    //Creo un cliente
    public void crearCliente(String nombre, String apellido, String direccion, Date fec_nac, String dni, String nac, String celular, String email) {
      
        //Asigno valores a Cliente
        clie.setNombre(nombre);
        clie.setApellido(apellido);
        clie.setDireccion(direccion);
        clie.setDni(dni);
        
        
        clie.setFec_nac(fec_nac);
        clie.setNacionalidad(nac);
        clie.setCelular(celular);
        clie.setEmail(email);
        
        controlPersi.crearCliente(clie);
        
    }

    //Verifico logueo de cliente
    public boolean verificarUsuario(String usuario, String contrasenia) {
        
        List<Usuario> listaUsuario = controlPersi.traerUsuario();
        
        if(listaUsuario != null){
            for(Usuario usua : listaUsuario){
                if (usua.getNombreUsu().equals(usuario) && usua.getContrasenia().equals(contrasenia)){
                    return true;
                }
            }
        } 
        return false;
    }

   /* public String buscarCliente(String dni) {
        
       List<Cliente> listaCliente = controlPersi.traerCliente();
       
        if(listaCliente != null){
            for(Cliente clien : listaCliente){
                if (clien.getDni().equals(dni)) {
                    return Integer.toString(clien.getId_Cliente());
                }
            }
        }
        return "El cliente no se encuentra en la BD!!";
    }*/
    
     public String buscarCliente(String dni) {
        
       List<Cliente> listaCliente = controlPersi.traerCliente();
       
        if(listaCliente != null){
             for(Cliente clien : listaCliente){
                System.out.println("el tipo de variable es :"+clien.getDni().getClass().getSimpleName() );
                if (clien.getDni().equals(dni)) {
                    return (String.valueOf(clien.getId_Cliente()));
                }
            }
        }
        return "El cliente no se encuentra en la BD!!";
    }
     
     public String buscarCliente2(String dni) {
        
       List<Cliente> listaCliente = controlPersi.traerCliente();
       
        if(listaCliente != null){
            for(Cliente clien : listaCliente){
                if (clien.getDni().equals(dni)) {
                    return "("+clien.getId_Cliente()+") - "+clien.getNombre()+" "+clien.getApellido();
                }
            }
        }
        return "El cliente no se encuentra en la BD!!";
    }

    public void agregarServicio(String nombre_servicio, String descripcion, String destino_servicio, Double costo_servicio) {
       
        servi.setNombre(nombre_servicio);
        servi.setDescripcion(descripcion);
        servi.setDestino_servicio(destino_servicio);
        servi.setCosto_servicio(costo_servicio);
        
        controlPersi.crearServicio(servi);
                
    }

    public List<ServicioTuristico> traerlistaServicios() {
       
        List<ServicioTuristico> listaServicio= controlPersi.crearListaServicio();
        
        return listaServicio;
    }
    

    public double crerVentaPaquete(String[] cod_serv) {
      
      List<ServicioTuristico> listaSer= controlPersi.traerListaSer();
      
      
       int[] numbers = new int[cod_serv.length];
        for(int i = 0;i < cod_serv.length;i++)
        {
           numbers[i] = Integer.parseInt(cod_serv[i]);
        }
               double CostoPaquete=0;

              if(cod_serv != null){
                    for(ServicioTuristico ser : listaSer){
                        for (int number : numbers) {
                          if (ser.getCodigo_servicio()==number) {
                              CostoPaquete = CostoPaquete + ser.getCosto_servicio();
                        }
                    }
        }
                  System.out.println(CostoPaquete);
    } return CostoPaquete;
    }
    
    
    
   public List<Empleado> traerlistaEmpleado() {
       
        List<Empleado> listaEmple= controlPersi.leerListaEmple();
        
        return listaEmple;
    }

    public String devUsuario(String busUsuario) {
         
        List<Usuario> listaUs= controlPersi.traerListaUd();
        String UsuId="";
        
        for (Usuario listaU : listaUs) {
            if (listaU.getNombreUsu().equals(busUsuario)) {
                UsuId=Integer.toString(listaU.getId());
            }
         }
        
            return UsuId;
     
    }
    
     public String devUsuarioInput(String busUsuario) {
         
        List<Empleado> listaEmp= controlPersi.leerListaEmple();
        String EmpleName="";
        
        for (Empleado listaU : listaEmp) {
            if (Integer.toString(listaU.getId_empleado()).equals(busUsuario)) {
                EmpleName=listaU.getNombre()+" "+listaU.getApellido();
            }
         }
            System.out.println("empleado " + EmpleName);
            return EmpleName;
     
    }

    

    public void agregarPaqT(String[] cod_serv, String descripcion, String destino, double ct_paquete, Date fec_Paq) {
      
      int[] cod_ser = new int[cod_serv.length];
      ArrayList list_paq = new ArrayList();
       
      for(int i = 0;i < cod_serv.length;i++)
            {
               cod_ser[i] = Integer.parseInt(cod_serv[i]);
            }
          for (int i=0;i<list_paq.size();i++) {
            
              list_paq.add(cod_ser);
      
             }
          
          
        paq.setLista_servicio_incluidos(list_paq);
        paq.setDescripcion(descripcion);
        paq.setDestino_PaqueteTuristico(destino);
        paq.setCosto_PaqueteTuristico(ct_paquete);
        paq.setFecha_PaqueteTuristico(fec_Paq);
        
        controlPersi.crearPaquete(paq);
      
    }
   
    public void vtaPaquete(int cod_paquete, Date fec_vta, int id_empleado, int numCliente, String for_Pago) {
             
        emple.setId_empleado(id_empleado);
        clie.setId_Cliente(numCliente);
        paq.setCodigo_paquete(cod_paquete);
        
        ventpaq.setFec_venta(fec_vta);
        ventpaq.setMedio_pago(for_Pago);
        ventpaq.setCliente(clie);
        ventpaq.setEmpleado(emple);
        ventpaq.setPaq_turistico(paq);
        
        
       controlPersi.crearVentaPaq(ventpaq);
    }

    public int traerCodPaquete() {
        List<PaqueteTuristico> listPaq= controlPersi.leerListaPaquete();
        int ultimoPaquete=0;
        for (PaqueteTuristico paqueteTuristico : listPaq) {
            ultimoPaquete = paqueteTuristico.getCodigo_paquete();
        }
        
        return ultimoPaquete;
    }
    
    public List<Venta> traerlistaVentas(){
        List<Venta> listaVentas = controlPersi.leerListaVenta();
        return listaVentas;
    }

    public String conv_fec(){
        
        List<Venta> list_vta = controlPersi.traerlistaFechaComp();
        String fechaComoCadena="";
        
        for (Venta venta : list_vta) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd"); 
         fechaComoCadena = sdf.format(venta);    
           
        }
   return fechaComoCadena;
}
    public int traerCodServicio(){
        
        List<ServicioTuristico> listSer= controlPersi.leerListaServicio();
        int ultimoPaquete=0;
        for (ServicioTuristico paqueteTuristico : listSer) {
            ultimoPaquete = paqueteTuristico.getCodigo_servicio();
        }
        
        return ultimoPaquete;
    }

    public void vtaServicio(int cod_servicio, Date fec_vta, int id_emple, int nu_cliente, String for_Pago) {
        
        emple.setId_empleado(id_emple);
        clie.setId_Cliente(nu_cliente);
        servi.setCodigo_servicio(cod_servicio);
        
        
        ventpaq.setFec_venta(fec_vta);
        ventpaq.setMedio_pago(for_Pago);
        ventpaq.setCliente(clie);
        ventpaq.setEmpleado(emple);
        ventpaq.setSer_turistico(servi);
        
        
       controlPersi.crearVentaPaq(ventpaq);
    }

    public String buscarventa(String num_venta) {
         
        List<Venta> listaVenta = controlPersi.traerlistaVenta();
       
        if(listaVenta != null){
             for(Venta vta : listaVenta){
               
                if (String.valueOf(vta.getId()).equals(num_venta)) {
                    return (num_venta);
                }
            }
        }
        return "No existe una venta con ese número!!";
    }
            
    public List<Cliente> traerlistaCliente() {
       
      return controlPersi.crearListaCliente();       
        
}

    public void eliminarServicio(int id_serv) {
                
        controlPersi.eliminarServ(id_serv);
        
    }

    public boolean valId(int id_serv) {
        List<ServicioTuristico> listaServ= controlPersi.traerListaSer();
        for (ServicioTuristico servicioTuristico : listaServ) {
            if (servicioTuristico.getCodigo_servicio()==id_serv) {
                return true;
                
            }
            
        }
        return false;
    }

    public boolean valId_paq(int id_paq) {
       List<PaqueteTuristico> listaPaq= controlPersi.traerListaPaq();
        for (PaqueteTuristico paqueteTuristico : listaPaq) {
            if ((paqueteTuristico.getCodigo_paquete())==id_paq) {
                return true;
            } else {
            }
            
        }
        return false;
    }
    
    
    public List<PaqueteTuristico> traerlistaPaq() {
       
        List<PaqueteTuristico> listaPaq= controlPersi.traerListaPaq();
        
        return listaPaq;
}

    public void eliminarPaq(int id_paq) {
        controlPersi.eliminarPaq(id_paq);
    }

    public boolean valId_clie(int id_cliente) {
       
       List<Cliente> listaClie= controlPersi.traerCliente();
        for (Cliente listacliente : listaClie) {
            if (id_cliente==listacliente.getId_Cliente()) {
                return true;
            } else {
            }
            
        }
        return false;
    }

    public void eliminarClie(int id_cliente) {
    controlPersi.eliminarClie(id_cliente);
    }

    public boolean verificarcliente(String dni) {
        List<Cliente> listCliente = controlPersi.traerCliente();
        boolean clienteV=false;
        for (Cliente cliente : listCliente) {
          if (cliente.getDni()==dni) {
                     clienteV= true;
        } else {
              clienteV= false;
          }
        }
        return clienteV;
    }

       public void eliminaremple(int id_emple) {
           controlPersi.eliminarEmple(id_emple);
    }

    public Cliente BuscarClie(int id_cliente) {
        
       return controlPersi.buscarCliente(id_cliente);
    }

    public void modificarCliente(Cliente clien) {
        controlPersi.modCliente(clien);
    }
}
    
    

  
    

    
    
   

