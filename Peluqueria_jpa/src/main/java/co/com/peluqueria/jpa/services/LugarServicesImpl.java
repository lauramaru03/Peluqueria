package co.com.peluqueria.jpa.services;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.peluqueria.DAO.LugarDAO;
import co.com.peluqueria.model.LugarDTO;




public class LugarServicesImpl implements LugarServices {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
	

	
	public LugarDTO findLugarByID(int lugarId) {
		
		return this.findByIDJPA(lugarId); 
	}

	private LugarDTO findByIDJPA(int lugarId) {
		
		 

		    // Se obtiene el servicio que implementa los servicios de la base de datos
		    LugarDAO sesionDAO = (LugarDAO) context.getBean(LugarDAO.class);

		    // Se realiza el insert
		    LugarDTO lugarDTO = sesionDAO.findLugarByID(1);
		    
		    
		return lugarDTO;
	}

	
	public List<LugarDTO> findLugar() {
		
		return this.findLugarJPA();
	}

	private List<LugarDTO> findLugarJPA() {
		
	    // Se obtiene el servicio que implementa los servicios de la base de datos
	    LugarDAO sesionDAO = (LugarDAO) context.getBean(LugarDAO.class);

	    List<LugarDTO> lugarDTO = sesionDAO.findLugar();
	    // Se realiza el insert
	    
	    
	    return lugarDTO;
	   
	  }
		
	
	    
	 }

	
	


