
<%@page import="Logica.registro"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar usuarios</title>
    </head>
    <body>
        <h1>Lista de usuarios registrados</h1>
            <%
                List<registro> listaUsuarios = (List) request.getSession().getAttribute("listaUsuarios");
                int cont = 1;
                    for(registro usu : listaUsuarios) {
            %>
            
                        <p>Usuario N° <%=cont%></p>
                        <p>id: <%=usu.getId()%></p>
                        <p>nombre: <%=usu.getNombre()%></p>
                        <p>apellido: <%=usu.getApellido()%></p>
                        <p>correo: <%=usu.getCorreo()%></p>
                        <p>contraseña: <%=usu.getContraseña()%></p>
                        <p>---------------------------------------</p>
                        <% cont = cont + 1;%> 
            <% } %>
        
    </body>
</html>
