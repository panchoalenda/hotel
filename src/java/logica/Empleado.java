
package logica;



import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Empleado implements Serializable {
    
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_empleado;
    
    private String nombre;
    private String apellido;
    private String direccion;
    private String dni;
@Temporal(TemporalType.DATE)
    private java.util.Date fec_nac;
    private String nacionalidad;
    private String celular;
    private String email;
    private String cargo;
    private double sueldo;
    //private String nombreUsu;
    //private String contrasenia;
    
    @OneToMany
    private List<Venta> listaVenta;
   
    @OneToOne
    private Usuario usu;
    
    @ManyToMany
    private List<PaqueteTuristico> paqueteturistico;

    public Empleado() {
    }

    public Empleado(int id_empleado, String nombre, String apellido, String direccion, String dni, Date fec_nac, String nacionalidad, String celular, String email, String cargo, double sueldo, List<Venta> listaVenta, Usuario usu, List<PaqueteTuristico> paqueteturistico) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.dni = dni;
        this.fec_nac = fec_nac;
        this.nacionalidad = nacionalidad;
        this.celular = celular;
        this.email = email;
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.listaVenta = listaVenta;
        this.usu = usu;
        this.paqueteturistico = paqueteturistico;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFec_nac() {
        return fec_nac;
    }

    public void setFec_nac(Date fec_nac) {
        this.fec_nac = fec_nac;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public List<Venta> getListaVenta() {
        return listaVenta;
    }

    public void setListaVenta(List<Venta> listaVenta) {
        this.listaVenta = listaVenta;
    }

    public Usuario getUsu() {
        return usu;
    }

    public void setUsu(Usuario usu) {
        this.usu = usu;
    }

    public List<PaqueteTuristico> getPaqueteturistico() {
        return paqueteturistico;
    }

    public void setPaqueteturistico(List<PaqueteTuristico> paqueteturistico) {
        this.paqueteturistico = paqueteturistico;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id_empleado=" + id_empleado + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", dni=" + dni + ", fec_nac=" + fec_nac + ", nacionalidad=" + nacionalidad + ", celular=" + celular + ", email=" + email + ", cargo=" + cargo + ", sueldo=" + sueldo + ", listaVenta=" + listaVenta + ", usu=" + usu + ", paqueteturistico=" + paqueteturistico + '}';
    }

   
}
