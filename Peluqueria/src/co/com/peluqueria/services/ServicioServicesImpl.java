package co.com.peluqueria.services;

import java.util.List;

import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import co.com.peluqueria.model.ServicioDTO;

public class ServicioServicesImpl implements ServicioServices {
	
	 public List<ServicioDTO> getServiciosDTO() {

		 Client client=Client.create();
	
		WebResource webResource   = client.resource("http://localhost:8080/Peluqueria_ws/rest/json/firstpage/servicio1");

		 ClientResponse response =webResource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		 
		 if(response.getStatus() !=200){
			 throw new RuntimeException("failed:Htttp error code:" + response.getStatus());
		 }
		 
		  String output = response.getEntity(String.class);
		  

		 final Gson gson = new Gson();
		 
		 //convertir Json a una lista de objetos
		 TypeToken<List<ServicioDTO>> token = new TypeToken<List<ServicioDTO>>() {};
		 final List<ServicioDTO> servicioDTO = gson.fromJson(output, token.getType());
		
		 for(ServicioDTO place:servicioDTO){
		
		 System.out.println("Nombre:"+ place.getName());
		 System.out.println("Fotografia:"+ place.getPhotography());
		 System.out.println("Descripcion:"+ place.getDescription());
		 System.out.println("Precio:"+ place.getPrice());
		 System.out.println("              ");
		 
		 
		 
	 }
		 
		return servicioDTO;
	 }

	 
	 public ServicioDTO getServicioDTO(){
			
		 Client client=Client.create();
		
		WebResource webResource   = client.resource("http://localhost:8080/Peluqueria_ws/rest/json/firstpage/servicio2/1");
		
		 ClientResponse response =webResource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		 
		 if(response.getStatus() !=200){
			 throw new RuntimeException("failed:Htttp error code:" + response.getStatus());
		 }
		 
		 String output =response.getEntity(String.class);
		 
		 final Gson gson = new Gson();
		 final ServicioDTO servicioDTO =gson.fromJson(output, ServicioDTO.class);
		    
		 System.out.println("Nombre:"+ servicioDTO.getName());
		 System.out.println("Fotografia:"+servicioDTO.getPhotography());
		 System.out.println("Descripcion:"+servicioDTO.getDescription());
		 System.out.println("Precio:"+servicioDTO.getPrice());
		 System.out.println("              ");
		 
		return servicioDTO;
	

	 }
}
