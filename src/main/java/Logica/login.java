
package Logica;


public class login {
    
    private String nombre;
    private String contraseña;
    
    
    /*CONSTRUCTORES*/

    public login() {
    }

    public login(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
    }
    
    
    /*GETTER AND SETTER*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
}
