package co.com.peluqueria.services;

import static org.junit.Assert.*;

import org.junit.Test;

import co.com.peluqueria.jpa.services.EmpleadoServices;
import co.com.peluqueria.jpa.services.EmpleadoServicesImpl;

public class EmpleadoServicesImplTest {

	
	EmpleadoServices empleadoServices = new EmpleadoServicesImpl();
		
	 @Test
	  public void testFindEmpleado() {
	    
	   assertNotNull(empleadoServices.findEmpleado());
	   
	    
	  }
	 @Test
	 public void testFindEmpleadoById(){
		 int empleadoId = 1;
		 assertNotNull(empleadoServices.findEmpleadoByID(empleadoId));
	 }
	 

	
	  
	  
	 
}
