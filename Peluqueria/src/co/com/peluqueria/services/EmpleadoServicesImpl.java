package co.com.peluqueria.services;

import java.util.List;

import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import co.com.peluqueria.model.EmpleadoDTO;

public class EmpleadoServicesImpl implements EmpleadoServices {
	
	 public List<EmpleadoDTO> getEmpleadosDTO() {

		 Client client=Client.create();
	
		WebResource webResource   = client.resource("http://localhost:8080/Peluqueria_ws/rest/json/firstpage/servicio5");

		 ClientResponse response =webResource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		 
		 if(response.getStatus() !=200){
			 throw new RuntimeException("failed:Htttp error code:" + response.getStatus());
		 }
		 
		  String output = response.getEntity(String.class);
		  

		 final Gson gson = new Gson();
		 
		 //convertir Json a una lista de objetos
		 TypeToken<List<EmpleadoDTO>> token = new TypeToken<List<EmpleadoDTO>>() {};
		 final List<EmpleadoDTO> empleadoDTO = gson.fromJson(output, token.getType());
		
		 for(EmpleadoDTO employee:empleadoDTO){
		
			 System.out.println("Nombre:"+ employee.getName());
			 System.out.println("Fotografia:"+ employee.getPhotography());
			 System.out.println("Lugar:"+ employee.getProfession());
			 System.out.println("Descripcion:"+ employee.getDescription());
			 System.out.println("Lugar:"+ employee.getLugar());
			 System.out.println("Telefono:"+ employee.getCellphone());
			 System.out.println("Lugar:"+ employee.getEmail());
			 System.out.println("              ");
		  
		 
	 }
		 
		return empleadoDTO;
	 }

	 
	 public EmpleadoDTO getEmpleadoDTO(){
			
		 Client client=Client.create();
		
		WebResource webResource   = client.resource("http://localhost:8080/Peluqueria_ws/rest/json/firstpage/servicio6/1");
		
		 ClientResponse response =webResource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		 
		 if(response.getStatus() !=200){
			 throw new RuntimeException("failed:Htttp error code:" + response.getStatus());
		 }
		 
		 String output =response.getEntity(String.class);
		 
		 final Gson gson = new Gson();
		 final EmpleadoDTO empleadoDTO =gson.fromJson(output, EmpleadoDTO.class);
		    
		 System.out.println("Nombre:"+ empleadoDTO.getName());
		 System.out.println("Fotografia:"+ empleadoDTO.getPhotography());
		 System.out.println("Lugar:"+ empleadoDTO.getProfession());
		 System.out.println("Descripcion:"+ empleadoDTO.getDescription());
		 System.out.println("Lugar:"+ empleadoDTO.getLugar());
		 System.out.println("Telefono:"+ empleadoDTO.getCellphone());
		 System.out.println("Lugar:"+ empleadoDTO.getEmail());
		 System.out.println("              ");
		 
		return empleadoDTO;
	

	 }
}
