<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="models.Carrito" %>
<%@ page import="models.Producto" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Carrito de Compras</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <h1 class="display-4 text-center text-primary">Tu Carrito de Compras</h1>

    <% 
        // Obtener el carrito de la sesión
        Carrito carrito = (Carrito) session.getAttribute("carrito");

        if (carrito != null && carrito.getProductos() != null && !carrito.getProductos().isEmpty()) {
            // Mostrar los productos en el carrito
    %>
    
    <table class="table table-striped">
        <thead>
            <tr>
                <th>Producto</th>
                <th>Descripción</th>
                <th>Precio</th>
            </tr>
        </thead>
        <tbody>
            <% 
                for (Producto producto : carrito.getProductos()) { 
            %>
            <tr>
                <td><%= producto.getNombre() %></td>
                <td><%= producto.getDescripcion() %></td>
                <td>$<%= producto.getPrecio() %></td>
            </tr>
            <% 
                } 
            %>
        </tbody>
    </table>

    <h3>Total: $<%= carrito.getTotal() %></h3>
    
    <% 
        } else {
    %>
        <p>No tienes productos en tu carrito.</p>
    <% 
        }
    %>

    <a href="productos.jsp" class="btn btn-primary">Seguir Comprando</a>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
