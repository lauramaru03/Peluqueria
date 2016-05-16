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

  
	<h1 class="text-center">Reservas</h1>
	<h3>Crear una reserva</h3>
	<div class="row">
		<div class="col-md-12">
			<form method="post" action="crearReserva">
				<div class="form-group">
					<label>
						Fecha
					</label>
					<input type="date" class="form-control" id="fechaReservacion" name="fecha">
				</div>
				<div class="form-group">
					 
					<label>
						Servicio
					</label>
					<br>
					<select name="servicio" class="form-control" required >
					 <c:forEach var="reserva" items="${reserva}">
					<option>${reserva['servicio_id']}</option>
					
					 </c:forEach>
					 </select>
					
				</div>
				<div class="form-group">
					 
					<label>
						Salon
					</label>
					<br>
					<select name="salon" class="form-control" required>
					 <option>(Selecione)</option>
					 <option>Salon 1</option>
					 <option>Salon 2</option>
					 <option>Salon 3</option>
					 </select>
				</div>
				<div class="form-group">
					 
					<label>
						Asociado
					</label>
					<br>
					<select name="asociado" class="form-control" >
					 <option>(Selecione)</option>
					 <option>Carlos Alberto</option>
					 <option>Margarita Alvarez</option>
					 </select>
				</div>
				<div class="form-group">
					 
					<label>
						Hora
					</label>
					<input type="time" class="form-control" id="fechaReservacion" name="hora">
				</div>
				<br>
				<div class="checkbox">
					 
					<label>
						<input type="checkbox"> Enviar informacion al correo
					</label>
				</div> 
				<button type="submit" class="btn btn-default" >
					Reservar
				</button>
			</form>
		</div>
	</div>
	<br>
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