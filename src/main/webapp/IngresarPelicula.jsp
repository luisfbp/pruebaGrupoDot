<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insercion Peliculas</title>
</head>
<body>
	<h1>INSERTE UNA PELICULA</h1>
<!--  	<form action="InsertarPelicula">
		<label for="pelicula.nombre">Ingrese el nombre de la pelicula</label><br/> 
		<input type="text" name="pelicula.nombre" /><br>
		<label for="pelicula.descripcion">Ingrese la descripcion de la pelicula</label><br/> 
		<input type="text" name="pelicula.descripcion" /> <br>
		<input type="submit" value="Ingresar Pelicula" />
	</form> -->
	<s:form action="InsertarPelicula">
	 
	      <s:textfield name="pelicula.nombre" label="Nombre" />
	      <s:textfield name="pelicula.descripcion" label="Descripción" />
	       
	      <s:submit/>
	       
	</s:form>
</body>
</html>