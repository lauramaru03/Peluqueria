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

   
	<div class="row">
				<c:forEach var="lugar" items="${lugar}">
				<div class="col-md-4">
					<img alt="Bootstrap Image Preview" src="${lugar['photography']}" width="150" height="150">
					<h2>
					
						${lugar['name']}
					</h2>
					<p>
						<label>Direccion: </label>
						${lugar['address'] }
					</p>
					<p>
						<label>Descripcion: </label>
						${lugar['description'] }
					</p>
					<p>
						<label>Horario De Atencion: </label>
						${lugar['schedule'] }
					</p>
					<p>
						<label>Telefono: </label>
						${lugar['phone'] }
					</p>
					<p>
						<label>Correo Electronico: </label>
						${lugar['email'] }
					</p>
				</div>		
						
				</c:forEach>
	</div>		
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