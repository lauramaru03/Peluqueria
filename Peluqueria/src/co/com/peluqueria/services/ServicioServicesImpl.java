package co.com.peluqueria.services;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.peluqueria.DAO.ServicioDAO;
import co.com.peluqueria.model.ServicioDTO;




public class ServicioServicesImpl implements ServicioServices {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
	

	@Override
	public ServicioDTO findServicioByID(int servicioId) {
		
		return this.findByIDJPA(servicioId); 
	}

	private ServicioDTO findByIDJPA(int servicioId) {
		
		 

		    // Se obtiene el servicio que implementa los servicios de la base de datos
		    ServicioDAO sesionDAO = (ServicioDAO) context.getBean(ServicioDAO.class);

		    // Se realiza el insert
		    ServicioDTO servicioDTO = sesionDAO.findServicioByID(1);
		    
		    
		return servicioDTO;
	}

	@Override
	public List<ServicioDTO> findServicio() {
		
		return this.findServicioJPA();
	}

	private List<ServicioDTO> findServicioJPA() {
		
	    // Se obtiene el servicio que implementa los servicios de la base de datos
	    ServicioDAO sesionDAO = (ServicioDAO) context.getBean(ServicioDAO.class);

	    List<ServicioDTO> servicioDTO = sesionDAO.findServicio();
	    // Se realiza el insert
	    
	    
	    return servicioDTO;
	   
	  }
		
	
	    
	 }

	
	


