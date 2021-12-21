
package logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Cliente implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_Cliente;
    private String nombre;
    private String apellido;
    private String direccion;
    private String dni;
@Temporal(TemporalType.DATE)
    private java.util.Date fec_nac;
    private String nacionalidad;
    private String celular;
    private String email;
    
    @OneToMany
    private List<Venta> listaVenta;
    @ManyToOne
    private PaqueteTuristico paqueteturistico;
    
    
    

    public Cliente() {
    }

    public Cliente(int id_Cliente, String nombre, String apellido, String direccion, String dni, Date fec_nac, String nacionalidad, String celular, String email, List<Venta> listaVenta) {
        this.id_Cliente = id_Cliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.dni = dni;
        this.fec_nac = fec_nac;
        this.nacionalidad = nacionalidad;
        this.celular = celular;
        this.email = email;
        this.listaVenta = listaVenta;
    }

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
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

    public List<Venta> getListaVenta() {
        return listaVenta;
    }

    public void setListaVenta(List<Venta> listaVenta) {
        this.listaVenta = listaVenta;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_Cliente=" + id_Cliente + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", dni=" + dni + ", fec_nac=" + fec_nac + ", nacionalidad=" + nacionalidad + ", celular=" + celular + ", email=" + email + ", listaVenta=" + listaVenta + '}';
    }
    

}
