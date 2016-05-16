package co.com.peluqueria.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import co.com.peluqueria.DAO.ReservaDAO;
import co.com.peluqueria.model.ReservaDTO;


@Repository
public class JPAReservaDAO implements ReservaDAO {
	
	@PersistenceContext
	  private EntityManager em = null;

	public ReservaDTO findReservaByID(int reservaId) {
		Query query = em.createQuery("SELECT new co.com.peluqueria.model.ReservaDTO(r.id,r.cliente.name,r.date,r.servicio.name,r.lugar,name,r.empleado.name,r.hour)FROM Reserva r WHERE r.id = :reservaId");
	    query.setParameter("reservaId", reservaId);
	    ReservaDTO reservaDTO = (ReservaDTO) query.getSingleResult();
	    return reservaDTO;
		
	}

	public List<ReservaDTO> findReserva() {
		 Query query = em.createQuery("SELECT new co.com.peluqueria.model.ReservaDTO(r.id,r.cliente.name,r.date,r.servicio.name,r.lugar,name,r.empleado.name,r.hour)FROM Reserva r");
		  List<ReservaDTO> reservasDTO = query.getResultList();
		  return reservasDTO;
	}

}
