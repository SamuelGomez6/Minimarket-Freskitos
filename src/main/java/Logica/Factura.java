
package Logica;


public class Factura {
    
    private String nombre_usuario;
    private String apellido_usuario;
    private String correo_usuario;
    private String codigo;
    private String nombre_empresa;
    private String productos;
    private String cantidad;
    private String precio_unitario;
    private String precioTotal;
    private String fecha;
    private String numero_pedido;

    public Factura() {
    }

    public Factura(String nombre_usuario, String apellido_usuario, String correo_usuario, String codigo, String nombre_empresa, String productos, String cantidad, String precio_unitario, String precioTotal, String fecha, String numero_pedido) {
        this.nombre_usuario = nombre_usuario;
        this.apellido_usuario = apellido_usuario;
        this.correo_usuario = correo_usuario;
        this.codigo = codigo;
        this.nombre_empresa = nombre_empresa;
        this.productos = productos;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
        this.precioTotal = precioTotal;
        this.fecha = fecha;
        this.numero_pedido = numero_pedido;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getApellido_usuario() {
        return apellido_usuario;
    }

    public void setApellido_usuario(String apellido_usuario) {
        this.apellido_usuario = apellido_usuario;
    }

    public String getCorreo_usuario() {
        return correo_usuario;
    }

    public void setCorreo_usuario(String correo_usuario) {
        this.correo_usuario = correo_usuario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(String precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public String getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(String precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNumero_pedido() {
        return numero_pedido;
    }

    public void setNumero_pedido(String numero_pedido) {
        this.numero_pedido = numero_pedido;
    }
    
    
    
}
