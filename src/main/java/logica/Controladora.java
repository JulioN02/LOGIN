package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia controlPersis;

    public Controladora() {
        controlPersis = new ControladoraPersistencia();
    }

    public Usuario validarUsuario(String usuario, String contrasena) {
        Usuario validacion = null;
        List<Usuario> listaUsuarios = controlPersis.traerUsuario();

        for (Usuario usu : listaUsuarios) {
            if (usu.getNombreUsuario().equals(usuario)) {
                if (usu.getContrasena().equals(contrasena)) {
                    validacion = usu;
                    return validacion;
                } else {
                    validacion = null;
                    return validacion;
                }
            } else {
                validacion = null;
            }
        }
        return validacion;
    }

    public List<Usuario> traerUsuarios() {
        return controlPersis.traerUsuario();
    }

    public void crearUsuario(String usuario, String contrasena, String cargoRecibido) {
        Usuario usu = new Usuario();
        usu.setNombreUsuario(usuario);
        usu.setContrasena(contrasena);
        
        Cargo cargoEncontrado = new Cargo();
        cargoEncontrado = this.traerCargo(cargoRecibido);
        if (cargoEncontrado!=null){
            usu.setCargo(cargoEncontrado);
        }
        int id = this.ultimaIdUsuario();
        usu.setId(id+1);
        
        controlPersis.crearUsuario(usu);
    }

    public List<Cargo> traerCargos() {
        return controlPersis.traerCargos();
    }

    private Cargo traerCargo(String cargoRecibido) {
        List<Cargo> listaCargos = controlPersis.traerCargos();
        for (Cargo cargo : listaCargos){
            if (cargo.getNombreCargo().equals(cargoRecibido)){
                return cargo;
            }
        }
        return null;
    }

    private int ultimaIdUsuario() {
       List<Usuario> listaUsuarios = this.traerUsuarios();
       Usuario usu = listaUsuarios.get(listaUsuarios.size()-1);
       return usu.getId();
    }

    public void borrarUsuario(int id_usuario) {
        controlPersis.borrarUsuario(id_usuario);
    }

    public Usuario traerUsuario(int id_usuario) {
        return controlPersis.traerUsuarioEdicion(id_usuario);
    }

    public void editarUsuario(Usuario usu, String usuario, String contrasena, String cargoRecibido) {
        usu.setNombreUsuario(usuario);
        usu.setContrasena(contrasena);
        Cargo cargoEncontrado = new Cargo();
        cargoEncontrado = this.traerCargo(cargoRecibido);
        if (cargoEncontrado!=null){
            usu.setCargo(cargoEncontrado);
        }
        controlPersis.editarUsuario(usu);
    }


    


}
