
package logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class PaqueteTuristico implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
        private int codigo_paquete;
@Basic
        private List<ServicioTuristico> lista_servicio_incluidos;
        private String descripcion;
        private String destino_PaqueteTuristico;
        private Double costo_PaqueteTuristico;

@Temporal(TemporalType.DATE)
        private Date fecha_PaqueteTuristico;
@OneToMany
        private List<Venta> vta_PaqueteTuristico;  
@OneToMany
        private List<Cliente> Cliente_PaqueteTuristico;  
@ManyToMany
        private List<Empleado> Empleado_PaqueteTuristico;  
 

    public PaqueteTuristico() {
    }

    public PaqueteTuristico(int codigo_paquete, List<ServicioTuristico> lista_servicio_incluidos, String descripcion, String destino_PaqueteTuristico, Double costo_PaqueteTuristico, Date fecha_PaqueteTuristico, List<Venta> vta_PaqueteTuristico, List<Cliente> Cliente_PaqueteTuristico, List<Empleado> Empleado_PaqueteTuristico) {
        this.codigo_paquete = codigo_paquete;
        this.lista_servicio_incluidos = lista_servicio_incluidos;
        this.descripcion = descripcion;
        this.destino_PaqueteTuristico = destino_PaqueteTuristico;
        this.costo_PaqueteTuristico = costo_PaqueteTuristico;
        this.fecha_PaqueteTuristico = fecha_PaqueteTuristico;
        this.vta_PaqueteTuristico = vta_PaqueteTuristico;
        this.Cliente_PaqueteTuristico = Cliente_PaqueteTuristico;
        this.Empleado_PaqueteTuristico = Empleado_PaqueteTuristico;
    }

    public int getCodigo_paquete() {
        return codigo_paquete;
    }

    public void setCodigo_paquete(int codigo_paquete) {
        this.codigo_paquete = codigo_paquete;
    }

    public List<ServicioTuristico> getLista_servicio_incluidos() {
        return lista_servicio_incluidos;
    }

    public void setLista_servicio_incluidos(List<ServicioTuristico> lista_servicio_incluidos) {
        this.lista_servicio_incluidos = lista_servicio_incluidos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDestino_PaqueteTuristico() {
        return destino_PaqueteTuristico;
    }

    public void setDestino_PaqueteTuristico(String destino_PaqueteTuristico) {
        this.destino_PaqueteTuristico = destino_PaqueteTuristico;
    }

    public Double getCosto_PaqueteTuristico() {
        return costo_PaqueteTuristico;
    }

    public void setCosto_PaqueteTuristico(Double costo_PaqueteTuristico) {
        this.costo_PaqueteTuristico = costo_PaqueteTuristico;
    }

    public Date getFecha_PaqueteTuristico() {
        return fecha_PaqueteTuristico;
    }

    public void setFecha_PaqueteTuristico(Date fecha_PaqueteTuristico) {
        this.fecha_PaqueteTuristico = fecha_PaqueteTuristico;
    }

    public List<Venta> getVta_PaqueteTuristico() {
        return vta_PaqueteTuristico;
    }

    public void setVta_PaqueteTuristico(List<Venta> vta_PaqueteTuristico) {
        this.vta_PaqueteTuristico = vta_PaqueteTuristico;
    }

    public List<Cliente> getCliente_PaqueteTuristico() {
        return Cliente_PaqueteTuristico;
    }

    public void setCliente_PaqueteTuristico(List<Cliente> Cliente_PaqueteTuristico) {
        this.Cliente_PaqueteTuristico = Cliente_PaqueteTuristico;
    }

    public List<Empleado> getEmpleado_PaqueteTuristico() {
        return Empleado_PaqueteTuristico;
    }

    public void setEmpleado_PaqueteTuristico(List<Empleado> Empleado_PaqueteTuristico) {
        this.Empleado_PaqueteTuristico = Empleado_PaqueteTuristico;
    }

    @Override
    public String toString() {
        return "PaqueteTuristico{" + "codigo_paquete=" + codigo_paquete + ", lista_servicio_incluidos=" + lista_servicio_incluidos + ", descripcion=" + descripcion + ", destino_PaqueteTuristico=" + destino_PaqueteTuristico + ", costo_PaqueteTuristico=" + costo_PaqueteTuristico + ", fecha_PaqueteTuristico=" + fecha_PaqueteTuristico + ", vta_PaqueteTuristico=" + vta_PaqueteTuristico + ", Cliente_PaqueteTuristico=" + Cliente_PaqueteTuristico + ", Empleado_PaqueteTuristico=" + Empleado_PaqueteTuristico + '}';
    }
    
    
}
