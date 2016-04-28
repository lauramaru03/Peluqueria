package co.com.peluqueria.services;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.peluqueria.jdbc.dao.LugarDAO;
import co.com.peluqueria.jdbc.dao.ServicioDAO;
import co.com.peluqueria.jdbc.entities.Lugar;
import co.com.peluqueria.jdbc.entities.Servicio;
import co.com.peluqueria.model.ServicioDTO;

public class ServicioServicesImpl implements ServicioServices {
	
	
	 @Override
	  public   ArrayList<ServicioDTO> findServicioList() {
	 // Se obtiene el contexto de la aplicacion
	    ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");

	   
		ServicioDAO sesionDAO =(ServicioDAO) context.getBean("servicioDAO"); 
	     
		ArrayList<Servicio> servicios = sesionDAO.findServicioList();
		
		
	    
	    ArrayList<ServicioDTO> servicioDTOList = new ArrayList<ServicioDTO>();
	    
	    
	    for( Servicio servicio:servicios){
	    ServicioDTO servicioDTO = new ServicioDTO();
	    
	    servicioDTO.setName(servicio.getName());
	    servicioDTO.setDescription(servicio.getDescription());
	    servicioDTO.setPrice(servicio.getPrice());
	    
	    servicioDTOList.add(servicioDTO);
	    
	    }
	    return servicioDTOList; 
	  }
	    
	 }

	
	


