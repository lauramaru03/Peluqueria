package co.com.peluqueria.jpa.services;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.peluqueria.DAO.EmpleadoDAO;
import co.com.peluqueria.model.EmpleadoDTO;




public class EmpleadoServicesImpl implements EmpleadoServices {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
	

	
	public EmpleadoDTO findEmpleadoByID(int empleadoId) {
		
		return this.findByIDJPA(empleadoId); 
	}

	private EmpleadoDTO findByIDJPA(int empleadoId) {
		
		 

		    // Se obtiene el servicio que implementa los servicios de la base de datos
		    EmpleadoDAO sesionDAO = (EmpleadoDAO) context.getBean(EmpleadoDAO.class);

		    // Se realiza el insert
		    EmpleadoDTO empleadoDTO = sesionDAO.findEmpleadoByID(1);
		    
		    
		return empleadoDTO;
	}

	
	public List<EmpleadoDTO> findEmpleado() {
		
		return this.findEmpleadoJPA();
	}

	private List<EmpleadoDTO> findEmpleadoJPA() {
		
	    // Se obtiene el servicio que implementa los servicios de la base de datos
	    EmpleadoDAO sesionDAO = (EmpleadoDAO) context.getBean(EmpleadoDAO.class);

	    List<EmpleadoDTO> empleadoDTO = sesionDAO.findEmpleado();
	    // Se realiza el insert
	    
	    
	    return empleadoDTO;
	   
	  }
		
	
	    
	 }

	
	


