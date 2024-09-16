package persistencia;

import Logica.registro;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.exceptions.NonexistentEntityException;


public class ControladoraPersistencia {
    
    RegistroJpaController usuJpa = new RegistroJpaController ();
    
    //Operacion CREATE
    public void crearUsuario (registro usu) {
        
        usuJpa.create(usu);
    }
    
    //Operacion READ
    public List<registro> traerUsuarios () {
        return usuJpa.findregistroEntities();
    }

    public void borrarUsuario(int id_eliminar) {
        try {
            usuJpa.destroy(id_eliminar);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public registro traerUsuarios(int id_editar) {
        return usuJpa.findregistro(id_editar);
    }

    public void editar(registro usu) {
        try {
            usuJpa.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
