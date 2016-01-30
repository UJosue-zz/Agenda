<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Eventually by HTML5 UP</title>
		<title>Elements - Solid State by HTML5 UP</title>
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
													</tr>
												</thead>
												<tbody>
													<tr>
														<td>Item One</td>
														<td>Ante turpis integer aliquet porttitor.</td>
														<td>29.99</td>
													</tr>
													<tr>
														<td>Item Two</td>
														<td>Vis ac commodo adipiscing arcu aliquet.</td>
														<td>19.99</td>
													</tr>
													<tr>
														<td>Item Three</td>
														<td> Morbi faucibus arcu accumsan lorem.</td>
														<td>29.99</td>
													</tr>
													<tr>
														<td>Item Four</td>
														<td>Vitae integer tempus condimentum.</td>
														<td>19.99</td>
													</tr>
													<tr>
														<td>Item Five</td>
														<td>Ante turpis integer aliquet porttitor.</td>
														<td>29.99</td>
													</tr>
												</tbody>
												<tfoot>
													<tr>
														<td colspan="2"></td>
														<td>100.00</td>
													</tr>
												</tfoot>
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
													<input type="text" name="txtNombre"/>
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
								<li>&copy; Untitled Inc. All rights reserved.</li><li>Design: <a href="http://html5up.net">HTML5 UP</a></li>
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