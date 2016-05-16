package co.com.peluqueria.DAO;

import java.util.List;


import co.com.peluqueria.model.ReservaDTO;

public interface ReservaDAO {
	
	
	 public ReservaDTO findReservaByID(int reservaId);
	 public List<ReservaDTO> findReserva();
	/* public ReservaDTO createReserva();*/
	 

}
