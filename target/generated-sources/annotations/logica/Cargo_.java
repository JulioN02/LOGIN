package logica;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Usuario;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-09-30T13:19:12", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Cargo.class)
public class Cargo_ { 

    public static volatile SingularAttribute<Cargo, String> descripcion;
    public static volatile SingularAttribute<Cargo, String> nombreCargo;
    public static volatile ListAttribute<Cargo, Usuario> listaUsuario;
    public static volatile SingularAttribute<Cargo, Integer> id;

}