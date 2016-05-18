package co.com.peluqueria.services;

import java.util.List;

import co.com.peluqueria.jpa.services.EmpleadoServices;
import co.com.peluqueria.jpa.services.EmpleadoServicesImpl;
import co.com.peluqueria.jpa.services.LugarServices;
import co.com.peluqueria.jpa.services.LugarServicesImpl;
import co.com.peluqueria.jpa.services.ReservaServices;
import co.com.peluqueria.jpa.services.ReservaServicesImpl;
import co.com.peluqueria.jpa.services.ServicioServices;
import co.com.peluqueria.jpa.services.ServicioServicesImpl;
import co.com.peluqueria.model.EmpleadoDTO;
import co.com.peluqueria.model.LugarDTO;
import co.com.peluqueria.model.ReservaDTO;
import co.com.peluqueria.model.ServicioDTO;

public class PeluqueriaFacade {
	
	
	  
	private static PeluqueriaFacade peluqueriaFacade;
	
	private PeluqueriaFacade() {
	    super();
	  }
	public static PeluqueriaFacade getInstance() {
	    if (peluqueriaFacade == null) {
	      peluqueriaFacade = new PeluqueriaFacade();
	    } 
	    return peluqueriaFacade;
	  }
	
	
	/*servicios*/
	
	  public ServicioDTO findServicioByID(int servicioId){
		  ServicioServices servicioServices = new ServicioServicesImpl();
		  
		  return servicioServices.findServicioByID(servicioId);
		  
	  }
	  
	
	  public List<ServicioDTO> findServicio() {
		  
		  ServicioServices servicioServices = new ServicioServicesImpl();
		    
		    return servicioServices.findServicio();
	  }
	  
	  /*Lugares*/
	  
	  
		
	  public LugarDTO findLugarByID(int lugarId){
		  
		  LugarServices lugarServices = new LugarServicesImpl();
		  
		  return lugarServices.findLugarByID(lugarId);
		  
	  }
	  
	
	  public List<LugarDTO> findLugar() {
		  
		  LugarServices lugarServices = new LugarServicesImpl();
		    
		  return lugarServices.findLugar();
	  }
	  
	  /*Empleados*/
	  
	 
		
	  public EmpleadoDTO findEmpleadoByID(int empleadoId){
		  
		  EmpleadoServices empleadoServices = new EmpleadoServicesImpl();
		  
		  return empleadoServices.findEmpleadoByID(empleadoId);
		  
	  }
	  
	
	  public List<EmpleadoDTO> findEmpleado() {
		  EmpleadoServices empleadoServices = new EmpleadoServicesImpl();
		    
		    return empleadoServices.findEmpleado();
	  }
	  
	  /*Reservas*/
	  
	
		
	  public ReservaDTO findReservaByID(int reservaId){
		  
		  ReservaServices reservasServices = new ReservaServicesImpl();
		  
		  return reservasServices.findReservaByID(reservaId);
		  
	  }
	  
	
	  public List<ReservaDTO> findReserva() {
		  
		  ReservaServices reservasServices = new ReservaServicesImpl();
		    
		    return reservasServices.findReserva();
	  }
	  
	  
	  
	  
}
