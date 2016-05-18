package co.com.peluqueria.jpa.services;

import java.util.List;

import co.com.peluqueria.model.ReservaDTO;

public interface ReservaServices {
	
	 public ReservaDTO findReservaByID(int reservaId);
	 public List<ReservaDTO> findReserva();
	/* public ReservaDTO createReserva();*/

}
