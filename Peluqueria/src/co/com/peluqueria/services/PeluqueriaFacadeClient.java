package co.com.peluqueria.services;

import java.util.List;
import co.com.peluqueria.services.ServicioServices;
import co.com.peluqueria.services.ServicioServicesImpl;
import co.com.peluqueria.model.EmpleadoDTO;
import co.com.peluqueria.model.LugarDTO;
import co.com.peluqueria.model.ReservaDTO;
import co.com.peluqueria.model.ServicioDTO;

public class PeluqueriaFacadeClient {
	
	 
	 public ServicioDTO getServicioDTO(){
		 
		 ServicioServices servicioServices = new ServicioServicesImpl();
		 ServicioDTO servicioDTO= servicioServices.getServicioDTO();
		 
	return servicioDTO;
		 
	 }
	 public List<ServicioDTO> getServiciosDTO(){
		 
		 ServicioServices servicioServices = new ServicioServicesImpl();
		 List<ServicioDTO> serviciosDTO= servicioServices.getServiciosDTO();
		  
		  return serviciosDTO;
		  
	  }
	 public LugarDTO getLugarDTO(){
		 
		 LugarServices lugarServices = new LugarServicesImpl();
		 LugarDTO lugarDTO= lugarServices.getLugarDTO();
		 
	return lugarDTO;
		 
	 }
	 public List<LugarDTO> getLugaresDTO(){
		 
		 LugarServices lugarServices = new LugarServicesImpl();
		 List<LugarDTO> lugaresDTO= lugarServices.getLugaresDTO();
		  
		  return lugaresDTO;
		  
	  }
	 
	 
 public EmpleadoDTO getEmpleadoDTO(){
		 
		 EmpleadoServices empleadoServices = new EmpleadoServicesImpl();
		 EmpleadoDTO empleadoDTO= empleadoServices.getEmpleadoDTO();
		 
	return empleadoDTO;
		 
	 }
	 public List<EmpleadoDTO> getEmpleadosDTO(){
		 
		 EmpleadoServices empleadoServices = new EmpleadoServicesImpl();
		 List<EmpleadoDTO> empleadosDTO= empleadoServices.getEmpleadosDTO();
		  
		  return empleadosDTO;
		  
	  }
	 
	 
	 public ReservaDTO getReservaDTO(){
		 
		 ReservaServices reservaServices = new ReservaServicesImpl();
		 ReservaDTO reservaDTO= reservaServices.getReservaDTO();
		  
		  return reservaDTO;
		  
	  }
	 
	
	 
	 
}

