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
							</button> <a class="navbar-brand" href="#">Home</a>
						</div>
						
						<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
							<ul class="nav navbar-nav">
								<li >
									<a href="#">Reservas</a>
								</li>
								<li>
									<a href="#">Asociados</a>
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
	<br>
	<br>
	<br>
		<div class="row">
				<div class="col-md-12">
					<img alt="Bootstrap Image Preview" src="resources/images/Asociado2.jpg">
					<h2>
						Margarita Alvarez
					</h2>
					<p>
						Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui.
					</p>
					<p>
						<a class="btn" href="#">Ver Detalles�</a>
					</p>
				</div>
			</div>
			<h3 class="text-center">
				Agenda 
			</h3>
			<br>
			<form role="form">
				<div class="form-group">
					 
					<label>
						Fecha
					</label>
					<input type="date" class="form-control" id="fechaReservacion">
					
				</div>
				<div>
				<button type="submit" class="btn btn-default">
					Consultar
				</button>
				</div>
			</form>	
			<table class="table">
				<thead>
					<tr>
						<th>
							#
						</th>
						<th>
							Hora
						</th>
						<th>
							Cliente
						</th>
						<th>
							Servicio
						</th>
						<th>
							Estado
						</th>
					</tr>
				</thead>
				<tbody>
					<tr class="success">
						<th>
							1
						</th>
						<td>
							8:00 am
						</td>
						<td>
							Ana Maria Gonzalez
						</td>
						<td>
							Corte De Cabello
						</td>
						<td>
							Asistio
						</td>
					</tr>
					<tr class="danger">
						<td>
							2
						</td>
						<td>
							10:00 am
						</td>
						<td>
							Diana Martinez
						</td>
						<td>
							Maquillaje Facial
						</td>
						<td>
							Cancelo
						</td>
					</tr>
					<tr class="success">
						<td>
							3
						</td>
						<td>
							11:00 am
						</td>
						<td>
							Marta Caicedo
						</td>
						<td>
							Cepillado
						</td>
						<td>
							Asistio
						</td>
					</tr>
					<tr class="warning"">
						<td>
							4
						</td>
						<td>
							12:00 am
						</td>
						<td>
							Carlos Patiño
						</td>
						<td>
							Corte De Cabello
						</td>
						<td>
							En espera
						</td>
					</tr>
					<tr class="active">
						<td>
							5
						</td>
						<td>
							2:00 pm
						</td>
						<td>
							Catalina Londoño
						</td>
						<td>
							Maquillaje
						</td>
						<td>
							Pendiente
						</td>
					</tr>
				</tbody>
			</table>
			
				
			</nav>
		</div>
	</div>
	<div class="row">
		<div class="col-md-12">
			 
			<address>
				 <strong>Twitter, Inc.</strong><br> 795 Folsom Ave, Suite 600<br> San Francisco, CA 94107<br> <abbr title="Phone">P:</abbr> (123) 456-7890
			</address>
		</div>
	</div>
</div>

    <script src="resources/js/jquery.min.js"></script>
    <script src="resources/js/bootstrap.min.js"></script>
    <script src="resources/js/scripts.js"></script>
  </body>
</html>