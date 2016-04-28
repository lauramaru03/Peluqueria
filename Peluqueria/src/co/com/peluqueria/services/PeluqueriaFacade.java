package co.com.peluqueria.services;

import java.util.ArrayList;


import co.com.peluqueria.model.ServicioDTO;

public class PeluqueriaFacade {
	
	
	  public ArrayList<ServicioDTO> findServicioList() {
		    ServicioServices servicioServices = new ServicioServicesImpl();
		    return servicioServices.findServicioList();
		  }
}
