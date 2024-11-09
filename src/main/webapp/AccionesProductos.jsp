<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Acciones Productos</title>
</head>
<body>
	<h1>Gestor de Productos</h1>
	<p>
	<h1>Alta Producto</h1>
	<form action="ProductoControllers" method="post">
		<p>
			<label for="CodProducto">Código del Producto:</label> <input
				type="text" id="CodProducto" name="CodProducto" required />
		</p>
		<p>
			<label for="NombreProducto">Nombre del Producto:</label> <input
				type="text" id="NombreProducto" name="NombreProducto" required />
		</p>
		<p>
			<label for="UnidadMedidaProducto">Unidad de Medida:</label> <input
				type="text" id="UnidadMedidaProducto" name="UnidadMedidaProducto"
				required />
		</p>
		<p> 
			<label for="PrecioProducto">Precio del Producto:</label> <input
				type="number" id="PrecioProducto" name="PrecioProducto" step="0.01"
				required />
		</p>
		<p>
			<label for="StockProducto">Stock Inicial:</label> <input
				type="number" id="StockProducto" name="StockProducto" required />
		</p>
		<p>
			<input type="submit" value="Dar de alta">
		</p>
	</form>
	</p>
	<a href="ProductoControllers?action=listar">Listado de Productos</a>
</body>
</html>