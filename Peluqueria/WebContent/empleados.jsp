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

	<h1 class="text-center">Asociados</h1>
	<br>
	<br>
	<form class="navbar-form navbar-left" role="search" id="1543243152">
						<div class="form-group">
							<input type="text" class="form-control" />
						</div> 
						<button type="submit" class="btn btn-default">
							Buscar 
						</button>
					</form>
					<br>
	<div class="row">
		<div class="col-md-12">
		<c:forEach var="empleado" items="${empleado}">
			<div class="media well">
					<a href="#" class="pull-left"><img alt="Bootstrap Media Preview" src="${empleado['photography']}" class="media-object"></a>
					<div class="media-body">
						<h3 class="media-heading">
					  
							${empleado['name']}
						</h3>
						<br>
						<p>
							<label>Profesion :</label>
					   		 ${empleado['profession']}
						</p>
						<p>
							<label>Descripcion :</label>
					    	${empleado['description']}
						</p>
						<p>
							<label>Telefono de Contacto :</label>
					    	${empleado['cellphone']}
						</p>
						<p>
							<label>Correo Electronico: </label>
					    	${empleado['email']}
						</p>
					
					 
					<div class="media">
						<br>
						<div class="media-body">
							<form action="reserva"  method="Post">
							<input type=image src="resources/images/calendario.gif" width="25" height="25">Agendar Cita
							</form>
							
						</div>
					</div>
				</div>
			</div>
			<hr>
			</c:forEach>
			</div> 
		</div>	
			
	<br>
	<div class="row">
		<div class="col-md-12">
			 
			<address>
				 <strong>Peluqueria <br>Estilos y Tendencias.</strong><br> Medellin,Antioquia<br> estilosytendencias@gmail.com<br> <abbr title="Phone">P:</abbr> (123) 456-7890
			</address>
		</div>
	</div>
</div>

    <script src="resources/js/jquery.min.js"></script>
    <script src="resources/js/bootstrap.min.js"></script>
    <script src="resources/js/scripts.js"></script>
  </body>
</html>