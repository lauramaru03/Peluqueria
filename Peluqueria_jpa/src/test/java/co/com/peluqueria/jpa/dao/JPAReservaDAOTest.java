package co.com.peluqueria.jpa.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.peluqueria.DAO.ReservaDAO;
import co.com.peluqueria.model.ReservaDTO;

public class JPAReservaDAOTest {

	@Test
	  public void testFindReservaByID() {
	    // Se obtiene el contexto de la aplicacion
	    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");

	    // Se obtiene el servicio que implementa los servicios de la base de datos
	    ReservaDAO sesionDAO = (ReservaDAO) context.getBean(ReservaDAO.class);

	    // Se realiza el insert
	    ReservaDTO reservaDTO = sesionDAO.findReservaByID(1);
	    System.out.println("Id: " + reservaDTO.getId());
	    System.out.println("Cliente: " + reservaDTO.getCliente());
	    System.out.println("Fecha: " + reservaDTO.getDate());
	    System.out.println("Servicio: " + reservaDTO.getServicio());
	    System.out.println("Empleado: " + reservaDTO.getEmpleado());
	    System.out.println("Lugar: " + reservaDTO.getLugar());
	    System.out.println("Hora: " + reservaDTO.getHour());
	    
	    context.close();
	    
	  }
	
	 @Test
	  public void testFindReserva() {
	    // Se obtiene el contexto de la aplicacion
	    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");

	    // Se obtiene el servicio que implementa los servicios de la base de datos
	    ReservaDAO sesionDAO = (ReservaDAO) context.getBean(ReservaDAO.class);

	    List<ReservaDTO> reservaDTO= sesionDAO.findReserva();
	    // Se realiza el insert
	    
	    for(ReservaDTO reservation:reservaDTO)	{
	    	System.out.println("          ");
	    	System.out.println("Id: " + reservation.getId());
		    System.out.println("Cliente: " + reservation.getCliente());
		    System.out.println("Fecha: " + reservation.getDate());
		    System.out.println("Servicio: " + reservation.getServicio());
		    System.out.println("Empleado: " + reservation.getEmpleado());
		    System.out.println("Lugar: " + reservation.getLugar());
		    System.out.println("Hora: " + reservation.getHour());
		    
			System.out.println("          ");
			 
			}
	    context.close();
	   
	  }

}
