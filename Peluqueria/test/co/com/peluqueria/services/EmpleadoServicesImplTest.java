package co.com.peluqueria.services;

import org.junit.Test;

public class EmpleadoServicesImplTest {

	@Test
	public void getEmpleadosDTOTest() {
		PeluqueriaFacadeClient peluqueriafacadeClient= new PeluqueriaFacadeClient();
		peluqueriafacadeClient.getEmpleadosDTO();
		
	}
	
	@Test
	public void getEmpleadoDTOTest() {
		PeluqueriaFacadeClient peluqueriafacadeClient= new PeluqueriaFacadeClient();
		peluqueriafacadeClient.getEmpleadoDTO();
		
	}

}
