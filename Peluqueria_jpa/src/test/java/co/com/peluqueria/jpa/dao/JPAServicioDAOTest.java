package co.com.peluqueria.jpa.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.peluqueria.DAO.ServicioDAO;
import co.com.peluqueria.model.ServicioDTO;

public class JPAServicioDAOTest {

	 @Test
	  public void testFindServicioByID() {
	    // Se obtiene el contexto de la aplicacion
	    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");

	    // Se obtiene el servicio que implementa los servicios de la base de datos
	    ServicioDAO sesionDAO = (ServicioDAO) context.getBean(ServicioDAO.class);

	    // Se realiza el insert
	    ServicioDTO servicioDTO = sesionDAO.findServicioByID(1);
	    System.out.println("Nombre: " + servicioDTO.getName());
	    System.out.println("Direccion: " + servicioDTO.getPhotography());
	    System.out.println("Fotografia:" + servicioDTO.getDescription());
	    System.out.println("Fotografia:" + servicioDTO.getPrice());
	    
	    context.close();
	    
	  }
	  @Test
	  public void testFindServicio() {
	    // Se obtiene el contexto de la aplicacion
	    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");

	    // Se obtiene el servicio que implementa los servicios de la base de datos
	    ServicioDAO sesionDAO = (ServicioDAO) context.getBean(ServicioDAO.class);

	    List<ServicioDTO> servicioDTO = sesionDAO.findServicio();
	    // Se realiza el insert
	    
	    for(ServicioDTO service:servicioDTO)	{
	    	 System.out.println("          ");
			 System.out.println("Servicio:" + service.getName());
			 System.out.println("Fotografia:" + service.getPhotography());
			 System.out.println("Descripcion:" + service.getDescription());
			 System.out.println("Direccion:" + service.getPrice());
			 System.out.println("          ");
			 
			}
	   
	  }

}
