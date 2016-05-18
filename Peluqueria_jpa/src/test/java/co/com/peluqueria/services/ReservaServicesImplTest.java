package co.com.peluqueria.services;

import static org.junit.Assert.*;

import org.junit.Test;

import co.com.peluqueria.jpa.services.ReservaServices;
import co.com.peluqueria.jpa.services.ReservaServicesImpl;

public class ReservaServicesImplTest {

	
	ReservaServices reservaServices = new ReservaServicesImpl();
		
	 @Test
	  public void testFindReserva() {
	    
	   assertNotNull(reservaServices.findReserva());
	   
	    
	  }
	 @Test
	 public void testFindReservaById(){
		 int reservaId = 1;
		 assertNotNull(reservaServices.findReservaByID(reservaId));
	 }
	 

	
	  
	  
	 
}
