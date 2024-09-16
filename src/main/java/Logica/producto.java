
package Logica;


public class producto {
    
    private String nombre;
    private String precio_unitario;
    private String codigo;
    private String marca;
 
    
    /*CONSTRUCTOR*/

    public producto() {
    }

    public producto(String nombre, String precio_unitario, String codigo, String marca) {
        this.nombre = nombre;
        this.precio_unitario = precio_unitario;
        this.codigo = codigo;
        this.marca = marca;
    }
    
    
    /*GETTER AND SETTER*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(String precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    
}
