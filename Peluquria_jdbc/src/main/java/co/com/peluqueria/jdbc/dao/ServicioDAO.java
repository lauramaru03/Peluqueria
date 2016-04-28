package co.com.peluqueria.jdbc.dao;

import java.util.ArrayList;

import co.com.peluqueria.jdbc.entities.Servicio;


/**
 * interface que contiene los servicios asociados a la tabla servicios
 * @author laura
 *
 */


public interface ServicioDAO {
	
	public Servicio findServicioById(int servicioId);
	public ArrayList<Servicio> findServicioList();
	
	
	

}
