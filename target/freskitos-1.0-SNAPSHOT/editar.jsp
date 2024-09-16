
<%@page import="Logica.registro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Usuario</title>
    </head>
    <body>
        <% registro usu = (registro) request.getSession().getAttribute("usuEditar"); %>
        <h4>Datos del Usuario</h4>
        <form action="svEditar" method="POST" class="form-register">
            <input class="controls" type="text" name="nombre" value="<%=usu.getNombre()%>" id="nombre" placeholder="Ingrese su Nombre">
            <input class="controls" type="text" name="apellido" value="<%=usu.getApellido()%>" id="apellido" placeholder="Ingrese su Apellido">
            <input class="controls" type="email" name="correo" value="<%=usu.getCorreo()%>" id="correo" placeholder="Ingrese su Correo">
            <input class="controls" type="password" name="contraseña" value="<%=usu.getContraseña()%>" id="contraseña" placeholder="Ingrese su Contraseña">
        <a href="/paginas/TerminosCondiciones.html">Terminos y Condiciones</a>
            <input class="botons" type="submit" value="Guardar">
        <p><a href="/paginas/Login.html">¿Ya tienes una Cuenta?</a></p>
    </form>
        
        
    </body>
</html>
