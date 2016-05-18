package co.com.peluqueria.jpa.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.peluqueria.DAO.EmpleadoDAO;
import co.com.peluqueria.model.EmpleadoDTO;


public class JPAEmpleadoDAOTest {

	@Test
	  public void testFindEmpleadoByID() {
	    // Se obtiene el contexto de la aplicacion
	    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");

	    // Se obtiene el servicio que implementa los servicios de la base de datos
	    EmpleadoDAO sesionDAO = (EmpleadoDAO) context.getBean(EmpleadoDAO.class);

	    // Se realiza el insert
	    EmpleadoDTO empleadoDTO = sesionDAO.findEmpleadoByID(1);
	    System.out.println("Nombre: " + empleadoDTO.getName());
	    System.out.println("Direccion: " + empleadoDTO.getPhotography());
	    System.out.println("Profesion:" + empleadoDTO.getProfession());
	    System.out.println("Descripcion:" + empleadoDTO.getDescription());
	    System.out.println("Correo:" + empleadoDTO.getEmail());
	    System.out.println("Celular:" + empleadoDTO.getCellphone());
	    System.out.println("Lugar:"+ empleadoDTO.getLugar());
	    
	    
	    
	    context.close();
	  }
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
	 	    System.out.println("Lugar:"+ employee.getLugar());
			System.out.println("          ");
			 
			}
	    context.close();
	   
	  }

}
