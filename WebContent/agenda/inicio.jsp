<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c"  
	uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Agenda</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="assets/css/main-two.css" />
</head>
<body>
	<!-- Page Wrapper -->
			<div id="page-wrapper">
			
				<!-- Header -->
					<header id="header">
						<h1><a href="index.html">Agenda</a></h1>
						<nav>
							<a href="#menu">Menu</a>
						</nav>
					</header>

				<!-- Menu -->
					<nav id="menu">
						<div class="inner">
							<h2>Menu</h2>
							<ul class="links">
								<li><a href="#TablaContactos">Contactos</a></li>
								<li><a href="#NuevoContacto">Agregar Contacto</a></li>
								<li><a href="elements.html">Configuración</a></li>
								<li><a href="#">Sign Out</a></li>
							</ul>
							<a href="#" class="close">Close</a>
						</div>
					</nav>

				<!-- Wrapper -->
					<section id="wrapper">
						<header>
							<div class="inner">
								<h2>Contactos</h2>
								<p>Todos tus amigos en un sólo lugar</p>
							</div>
						</header>

						<!-- Content -->
							<div class="wrapper">
								<div class="inner">

									<section>
										<h3 id="TablaContactos" class="major">Contactos</h3>

									<section>
										<div class="table-wrapper">
											<table>
												<thead>
													<tr>
														<th>Nombre</th>
														<th>Teléfono de casa</th>
														<th>Teléfono móvil</th>
														<th>Correo</th>
														<th>Dirección</th>
														<th>Opciones</th>
													</tr>
												</thead>
												<tbody>
													<c:forEach items="${listaContacto}" var="contacto">
														<tr>
															<td>${contacto.getNombre()}</td>
															<td>${contacto.getTelCasa()}</td>
															<td>${contacto.getTelMovil()}</td>
															<td>${contacto.getCorreo()}</td>
															<td>${contacto.getDireccion()}</td>
															<td>
																<ul class="actions">
																	<li><a href="CargarContacto.do?idContacto=${contacto.getIdContacto()}" class="fa fa-pencil-square-o"></a></li>
																	<li><a href="EliminarContacto.do?idContacto=${contacto.getIdContacto()}" class="fa fa-minus"></a></li>
																</ul>
															</td>
														</tr>
													</c:forEach>
												</tbody>
											</table>
										</div>

									</section>

									<section>
										<h3 class="major">Buttons</h3>
										<ul class="actions">
											<li><a href="#" class="button special">Special</a></li>
											<li><a href="#" class="button">Default</a></li>
										</ul>
										<ul class="actions">
											<li><a href="#" class="button big">Big</a></li>
											<li><a href="#" class="button small">Small</a></li>
										</ul>
										<ul class="actions fit">
											<li><a href="#" class="button fit">Fit</a></li>
											<li><a href="#" class="button special fit">Fit</a></li>
											<li><a href="#" class="button fit">Fit</a></li>
										</ul>
										<ul class="actions fit small">
											<li><a href="#" class="button special fit small">Fit + Small</a></li>
											<li><a href="#" class="button fit small">Fit + Small</a></li>
											<li><a href="#" class="button special fit small">Fit + Small</a></li>
										</ul>
										<ul class="actions">
											<li><a href="#" class="button special icon fa-download">Icon</a></li>
											<li><a href="#" class="button icon fa-download">Icon</a></li>
										</ul>
										<ul class="actions">
											<li><span class="button special disabled">Disabled</span></li>
											<li><span class="button disabled">Disabled</span></li>
										</ul>
									</section>

									<section>
										<h3 class="major" id="NuevoContacto">Nuevo Contacto</h3>
										<form action="AgregarContacto.do" method="post">
											<div class="row uniform">
												<div class="6u 12u$(xsmall)">
													<label>Nombre</label>
													<input type="text" required name="txtNombre"/>
												</div>
												<div class="6u$ 12u$(xsmall)">
													<label>Correo</label>
													<input type="email" name="txtCorreo"/>
												</div>
												<div class="6u 12u$(xsmall)">
													<label>Teléfono de Casa</label>
													<input type="text" name="txtTelCasa"/>
												</div>
												<div class="6u$ 12u$(xsmall)">
													<label>Teléfono Móvil</label>
													<input type="text" name="txtTelMovil"/>
												</div>
												<div class="12u$">
													<label>Direccion</label>
													<input type="text" name="txtDireccion"/>
												</div>
												<div class="12u$">
													<ul class="actions">
														<li><input type="submit" value="Agregar" class="special" /></li>
														<li><input type="reset" value="Limpiar" /></li>
													</ul>
												</div>
											</div>
										</form>
									</section>
								</div>
							</div>

					</section>

				<!-- Footer -->
					<section id="footer">
						<div class="inner">
							<ul class="copyright">
								<li>&copy; UJosue. All rights reserved.</li><li>Design: <a href="http://html5up.net">HTML5 UP</a></li>
							</ul>
						</div>
					</section>

			</div>

		<!-- Scripts -->
			<script src="assets/js/skel.min.js"></script>
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/jquery.scrollex.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main-two.js"></script>

</body>
</html>