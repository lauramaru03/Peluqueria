package co.com.peluqueria.DAO;

import java.util.List;

import co.com.peluqueria.model.ClienteDTO;



public interface ClienteDAO {
	
	
	 public ClienteDTO findClienteByID(int clienteId);
	 public List<ClienteDTO> findCliente();
	 /*public ClienteDTO createCliente();*/

}
