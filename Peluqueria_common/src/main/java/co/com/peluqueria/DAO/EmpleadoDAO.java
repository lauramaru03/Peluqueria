package co.com.peluqueria.DAO;

import java.util.List;

import co.com.peluqueria.model.EmpleadoDTO;


public interface EmpleadoDAO {
	

	  public EmpleadoDTO findEmpleadoByID(int empleadoId);
	  public List<EmpleadoDTO> findEmpleado();

}
