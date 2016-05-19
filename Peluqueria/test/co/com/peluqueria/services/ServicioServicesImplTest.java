package co.com.peluqueria.services;

import org.junit.Test;

public class ServicioServicesImplTest {

	@Test
	public void getServicioDTOTest() {
		PeluqueriaFacadeClient peluqueriafacadeClient= new PeluqueriaFacadeClient();
		peluqueriafacadeClient.getServicioDTO();
		
	}
	
	@Test
	public void getServiciosDTOTest() {
		PeluqueriaFacadeClient peluqueriafacadeClient= new PeluqueriaFacadeClient();
		peluqueriafacadeClient.getServiciosDTO();
		
	}

}
