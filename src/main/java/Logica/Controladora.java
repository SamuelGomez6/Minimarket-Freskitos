
package Logica;

import java.util.List;
import persistencia.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
        
    public void crearUsuario (registro usu) {
        controlPersis.crearUsuario(usu);
    }
    
    public List<registro> traerUsuarios () {
        return controlPersis.traerUsuarios();
    }

    public void borrarUsuario(int id_eliminar) {
        controlPersis.borrarUsuario(id_eliminar);
    }

    public registro traerUsuario(int id_editar) {
        return controlPersis.traerUsuarios(id_editar);
    }

    public void editarUsuario(registro usu) {
        controlPersis.editar(usu);
    }
    
    
}
