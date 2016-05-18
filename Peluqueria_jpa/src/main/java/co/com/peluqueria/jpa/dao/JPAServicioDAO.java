package co.com.peluqueria.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import co.com.peluqueria.DAO.ServicioDAO;
import co.com.peluqueria.model.ServicioDTO;

@Repository
public class JPAServicioDAO implements ServicioDAO {
	
	@PersistenceContext
	private EntityManager em= null;
	
	public ServicioDTO findServicioByID(int servicioId){
		
		Query query = em.createQuery("SELECT new co.com.peluqueria.model.ServicioDTO(s.id,s.name,s.photography,s.description,s.price)FROM Servicio s WHERE s.id = :servicioId");
	    query.setParameter("servicioId", servicioId);
	    ServicioDTO servicioDTO = (ServicioDTO) query.getSingleResult();
	    return servicioDTO;
		
	}
	
	public List<ServicioDTO> findServicio(){
		 Query query = em.createQuery("SELECT new co.com.peluqueria.model.ServicioDTO(s.id,s.name,s.photography,s.description,s.price)FROM Servicio s");
		  List<ServicioDTO> serviciosDTO = query.getResultList();
		  return serviciosDTO;
		
	}

	

}
