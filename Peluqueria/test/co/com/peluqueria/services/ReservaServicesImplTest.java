package co.com.peluqueria.services;

import org.junit.Test;

public class ReservaServicesImplTest {

	@Test
	public void getReservaDTOTest() {
		PeluqueriaFacadeClient peluqueriafacadeClient= new PeluqueriaFacadeClient();
		peluqueriafacadeClient.getReservaDTO();
		
	}

}
