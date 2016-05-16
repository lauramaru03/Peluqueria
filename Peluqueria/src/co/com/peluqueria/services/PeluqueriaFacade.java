package co.com.peluqueria.services;

import java.util.List;

import co.com.peluqueria.model.EmpleadoDTO;
import co.com.peluqueria.model.LugarDTO;
import co.com.peluqueria.model.ReservaDTO;
import co.com.peluqueria.model.ServicioDTO;

public class PeluqueriaFacade {
	
	  /*Servicios*/
	
	  ServicioServices serviciosServices = new ServicioServicesImpl();
	
	  public ServicioDTO findServicioByID(int servicioId){
		  
		  return serviciosServices.findServicioByID(servicioId);
		  
	  }
	  
	
	  public List<ServicioDTO> findServicio() {
		    
		    return serviciosServices.findServicio();
	  }
	  
	  /*Lugares*/
	  
	  LugarServices lugaresServices = new LugarServicesImpl();
		
	  public LugarDTO findLugarByID(int lugarId){
		  
		  return lugaresServices.findLugarByID(lugarId);
		  
	  }
	  
	
	  public List<LugarDTO> findLugar() {
		    
		    return lugaresServices.findLugar();
	  }
	  
	  /*Empleados*/
	  
	  EmpleadoServices empleadosServices = new EmpleadoServicesImpl();
		
	  public EmpleadoDTO findEmpleadoByID(int empleadoId){
		  
		  return empleadosServices.findEmpleadoByID(empleadoId);
		  
	  }
	  
	
	  public List<EmpleadoDTO> findEmpleado() {
		    
		    return empleadosServices.findEmpleado();
	  }
	  
	  /*Reservas*/
	  
	  ReservaServices reservasServices = new ReservaServicesImpl();
		
	  public ReservaDTO findReservaByID(int reservaId){
		  
		  return reservasServices.findReservaByID(reservaId);
		  
	  }
	  
	
	  public List<ReservaDTO> findReserva() {
		    
		    return reservasServices.findReserva();
	  }
	  
	  
	  
	  
}
