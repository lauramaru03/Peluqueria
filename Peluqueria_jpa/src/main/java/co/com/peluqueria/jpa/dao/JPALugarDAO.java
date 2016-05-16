package co.com.peluqueria.jpa.dao;




import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import co.com.peluqueria.DAO.LugarDAO;
import co.com.peluqueria.jpa.entities.Lugar;
import co.com.peluqueria.model.LugarDTO;

@Repository
public class JPALugarDAO implements LugarDAO {
  
  @PersistenceContext
  private EntityManager em = null;
  

  public LugarDTO findLugarByID(int lugarId) {
    Query query = em.createQuery("SELECT new co.com.peluqueria.model.LugarDTO(l.id,l.name,l.photography,l.address,l.lat,l.lng,l.phone,l.description,l.schedule,l.email)FROM Lugar l WHERE l.id = :lugarId");
    query.setParameter("lugarId", lugarId);
    LugarDTO lugarDTO = (LugarDTO) query.getSingleResult();
    return lugarDTO;
  }
  
  public List<LugarDTO> findLugar(){
	  Query query = em.createQuery("SELECT new co.com.peluqueria.model.LugarDTO(l.id,l.name,l.photography,l.address,l.lat,l.lng,l.phone,l.description,l.schedule,l.email)FROM Lugar l");
	  List<LugarDTO> lugaresDTO = query.getResultList();
	  return lugaresDTO;
  }

}
