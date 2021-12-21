package logica;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Cliente;
import logica.Empleado;
import logica.PaqueteTuristico;
import logica.ServicioTuristico;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-12-20T22:28:50")
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, Cliente> cliente;
    public static volatile SingularAttribute<Venta, PaqueteTuristico> Paq_turistico;
    public static volatile SingularAttribute<Venta, Empleado> empleado;
    public static volatile SingularAttribute<Venta, String> medio_pago;
    public static volatile SingularAttribute<Venta, Integer> id;
    public static volatile SingularAttribute<Venta, ServicioTuristico> Ser_turistico;
    public static volatile SingularAttribute<Venta, Date> fec_venta;

}