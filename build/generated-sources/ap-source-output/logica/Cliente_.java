package logica;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.PaqueteTuristico;
import logica.Venta;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-12-20T22:28:50")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, Date> fec_nac;
    public static volatile ListAttribute<Cliente, Venta> listaVenta;
    public static volatile SingularAttribute<Cliente, String> apellido;
    public static volatile SingularAttribute<Cliente, Integer> id_Cliente;
    public static volatile SingularAttribute<Cliente, String> direccion;
    public static volatile SingularAttribute<Cliente, String> celular;
    public static volatile SingularAttribute<Cliente, PaqueteTuristico> paqueteturistico;
    public static volatile SingularAttribute<Cliente, String> nombre;
    public static volatile SingularAttribute<Cliente, String> dni;
    public static volatile SingularAttribute<Cliente, String> email;
    public static volatile SingularAttribute<Cliente, String> nacionalidad;

}