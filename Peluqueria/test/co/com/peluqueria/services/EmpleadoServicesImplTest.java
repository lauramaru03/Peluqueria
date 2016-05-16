package co.com.peluqueria.services;

import static org.junit.Assert.*;

import org.junit.Test;

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
