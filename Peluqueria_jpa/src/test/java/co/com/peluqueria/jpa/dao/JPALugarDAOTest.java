/**
 * 
 */
package co.com.peluqueria.jpa.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.peluqueria.DAO.LugarDAO;
import co.com.peluqueria.model.LugarDTO;

public class JPALugarDAOTest {

  @Test
  public void testFindLugarByID() {
    // Se obtiene el contexto de la aplicacion
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");

    // Se obtiene el servicio que implementa los servicios de la base de datos
    LugarDAO sesionDAO = (LugarDAO) context.getBean(LugarDAO.class);

    // Se realiza el insert
    LugarDTO lugarDTO = sesionDAO.findLugarByID(1);
    System.out.println("Nombre: " + lugarDTO.getName());
    System.out.println("Direccion: " + lugarDTO.getAddress());
    System.out.println("Fotografia:" + lugarDTO.getPhotography());
    
    context.close();
  }
  @Test
  public void testFindLugar() {
    // Se obtiene el contexto de la aplicacion
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");

    // Se obtiene el servicio que implementa los servicios de la base de datos
    LugarDAO sesionDAO = (LugarDAO) context.getBean(LugarDAO.class);

    List<LugarDTO> lugarDTO = sesionDAO.findLugar();
    // Se realiza el insert
    
    for(LugarDTO place:lugarDTO)	{
    	 System.out.println("          ");
		 System.out.println("Servicio:" + place.getName());
		 System.out.println("Descripcion:" + place.getDescription());
		 System.out.println("Fotografia:" + place.getPhotography());
		 System.out.println("Direccion:" + place.getAddress());
		 System.out.println("          ");
		 
		}
    context.close();
   
  }

}
