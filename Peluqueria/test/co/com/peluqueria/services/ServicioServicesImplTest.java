package co.com.peluqueria.services;

import static org.junit.Assert.*;

import org.junit.Test;

public class ServicioServicesImplTest {

	
	ServicioServices servicioServices = new ServicioServicesImpl();
		
	 @Test
	  public void testFindServicio() {
	    
	   assertNotNull(servicioServices.findServicio());
	   
	    
	  }
	 @Test
	 public void testFindServicioById(){
		 int servicioId = 1;
		 assertNotNull(servicioServices.findServicioByID(servicioId));
	 }
	 

	
	  
	  
	 
}
