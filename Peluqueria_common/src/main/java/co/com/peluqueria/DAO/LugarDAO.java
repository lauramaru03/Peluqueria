package co.com.peluqueria.DAO;

import java.util.List;

import co.com.peluqueria.model.LugarDTO;




/**
 * Interface que contiene los servicios asociados a la tabla lugares
 *
 */
public interface LugarDAO {

 
  public LugarDTO findLugarByID(int lugarId);
  public List<LugarDTO> findLugar();
}
