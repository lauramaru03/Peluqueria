package co.com.peluqueria.services;

import static org.junit.Assert.*;

import org.junit.Test;

public class LugarServicesImplTest {

	
	LugarServices lugarServices = new LugarServicesImpl();
		
	 @Test
	  public void testFindLugar() {
	    
	   assertNotNull(lugarServices.findLugar());
	   
	    
	  }
	 @Test
	 public void testFindLugarById(){
		 int lugarId = 1;
		 assertNotNull(lugarServices.findLugarByID(lugarId));
	 }
	 

	
	  
	  
	 
}
