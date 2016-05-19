package co.com.peluqueria.jpa.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.peluqueria.DAO.EmpleadoDAO;
import co.com.peluqueria.model.EmpleadoDTO;


public class JPAEmpleadoDAOTest {

	
	  @Test
	  public void testFindEmpleado() {
	    // Se obtiene el contexto de la aplicacion
	    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");

	    // Se obtiene el servicio que implementa los servicios de la base de datos
	    EmpleadoDAO sesionDAO = (EmpleadoDAO) context.getBean(EmpleadoDAO.class);

	    List<EmpleadoDTO> empleadoDTO= sesionDAO.findEmpleado();
	    // Se realiza el insert
	    
	    for(EmpleadoDTO employee:empleadoDTO)	{
	    	System.out.println("          ");
	    	System.out.println("Nombre: " + employee.getName());
	 	    System.out.println("Fotografia: " + employee.getPhotography());
	 	    System.out.println("Profesion:" + employee.getProfession());
	 	    System.out.println("Descripcion:" + employee.getDescription());
	 	    System.out.println("Correo:" + employee.getEmail());
	 	    System.out.println("Celular:" + employee.getCellphone());
	 	    /*System.out.println("Lugar:"+ employee.getLugar());*/
			System.out.println("          ");
			 
			}
	    context.close();
	   
	  }
	  
	  @Test
	  public void testFindEmpleadoById() {
	    // Se obtiene el contexto de la aplicacion
	    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");

	    // Se obtiene el servicio que implementa los servicios de la base de datos
	    EmpleadoDAO sesionDAO = (EmpleadoDAO) context.getBean(EmpleadoDAO.class);

	    EmpleadoDTO lugarDTO = sesionDAO.findEmpleadoByID(1);
	    	System.out.println("          ");
	    	System.out.println("Nombre: " + lugarDTO .getName());
	 	    System.out.println("Fotografia: " + lugarDTO .getPhotography());
	 	    System.out.println("Profesion:" + lugarDTO .getProfession());
	 	    System.out.println("Descripcion:" + lugarDTO .getDescription());
	 	    System.out.println("Correo:" + lugarDTO.getEmail());
	 	    System.out.println("Celular:" + lugarDTO .getCellphone());
	 	    /*System.out.println("Lugar:"+ employee.getLugar());*/
			System.out.println("          ");
			 
			
	    context.close();
	   
	  }

}
