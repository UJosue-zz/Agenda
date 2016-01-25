<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agregar Contacto</title>
</head>
<body>
	<form action="Agregar.do" method="post">
	<input type="text" name="txtNombre" placeholder="Nombre"/> <br/>
	<input type="text" name="txtTelCasa" placeholder="Teléfono de Casa"/> <br/>
	<input type="text" name="txtTelMovi" placeholder="Teléfono Móvil"/> <br/>
	<input type="email" name="txtCorreo" placeholder="Correo"/> <br/>
	<input type="text" name="txtUsuario" placeholder="Usuario"/> <br/>
	<input type="submit" value="Agregar"/> <br/>
	</form>
</body>
</html>