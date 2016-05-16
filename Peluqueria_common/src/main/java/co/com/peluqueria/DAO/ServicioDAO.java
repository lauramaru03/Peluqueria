package co.com.peluqueria.DAO;

import java.util.List;



import co.com.peluqueria.model.ServicioDTO;

public interface ServicioDAO {
	

	  public ServicioDTO findServicioByID(int servicioId);
	  public List<ServicioDTO> findServicio();
	

}
