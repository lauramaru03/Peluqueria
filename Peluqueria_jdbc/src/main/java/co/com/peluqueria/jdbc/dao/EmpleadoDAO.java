package co.com.peluqueria.jdbc.dao;

import co.com.peluqueria.jdbc.entities.Empleado;

/**
 * interface que contiene los servicios asociados a la tabla empleados
 */


public interface EmpleadoDAO {
	
	/**
	 * obtiene un empleado dado el id
	 * @param empleadoId
	 * 
	 */
	public Empleado findEmpleadoById(int empleadoId);
	
}
