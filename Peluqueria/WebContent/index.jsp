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
									<a href="#">Iniciar Sesion</a>
								</li>
								
							</ul>
							<ul class="nav navbar-nav navbar-right">
								<li>
									<a href="#">Registrarse</a>
								</li>
								
							</ul> 
						</div>
						
					</nav>
				</div>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-md-12">
			<div class="carousel slide" id="carousel-917969">
				<ol class="carousel-indicators">
					<li data-slide-to="0" data-target="#carousel-917969">
					</li>
					<li data-slide-to="1" data-target="#carousel-917969">
					</li>
					<li data-slide-to="2" data-target="#carousel-917969" class="active">
					</li>
				</ol>
				
				<div class="carousel-inner">
				
					<div class="item">
						<img alt="Carousel Bootstrap First" src=${model.imagePath.get(0)} width="1300px" height="50">
						<div class="carousel-caption">
							
						</div>
					</div>
					
			 		<div class="item">
						<img alt="Carousel Bootstrap Second" src=${model.imagePath.get(1)} width="1300" height="50">
						<div class="carousel-caption">
							
						</div>
					</div>
					<div class="item active">
						<img alt="Carousel Bootstrap Third" src=${model.imagePath.get(2)}  width="1300" height="50">
						<div class="carousel-caption">
							
						</div>
					</div> 
				</div> <a class="left carousel-control" href="#carousel-917969" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a> <a class="right carousel-control" href="#carousel-917969" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
			</div> 
		</div>
	</div>
	<br>
	<div class="row">
		<div class="col-md-4">
			<img alt="Bootstrap Image Preview" src=${model.imageService1} width="150" height="150">
			<h2>
			${ model.service1}
			</h2>
			<p>
			${ model.descService1}	
			</p>
			<p>
				<a class="btn" href="servicio1.jsp">${model.viewDetails}</a>
			</p>
		</div>
		<div class="col-md-4">
			<img alt="Bootstrap Image Preview" src=${model.imageService2} width="150" height="150">
			<h2>
			${model.service2}
			</h2>
			<p>
				${model.descService2}
			</p>
			<p>
				<a class="btn" href="servicio2.jsp">${model.viewDetails}</a>
			</p>
		</div>
		<div class="col-md-4">
			<img alt="Bootstrap Image Preview" src=${model.imageService3} width="150" height="150">
			<h2>
			${model.service3}
			</h2>
			<p>
				${model.descService3}
			</p>
			<p>
				<a class="btn" href="servicio3.jsp">${model.viewDetails}</a>
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