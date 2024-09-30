package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Cargo;
import logica.Usuario;
import persistencia.exceptions.NonexistentEntityException;
public class ControladoraPersistencia {
    UsuarioJpaController usuarioJPA = new UsuarioJpaController();
    CargoJpaController cargoJPA = new CargoJpaController();

    public List<Usuario> traerUsuario() {
        List<Usuario> listaUsuario = usuarioJPA.findUsuarioEntities();
        return listaUsuario;
        //SELECT * FROM entities
    }

    public List<Cargo> traerCargos() {
        return cargoJPA.findCargoEntities();
    }

    public void crearUsuario(Usuario usu) {
        usuarioJPA.create(usu);
    }

    public void borrarUsuario(int id_usuario) {
        try {
            usuarioJPA.destroy(id_usuario);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario traerUsuarioEdicion(int id_usuario) {
        return usuarioJPA.findUsuario(id_usuario);
    }

    public void editarUsuario(Usuario usu) {
        try {
            usuarioJPA.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
  

    

    
}
