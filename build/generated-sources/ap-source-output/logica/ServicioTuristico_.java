package logica;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Cliente;
import logica.Empleado;
import logica.Venta;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-12-20T22:28:50")
@StaticMetamodel(ServicioTuristico.class)
public class ServicioTuristico_ { 

    public static volatile SingularAttribute<ServicioTuristico, String> descripcion;
    public static volatile ListAttribute<ServicioTuristico, Cliente> Cliente_Servicio;
    public static volatile SingularAttribute<ServicioTuristico, Double> costo_servicio;
    public static volatile ListAttribute<ServicioTuristico, Venta> vta_Servicio;
    public static volatile SingularAttribute<ServicioTuristico, Integer> codigo_servicio;
    public static volatile SingularAttribute<ServicioTuristico, String> nombre;
    public static volatile SingularAttribute<ServicioTuristico, String> destino_servicio;
    public static volatile ListAttribute<ServicioTuristico, Empleado> Empleado_Servicio;

}