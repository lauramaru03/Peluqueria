package co.com.peluqueria.jdbc.dao;

import co.com.peluqueria.jdbc.entities.Lugar;


/**
 * Interface que contiene los servicios asociados a la tabla lugares
 * @author 
 */
public interface LugarDAO {

  /**
   * Obtiene un lugar dado el id
   * @param lugarId
   * @return Lugar {@link Lugar}
   */
  public Lugar findLugarByID(int lugarId);
}
