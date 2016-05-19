package co.com.peluqueria.services;

import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import co.com.peluqueria.model.ReservaDTO;

public class ReservaServicesImpl implements ReservaServices {
	

	 
	 public ReservaDTO getReservaDTO(){
			
		 Client client=Client.create();
		
		WebResource webResource   = client.resource("http://localhost:8080/Peluqueria_ws/rest/json/firstpage/servicio7/1");
		
		 ClientResponse response =webResource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		 
		 if(response.getStatus() !=200){
			 throw new RuntimeException("failed:Htttp error code:" + response.getStatus());
		 }
		 
		 String output =response.getEntity(String.class);
		 
		 final Gson gson = new Gson();
		 final ReservaDTO reservaDTO =gson.fromJson(output, ReservaDTO.class);
		  
		 System.out.println("Fecha:"+ reservaDTO.getDate());
		 System.out.println("Cliente:"+ reservaDTO.getCliente());
		 System.out.println("Servicio:"+ reservaDTO.getServicio());
		 System.out.println("Lugar:"+ reservaDTO.getLugar());
		 System.out.println("Empleado:"+ reservaDTO.getEmpleado());
		 System.out.println("Hora:"+ reservaDTO.getHour());
		 
		 System.out.println("              ");
		 
		return reservaDTO;
	
	 }
	 
}
