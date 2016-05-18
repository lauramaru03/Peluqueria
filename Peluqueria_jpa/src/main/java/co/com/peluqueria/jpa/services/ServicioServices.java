package co.com.peluqueria.jpa.services;

import java.util.List;

import co.com.peluqueria.model.ServicioDTO;

public interface ServicioServices {
	
	 public ServicioDTO findServicioByID(int servicioId);
	 public List<ServicioDTO> findServicio();

}
