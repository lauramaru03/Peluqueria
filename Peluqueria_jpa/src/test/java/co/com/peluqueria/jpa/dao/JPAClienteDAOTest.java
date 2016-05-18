package co.com.peluqueria.jpa.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.peluqueria.DAO.ClienteDAO;
import co.com.peluqueria.model.ClienteDTO;

public class JPAClienteDAOTest {

	@Test
	  public void testFindClienteByID() {
	    // Se obtiene el contexto de la aplicacion
	    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");

	    // Se obtiene el servicio que implementa los servicios de la base de datos
	    ClienteDAO sesionDAO = (ClienteDAO) context.getBean(ClienteDAO.class);

	    // Se realiza el insert
	    ClienteDTO clienteDTO = sesionDAO.findClienteByID(1);
	    System.out.println("Nombre: " + clienteDTO.getName());
	    System.out.println("Telefono: " + clienteDTO.getPhone());
	    System.out.println("Direccion:" + clienteDTO.getAdress());
	    System.out.println("Correo:" + clienteDTO.getEmail());
	    System.out.println("Fecha de nacimiento:" + clienteDTO.getBirthdate());
	    
	    context.close();
	    
	  }
	
	 @Test
	  public void testFindCliente() {
	    // Se obtiene el contexto de la aplicacion
	    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");

	    // Se obtiene el servicio que implementa los servicios de la base de datos
	    ClienteDAO sesionDAO = (ClienteDAO) context.getBean(ClienteDAO.class);

	    List<ClienteDTO> clienteDTO= sesionDAO.findCliente();
	    // Se realiza el insert
	    
	    for(ClienteDTO customer:clienteDTO)	{
	    	System.out.println("          ");
	    	System.out.println("Nombre: " + customer.getName());
	  	    System.out.println("Telefono: " + customer.getPhone());
	  	    System.out.println("Direccion:" + customer.getAdress());
	  	    System.out.println("Correo:" + customer.getEmail());
	  	    System.out.println("Fecha de nacimiento:" + customer.getBirthdate());
			System.out.println("          ");
			 
			}
	    context.close();
	   
	  }

}
