
package logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Venta implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Temporal(TemporalType.DATE)
    private Date fec_venta;
    @Basic
    private String medio_pago;
        
    @ManyToOne
    private Empleado empleado;
    @ManyToOne
    private Cliente cliente;
    @ManyToOne
    private PaqueteTuristico Paq_turistico;
   @ManyToOne
    private ServicioTuristico Ser_turistico;

    public Venta() {
    }

    public Venta(int id, Date fec_venta, String medio_pago, Empleado empleado, Cliente cliente, PaqueteTuristico Paq_turistico, ServicioTuristico Ser_turistico) {
        this.id = id;
        this.fec_venta = fec_venta;
        this.medio_pago = medio_pago;
        this.empleado = empleado;
        this.cliente = cliente;
        this.Paq_turistico = Paq_turistico;
        this.Ser_turistico = Ser_turistico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFec_venta() {
        return fec_venta;
    }

    public void setFec_venta(Date fec_venta) {
        this.fec_venta = fec_venta;
    }

    public String getMedio_pago() {
        return medio_pago;
    }

    public void setMedio_pago(String medio_pago) {
        this.medio_pago = medio_pago;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public PaqueteTuristico getPaq_turistico() {
        return Paq_turistico;
    }

    public void setPaq_turistico(PaqueteTuristico Paq_turistico) {
        this.Paq_turistico = Paq_turistico;
    }

    public ServicioTuristico getSer_turistico() {
        return Ser_turistico;
    }

    public void setSer_turistico(ServicioTuristico Ser_turistico) {
        this.Ser_turistico = Ser_turistico;
    }

    @Override
    public String toString() {
        return "Venta{" + "id=" + id + ", fec_venta=" + fec_venta + ", medio_pago=" + medio_pago + ", empleado=" + empleado + ", cliente=" + cliente + ", Paq_turistico=" + Paq_turistico + ", Ser_turistico=" + Ser_turistico + '}';
    }

    
    
}
