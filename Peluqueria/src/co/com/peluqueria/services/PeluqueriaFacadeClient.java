package co.com.peluqueria.services;


import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import co.com.peluqueria.model.ServicioDTO;

public class PeluqueriaFacadeClient {
	
	
	 public ServicioDTO getServicioDTO() {
		 // creando un cliente para el ws
		 Client client=Client.create();
		 //devuelve web resource
		WebResource webResource   = client.resource("http://localhost:8080/Peluqueria_ws/rest/json/firstpage/servicio1");
		
		//envia la peticion al WS y obtiene la respuesta
		 ClientResponse response =webResource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		 
		 if(response.getStatus() !=200){
			 throw new RuntimeException("failed:Htttp error code:" + response.getStatus());
		 }
		 
		 String output =response.getEntity(String.class);
		 // json convertido en un string
		 System.out.println(output);
		 
		 //Convertir json a DTO
		 return null;
	 }

}
