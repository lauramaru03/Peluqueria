package co.com.peluqueria.services;

import org.junit.Test;

public class LugarServicesImplTest {

	@Test
	public void getLugaresDTOTest() {
		PeluqueriaFacadeClient peluqueriafacadeClient= new PeluqueriaFacadeClient();
		peluqueriafacadeClient.getLugaresDTO();
		
	}
	
	@Test
	public void getLugarDTOTest() {
		PeluqueriaFacadeClient peluqueriafacadeClient= new PeluqueriaFacadeClient();
		peluqueriafacadeClient.getLugarDTO();
		
	}

}
