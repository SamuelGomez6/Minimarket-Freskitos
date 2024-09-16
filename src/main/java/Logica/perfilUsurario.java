
package Logica;


public class perfilUsurario {
    
    private String nombre;
    private String apellido;
    private String Contraseña;
    private String Correo;
    
    /*CONSTRUCTORES*/

    public perfilUsurario() {
    }

    public perfilUsurario(String nombre, String apellido, String Contraseña, String Correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Contraseña = Contraseña;
        this.Correo = Correo;
    }

    /*GETTER AND SETTER*/
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
    
    
    
}
