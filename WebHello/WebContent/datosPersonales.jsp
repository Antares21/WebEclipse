<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Datos Perosnales</title>
<link rel="stylesheet" href="css/estilos.css"/>
</head>
<body>
	<h1>Listado de datos personales:</h1>
	<%
	    String usuario = request.getParameter("usuario");
	    String clave = request.getParameter("clave");
	    String  nombre = request.getParameter("nombre");
	    Integer edad = Integer.parseInt(request.getParameter("edad"));
	    Long telefono = Long.parseLong(request.getParameter("telefono"));   
	    
    %>
	<table>
		<tr><td class="etiquetaControl">Usuario:</td>
		    <td class="datos"><%=usuario %></td></tr>
		<tr><td class="etiquetaControl">Contraseña:</td>
		    <td class="datos"><%=clave %></td></tr>
		<tr><td class="etiquetaControl">Nombre:</td>
		    <td class="datos"><%=nombre %></td></tr>
		<tr><td class="etiquetaControl">Edad:</td>
		    <td class="datos"><%=edad %></td></tr>
		<tr><td class="etiquetaControl">Telefono:</td>
		    <td class="datos"><%=telefono %></td></tr>
	</table>
	
	
	<br/><br/>
	<a href="index.html">Regresar</a>
	
</body>
</html>