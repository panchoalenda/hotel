
package logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;



@Entity
public class ServicioTuristico implements Serializable {

@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
        private int codigo_servicio;
        private String nombre;
        private String descripcion;
        private String destino_servicio;
        private Double costo_servicio;
@OneToMany(mappedBy = "Ser_turistico")
        private List<Venta> vta_Servicio;
@OneToMany
        private List<Cliente> Cliente_Servicio;  
@ManyToMany
        private List<Empleado> Empleado_Servicio;  



    public ServicioTuristico() {
    }

    public ServicioTuristico(int codigo_servicio, String nombre, String descripcion, String destino_servicio, Double costo_servicio, List<Venta> vta_Servicio, List<Cliente> Cliente_Servicio, List<Empleado> Empleado_Servicio) {
        this.codigo_servicio = codigo_servicio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.destino_servicio = destino_servicio;
        this.costo_servicio = costo_servicio;
        this.vta_Servicio = vta_Servicio;
        this.Cliente_Servicio = Cliente_Servicio;
        this.Empleado_Servicio = Empleado_Servicio;
    }

    public int getCodigo_servicio() {
        return codigo_servicio;
    }

    public void setCodigo_servicio(int codigo_servicio) {
        this.codigo_servicio = codigo_servicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDestino_servicio() {
        return destino_servicio;
    }

    public void setDestino_servicio(String destino_servicio) {
        this.destino_servicio = destino_servicio;
    }

    public Double getCosto_servicio() {
        return costo_servicio;
    }

    public void setCosto_servicio(Double costo_servicio) {
        this.costo_servicio = costo_servicio;
    }

    public List<Venta> getVta_Servicio() {
        return vta_Servicio;
    }

    public void setVta_Servicio(List<Venta> vta_Servicio) {
        this.vta_Servicio = vta_Servicio;
    }

    public List<Cliente> getCliente_Servicio() {
        return Cliente_Servicio;
    }

    public void setCliente_Servicio(List<Cliente> Cliente_Servicio) {
        this.Cliente_Servicio = Cliente_Servicio;
    }

    public List<Empleado> getEmpleado_Servicio() {
        return Empleado_Servicio;
    }

    public void setEmpleado_Servicio(List<Empleado> Empleado_Servicio) {
        this.Empleado_Servicio = Empleado_Servicio;
    }

    @Override
    public String toString() {
        return "ServicioTuristico{" + "codigo_servicio=" + codigo_servicio + ", nombre=" + nombre + ", descripcion=" + descripcion + ", destino_servicio=" + destino_servicio + ", costo_servicio=" + costo_servicio + ", vta_Servicio=" + vta_Servicio + ", Cliente_Servicio=" + Cliente_Servicio + ", Empleado_Servicio=" + Empleado_Servicio + '}';
    }
 
   
}
