package logica;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cargo implements Serializable {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Basic
    private String nombreCargo;
    private String descripcion;
    @OneToMany (mappedBy = "cargo")
    private List <Usuario> listaUsuario;

    public Cargo() {
    }

    public Cargo(int id, String nombreCargo, String descripcion) {
        this.id = id;
        this.nombreCargo = nombreCargo;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Usuario> getListaUsuario() {
        return listaUsuario;
    }

    public void setListaUsuario(List<Usuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }

  
    
    
}
