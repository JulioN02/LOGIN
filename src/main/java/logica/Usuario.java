package logica;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Usuario implements Serializable {
    @Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Basic
    private String nombreUsuario;
    private String contrasena;
    @ManyToOne
    @JoinColumn(name = "fk_cargo")
    private Cargo cargo;
    
    public Usuario() {
    }

    public Usuario(int id, String nombreUsuario, String contrasena, Cargo cargo) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }  
    
}
