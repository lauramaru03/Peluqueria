package co.com.peluqueria.services;

import java.util.List;

import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import co.com.peluqueria.model.LugarDTO;

public class LugarServicesImpl implements LugarServices {
	
	 public List<LugarDTO> getLugaresDTO() {

		 Client client=Client.create();
	
		WebResource webResource   = client.resource("http://localhost:8080/Peluqueria_ws/rest/json/firstpage/servicio3");

		 ClientResponse response =webResource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		 
		 if(response.getStatus() !=200){
			 throw new RuntimeException("failed:Htttp error code:" + response.getStatus());
		 }
		 
		  String output = response.getEntity(String.class);
		  

		 final Gson gson = new Gson();
		 
		 //convertir Json a una lista de objetos
		 TypeToken<List<LugarDTO>> token = new TypeToken<List<LugarDTO>>() {};
		 final List<LugarDTO> lugarDTO = gson.fromJson(output, token.getType());
		
		 for(LugarDTO place:lugarDTO){
		
			 System.out.println("Nombre:"+ place.getName());
			 System.out.println("Fotografia:"+ place.getPhotography());
			 System.out.println("Descripcion:"+ place.getDescription());
			 System.out.println("Direccion:"+ place.getAddress());
			 System.out.println("Horario de atencion:"+ place.getSchedule());
			 System.out.println("Telefono:"+ place.getPhone());
			 System.out.println("Correo Electronico:"+ place.getEmail());
			 System.out.println("              ");
		  
		 
	 }
		 
		return lugarDTO;
	 }

	 
	 public LugarDTO getLugarDTO(){
			
		 Client client=Client.create();
		
		WebResource webResource   = client.resource("http://localhost:8080/Peluqueria_ws/rest/json/firstpage/servicio4/1");
		
		 ClientResponse response =webResource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		 
		 if(response.getStatus() !=200){
			 throw new RuntimeException("failed:Htttp error code:" + response.getStatus());
		 }
		 
		 String output =response.getEntity(String.class);
		 
		 final Gson gson = new Gson();
		 final LugarDTO lugarDTO =gson.fromJson(output, LugarDTO.class);
		    
		 System.out.println("Nombre:"+ lugarDTO.getName());
		 System.out.println("Fotografia:"+ lugarDTO.getPhotography());
		 System.out.println("Descripcion:"+ lugarDTO.getDescription());
		 System.out.println("Direccion:"+ lugarDTO.getAddress());
		 System.out.println("Horario de atencion:"+ lugarDTO.getSchedule());
		 System.out.println("Telefono:"+ lugarDTO.getPhone());
		 System.out.println("Correo Electronico:"+ lugarDTO.getEmail());
		 System.out.println("              ");
		 
		return lugarDTO;
	

	 }
}
