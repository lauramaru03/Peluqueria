package co.com.peluqueria.jpa.services;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.peluqueria.DAO.ReservaDAO;
import co.com.peluqueria.model.ReservaDTO;




public class ReservaServicesImpl implements ReservaServices {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
	


	public ReservaDTO findReservaByID(int reservaId) {
		
		return this.findByIDJPA(reservaId); 
	}

	private ReservaDTO findByIDJPA(int reservaId) {
		
		 

		    // Se obtiene el servicio que implementa los servicios de la base de datos
		    ReservaDAO sesionDAO = (ReservaDAO) context.getBean(ReservaDAO.class);

		    // Se realiza el insert
		    ReservaDTO reservaDTO = sesionDAO.findReservaByID(1);
		    
		    
		return reservaDTO;
	}


	public List<ReservaDTO> findReserva() {
		
		return this.findReservaJPA();
	}

	private List<ReservaDTO> findReservaJPA() {
		
	    // Se obtiene el servicio que implementa los servicios de la base de datos
	    ReservaDAO sesionDAO = (ReservaDAO) context.getBean(ReservaDAO.class);

	    List<ReservaDTO> reservaDTO = sesionDAO.findReserva();
	    // Se realiza el insert
	    
	    
	    return reservaDTO;
	   
	  }
		
	
	    
	 }

	
	


