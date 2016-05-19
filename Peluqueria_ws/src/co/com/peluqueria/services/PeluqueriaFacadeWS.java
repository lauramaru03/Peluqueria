package co.com.peluqueria.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.com.peluqueria.model.EmpleadoDTO;
import co.com.peluqueria.model.LugarDTO;
import co.com.peluqueria.model.ReservaDTO;
import co.com.peluqueria.model.ServicioDTO;


@Path("/json/firstpage")
public class PeluqueriaFacadeWS {
  
  @GET
  @Path("/servicio1")
  @Produces(MediaType.APPLICATION_JSON)
  public List<ServicioDTO> getServiciosDTO() {
    PeluqueriaFacade peluqueriaFacade = PeluqueriaFacade.getInstance();
    return peluqueriaFacade.findServicio();
  }
  
  @GET
  @Path("/servicio2/{servicioId}")
  @Produces(MediaType.APPLICATION_JSON)
  public ServicioDTO getServicioDTO(@PathParam("servicioId") int servicioId) {
    PeluqueriaFacade peluqueriaFacade = PeluqueriaFacade.getInstance();
    return peluqueriaFacade.findServicioByID(servicioId);
  }
  
  @GET
  @Path("/servicio3")
  @Produces(MediaType.APPLICATION_JSON)
  public List<LugarDTO> getLugarDTO() {
    PeluqueriaFacade peluqueriaFacade = PeluqueriaFacade.getInstance();
    return peluqueriaFacade.findLugar();
  }
  
  @GET
  @Path("/servicio4/{lugarId}")
  @Produces(MediaType.APPLICATION_JSON)
  public LugarDTO getLugaresDTO(@PathParam("lugarId") int lugarId) {
    PeluqueriaFacade peluqueriaFacade = PeluqueriaFacade.getInstance();
    return peluqueriaFacade.findLugarByID(lugarId);
  }
  
  @GET
  @Path("/servicio5")
  @Produces(MediaType.APPLICATION_JSON)
  public List<EmpleadoDTO> getEmpleadosDTO() {
    PeluqueriaFacade peluqueriaFacade = PeluqueriaFacade.getInstance();
    return peluqueriaFacade.findEmpleado();
  }
  
  
  @GET
  @Path("/servicio6/{empleadoId}")
  @Produces(MediaType.APPLICATION_JSON)
  public EmpleadoDTO getEmpleadoDTO(@PathParam("empleadoId") int empleadoId) {
    PeluqueriaFacade peluqueriaFacade = PeluqueriaFacade.getInstance();
    return peluqueriaFacade.findEmpleadoByID(empleadoId);
  }
  
  @GET
  @Path("/servicio7/{reservaId}")
  @Produces(MediaType.APPLICATION_JSON)
  public ReservaDTO findReservaByID(@PathParam("reservaId") int reservaId) {
    PeluqueriaFacade peluqueriaFacade = PeluqueriaFacade.getInstance();
    return peluqueriaFacade.findReservaByID(reservaId);
  }
  
  

  
  /*
   * 
   * In JAX-RS The following annotations to extract the input values sent by the client.

@PathParam
@QueryParam
@MatrixParam
@FormParam
@PathParam URL Syntax

http://localhost:7001//rest/customers/100/Java4s

@QueryParam URL Syntax

http://localhost:7001/…/rest/customers?custNo=100&custName=Java4s

@MatrixParam URL Syntax

http://localhost:7001/…/rest/customers;custNo=100;custName=Java4s

@FormParam URL Syntax

If we have a HTML form having two input fields and submit button. Lets client enter those details and submit to the RESTful web service. Then the rest service will extract those details by using this @FormParam annotation.
   * 
   */
}
