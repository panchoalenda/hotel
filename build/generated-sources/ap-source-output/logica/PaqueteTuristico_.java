package logica;

import java.util.Date;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Cliente;
import logica.Empleado;
import logica.Venta;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-12-20T22:28:50")
@StaticMetamodel(PaqueteTuristico.class)
public class PaqueteTuristico_ { 

    public static volatile SingularAttribute<PaqueteTuristico, String> descripcion;
    public static volatile SingularAttribute<PaqueteTuristico, Double> costo_PaqueteTuristico;
    public static volatile SingularAttribute<PaqueteTuristico, Date> fecha_PaqueteTuristico;
    public static volatile ListAttribute<PaqueteTuristico, Empleado> Empleado_PaqueteTuristico;
    public static volatile SingularAttribute<PaqueteTuristico, Integer> codigo_paquete;
    public static volatile ListAttribute<PaqueteTuristico, Cliente> Cliente_PaqueteTuristico;
    public static volatile SingularAttribute<PaqueteTuristico, String> destino_PaqueteTuristico;
    public static volatile ListAttribute<PaqueteTuristico, Venta> vta_PaqueteTuristico;
    public static volatile SingularAttribute<PaqueteTuristico, List> lista_servicio_incluidos;

}