<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

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
							</button> <a class="navbar-brand" >
										<form method="GET" action="home">
										<input type="submit" value="Estilos & Tendencias">
									</a>
						</div>
						
						<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
							<ul class="nav navbar-nav">
								<li >
									<a class="nav navbar-nav">
										<form method="POST" action="reserva">
										<input type="submit" value="Reservas">
										</form>
									</a>
								</li>
								<li>
									<a class="nav navbar-nav">
								       <form method="POST" action="servicio">
									   <input type="submit" value="Servicios">
								     </form>
							      </a>
								</li>
								
								<li>
									<a class="nav navbar-nav">
								       <form method="POST" action="empleado">
									   <input type="submit" value="Empleados">
								     </form>
							      </a>
								</li>
								
								<li>
									<a class="nav navbar-nav">
								       <form method="POST" action="lugar">
									   <input type="submit" value="Sedes">
								     </form>
							      </a>
								</li>
								
							

						</div>
						
					</nav>
				</div>
			</div>
		</div>
	</div>
	<br><br><br><br><br><br><br>