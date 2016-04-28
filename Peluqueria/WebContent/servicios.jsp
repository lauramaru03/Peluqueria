<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
							</button> <a class="navbar-brand" href="index.jsp">Home</a>
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
									<a href="#">Registrarse</a>
								</li>
								
							</ul>
							<ul class="nav navbar-nav navbar-right">
								<li>
									<a href="#">Iniciar sesion</a>
								</li>
								
							</ul>
							
						</div>
						
					</nav>
				</div>
			</div>
		</div>
	</div>
	<br><br><br>
	<h1 class="text-center">Servicios</h1>
	<div class="row">
		<div class="col-md-4">
			<img alt="Bootstrap Image Preview" src="resources/images/peinado.jpg" width="150" height="150">
			<c:forEach var="servicio" items="${model}">
				<div class="col-md-4">
				<h2>
				${servicio['name']}
				</h2>
				<p>
				${servicio['description'] }
				</p>
				<p>
				${servicio['price'] }
				</p>
				
			</c:forEach>	
		</div>	
			
			<p>
				<a class="btn" href="servicio1.jsp">Ver Detalles»</a>
			</p>
		</div>
		<div class="col-md-4">
			<img alt="Bootstrap Image Preview" src="resources/images/corte2.jpg" width="150" height="150">
			<h2>
				Corte
			</h2>
			<p>
				Cortes de Cabello para hombres, mujeres y niños. Nuestra sala de belleza, le ofrece variedad de cortes de cabello que se adapten a su rostro y a su estilo de cabello:corto o largo. Ademas de una completa asesoria por parte del personal.
			</p>
			<p>
				<a class="btn" href="servicio2.jsp">Ver Detalles»</a>
			</p>
		</div>
		<div class="col-md-4">
			<img alt="Bootstrap Image Preview" src="resources/images/maquillaje1.jpg" width="150" height="150">
			<h2>
				Maquillaje
			</h2>
			<p>
				Maquillaje para mujeres y niñas. Nuestra sala de belleza, le ofrece variedad de tecnicas de maquillaje facial con multiples paletas de colores que se adapten a su color y tipo de piel. Ademas de una completa asesoria por parte del personal. 
			</p>
			<p>
				<a class="btn" href="servicio3.jsp">Ver Detalles »</a>
			</p>
		</div>
	</div>
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