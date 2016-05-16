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
<td><label>Hora:</label><td>
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