<%@page import="sun.usagetracker.UsageTrackerClient"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<h1>P�gina de login.jsp</h1>

<%
   String usuario = (String) request.getParameter("usuario");
   String clave = (String) request.getParameter("clave");
%>
<h2>USUARIO: <%=usuario%></h2>
<h2>CONTRASE�A: <%=clave%></h2>

</body>
</html>