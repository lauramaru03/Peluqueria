package co.com.peluqueria.jpa.dao;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import co.com.peluqueria.DAO.ClienteDAO;
import co.com.peluqueria.model.ClienteDTO;
import co.com.peluqueria.model.EmpleadoDTO;


@Repository
public class JPAClienteDAO implements ClienteDAO {
	
	@PersistenceContext
	 private EntityManager em = null;

	public ClienteDTO findClienteByID(int clienteId) {
		Query query = em.createQuery("SELECT new co.com.peluqueria.model.ClienteDTO(c.id,c.name,c.phone,c.address,c.email,c.birthdate) FROM Cliente c WHERE c.id = :clienteId");
	    query.setParameter("clienteId", clienteId);
	    ClienteDTO clienteDTO = (ClienteDTO) query.getSingleResult();
	    return clienteDTO;

	}

	public List<ClienteDTO> findCliente() {
		 Query query = em.createQuery("SELECT new co.com.peluqueria.model.ClienteDTO(c.id,c.name,c.phone,c.address,c.email,c.birthdate) FROM Cliente c ");
		  List<ClienteDTO> clientesDTO = query.getResultList();
		  return clientesDTO;

	}
	

}
