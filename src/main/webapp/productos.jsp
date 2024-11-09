<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List, java.util.ArrayList" %>
<%@ page import="models.Producto" %>
	
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Productos</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body class="bg-light">

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container">
        <a class="navbar-brand" href="#">MS Store</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link" href="#">Inicio</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="carrito.jsp">Carrito</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Mi Cuenta</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="container mt-5">
    <h1 class="display-4 text-center text-primary">Nuestros Productos</h1>

    <div class="row">
        <%
            // Esto es temporal, tenemos que borrarlo para usar el json
            List<Producto> productos = new ArrayList<>();
            productos.add(new Producto(1, "Microsoft Windows 11 Pro", "Descripción del producto 1", 49.99, "https://images.g2a.com/940x528/1x1x0/microsoft-windows-11-pro-pc-microsoft-key-global-i10000271164001/f0fcf80e6cf84e518c39d5b6"));
            productos.add(new Producto(2, "Microsoft Office Professional Plus 2021", "Descripción del producto 2", 19.99, "https://images.g2a.com/940x528/1x1x0/microsoft-office-professional-plus-2021-pc-microsoft-key-global-i10000271538001/202a62e65a5c456ebf44c92e"));
            productos.add(new Producto(3, "Windows Server 2022 Standard", "Descripción del producto 3", 19.99, "https://images.g2a.com/940x528/1x1x0/windows-server-2022-standard-pc-microsoft-key-global-i10000266811003/2804575bd9dc42baa63e8e3c"));

            for (Producto producto : productos) {
        %>
        <div class="col-md-4 d-flex align-items-stretch">
            <div class="card mb-4 shadow-sm" style="width: 18rem; height: 450px;">
                <img src="<%= producto.getImagen() %>" class="card-img-top" alt="<%= producto.getNombre() %>" style="height: 200px; object-fit: cover;">
                <div class="card-body d-flex flex-column">
                    <h5 class="card-title"><%= producto.getNombre() %></h5>
                    <p class="card-text"><%= producto.getDescripcion() %></p>
                    <p class="card-text"><strong>Precio:</strong> $<%= producto.getPrecio() %></p>
                    <a href="agregarAlCarrito?id=<%= producto.getId() %>" class="btn btn-primary mt-auto">Añadir al Carrito</a>
                </div>
            </div>
        </div>
        <% } %>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-pzjw8f+ua7Kw1TIq0dpY7j9fJw6hXYsYssJ46bgjL3vBp8+m2gW9gmFvLzXxkQ62" crossorigin="anonymous"></script>
</body>
</html>
