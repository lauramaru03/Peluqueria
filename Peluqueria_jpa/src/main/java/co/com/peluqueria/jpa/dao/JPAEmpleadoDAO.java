package co.com.peluqueria.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import co.com.peluqueria.DAO.EmpleadoDAO;
import co.com.peluqueria.model.EmpleadoDTO;

@Repository
public class JPAEmpleadoDAO implements EmpleadoDAO {
	
	 @PersistenceContext
	  private EntityManager em = null;
	  

	  public EmpleadoDTO findEmpleadoByID(int empleadoId) {
	    Query query = em.createQuery("SELECT new co.com.peluqueria.model.EmpleadoDTO(e.id,e.name,e.photography,e.profession,e.description,e.cellphone,e.email) FROM Empleado e WHERE e.id = :empleadoId");
	    query.setParameter("empleadoId", empleadoId);
	    EmpleadoDTO empleadoDTO = (EmpleadoDTO) query.getSingleResult();
	    return empleadoDTO;
	  }
	  
	  public List<EmpleadoDTO> findEmpleado(){
		  Query query = em.createQuery("SELECT new co.com.peluqueria.model.EmpleadoDTO(e.id,e.name,e.photography,e.profession,e.description,e.cellphone,e.email) FROM Empleado e ");
		  List<EmpleadoDTO> empleadosDTO = query.getResultList();
		  return empleadosDTO;
	  

	}

}
