<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="/include.jsp" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Peluqueria</title>

    <meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">

    <link href="resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/css/style.css" rel="stylesheet">

  </head>
  <body>

    <div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<div class="row">
				<div class="col-md-12">
					<nav class="navbar navbar-default navbar-inverse navbar-fixed-top" role="navigation">
						<div class="navbar-header">
							 
							<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
								 <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span>
							</button> <a class="navbar-brand" href="index.jsp">Estilos & Tendencias</a>
						</div>
						
						<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
							<ul class="nav navbar-nav">
								<li >
									<a href="reserva.jsp">Reservas</a>
								</li>
								<li>
									<a href="asociados.jsp">Asociados</a>
								</li>
								<li class="dropdown">
									 <a href="#" class="dropdown-toggle" data-toggle="dropdown">Servicios<strong class="caret"></strong></a>
									<ul class="dropdown-menu">
										<li>
											<a href="servicio1.jsp">Peinados</a>
											<a href="servicio2.jsp">Corte</a>
											<a href="servicio3.jsp">Maquillaje</a>
											
										</li>
										<li class="divider">
										</li>
										<li>
											<a href="servicios.jsp">Ver todos</a>
										</li>
										
									</ul>
								</li>
								<li class="dropdown">
									 <a href="#" class="dropdown-toggle" data-toggle="dropdown">Salones<strong class="caret"></strong></a>
									<ul class="dropdown-menu">
										<li>
											<a href="salon1.jsp">Salon Sector C.C Unicentro</a>
										</li>
										<li>
											<a href="salon2.jsp">Salon Sector C.C Los Molinos</a>
										</li>
										<li>
											<a href="salon3.jsp">Salon Sector C.C Santafe</a>
										</li>
										
										<li class="divider">
										</li>
										<li>
											<a href="salones.jsp">Ver todos</a>
										</li>
									</ul>
								</li>
							</ul>
							
							<ul class="nav navbar-nav navbar-right">
								<li>
									<a href="#">Cerrar Sesion</a>
								</li>
								
							</ul>
							
						</div>
						
					</nav>
				</div>
			</div>
		</div>
	</div>
	<br>
	<br>
	<br>
<h2 >Detalle de la Reserva</h2>
<br>
<br>
<table>
<tr>
<td><label>Fecha:</label></td>
<td>${fecha}</td>
</tr>
<tr>
<td><label>Servicio:</label></td>
<td>${servicio}</td>
</tr>
<tr>
<td><label>Salon:</label></td>
<td>${salon}</td>
</tr>
<tr>
<td><label>Asociado:</label></td>
<td>${asociado}</td>
</tr>
<tr>
<td><label>Hora</label><td>
<td>${hora}</td>
</tr>
</table>
<br>
	<br>
	<div class="row">
		<div class="col-md-12">
			 
			<address>
				 <strong>Peluqueria.</strong><br> 795 Folsom Ave, Suite 600<br> San Francisco, CA 94107<br> <abbr title="Phone">P:</abbr> (123) 456-7890
			</address>
		</div>
	</div>
</div>

    <script src="resources/js/jquery.min.js"></script>
    <script src="resources/js/bootstrap.min.js"></script>
    <script src="resources/js/scripts.js"></script>
  </body>
</html>