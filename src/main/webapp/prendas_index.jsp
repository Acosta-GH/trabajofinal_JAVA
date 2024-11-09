<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<a href="prendas?accion=visitas">Ver cantidad visitas</a>
<a href="prendas?accion=todas">Ver todas las prendas</a>

<h1>Alta</h1>
<form action="prendas" method="post">
	<input name="accion" value="alta"  type="hidden"/> 
	<p>Codigo <input name="codigo"/> </p>
	<p>Metros de tela<input name="metros" value="0"/>  </p>
	<p><input type="submit"/> </p>

</form>


<h1>Modificacion</h1>
<h1>Baja</h1>

</body>
</html>