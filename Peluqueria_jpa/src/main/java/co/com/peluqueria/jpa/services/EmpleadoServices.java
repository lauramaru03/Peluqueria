package co.com.peluqueria.jpa.services;

import java.util.List;

import co.com.peluqueria.model.EmpleadoDTO;

public interface EmpleadoServices {
	

	  public EmpleadoDTO findEmpleadoByID(int empleadoId);
	  public List<EmpleadoDTO> findEmpleado();

}
