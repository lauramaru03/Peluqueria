package co.com.peluqueria.jdbc.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.peluqueria.jdbc.entities.Servicio;

public class JDBCServicioDAOTest {
/*
	@Test
	public void test(){
		
		//se obtiene el contexto de la aplicacion
		ApplicationContext context= new ClassPathXmlApplicationContext("Spring-Module.xml");
		
		//se obtiene el servicio que implementara los servicios de la base de datos
		 ServicioDAO sesionDAO = (ServicioDAO) context.getBean("servicioDAO");
		 
		 Servicio servicio = sesionDAO.findServicioById(3);
		 
		 System.out.println("Servicio:" + servicio.getName());
		 System.out.println("Descripcion:" + servicio.getDescription());
		 System.out.println("Precio desde:" + servicio.getPrice());
		
	}*/
	
	@Test
	public void testfindServicio() {
		
		//se obtiene el contexto de la aplicacion
				ApplicationContext context= new ClassPathXmlApplicationContext("Spring-Module.xml");
				
				//se obtiene el servicio que implementara los servicios de la base de datos
				 ServicioDAO sesionDAO = (ServicioDAO) context.getBean("servicioDAO");
				 
				ArrayList<Servicio> servicio = sesionDAO.findServicioList();
			     			 
				for(Servicio service:servicio)	{
				
				 System.out.println("Servicio:" + service.getName());
				 System.out.println("Descripcion:" + service.getDescription());
				 System.out.println("Precio desde:" + service.getPrice());
				 System.out.println("Fotografia:" + service.getPhotography());
				 
				}
		
		
	}
		 
		 
		
	

}
