package co.com.peluqueria.services;

import static org.junit.Assert.*;

import org.junit.Test;

public class ServicioServicesImplTest {

	
	 
		
	 @Test
	  public void testFindServicioList() {
	    
	    ServicioServices servicioServices = new ServicioServicesImpl();
	    assertNotNull(servicioServices.findServicioList());
	    
	  }

	
	  
	  
	 
}
