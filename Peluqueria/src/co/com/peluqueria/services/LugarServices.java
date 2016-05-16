package co.com.peluqueria.services;

import java.util.List;

import co.com.peluqueria.model.LugarDTO;

public interface LugarServices {
	
	public LugarDTO findLugarByID(int lugarId);
	public List<LugarDTO> findLugar();

}
