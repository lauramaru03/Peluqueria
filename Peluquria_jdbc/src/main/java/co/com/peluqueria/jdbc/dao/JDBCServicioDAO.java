package co.com.peluqueria.jdbc.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import co.com.peluqueria.jdbc.entities.Servicio;

public class JDBCServicioDAO implements ServicioDAO {
	
	 private DataSource dataSource;
	 
	 
	 public void setDataSource(DataSource dataSource) {
		    this.dataSource = dataSource;
		  }

	 public Servicio findServicioById(int servicioId) {

		    // Consulta que se realizara contra la base de datos
		    String sql = "SELECT * FROM servicio WHERE id = ?";

		    // Entidad que retornara el metodo
		    Servicio servicio= null;

		    // Objetos que administran la conexion a la base de datos
		    Connection conn = null;
		    PreparedStatement ps = null;
		    ResultSet rs = null;

		    try {
		      // Obtiene la conexion y prepara la consulta
		      conn = dataSource.getConnection();
		      ps = conn.prepareStatement(sql);
		      ps.setInt(1, servicioId);

		      // Se obtienen los datos
		      rs = ps.executeQuery();
		      if (rs.next()) {
		        servicio.setId(rs.getInt("id"));
		        servicio.setName(rs.getString("nombre"));
		        servicio.setDescription(rs.getString("descripcion"));
		        servicio.setPrice(rs.getString("valor"));
		      }

		      return servicio;
		    } catch (SQLException e) {
		      e.printStackTrace();
		    } finally {
		    	try {
		            if (rs != null) {
		              rs.close();
		            }
		            if (ps != null) {
		              ps.close();
		            }
		            // Se cierra la conexion aqui porque siempre se debe usar independiente de las excepciones
		            if (conn != null) {
		              conn.close();
		            }
		        } catch (SQLException e) {
		          e.printStackTrace();
		        }
		      }
		    

		    return null;
		  }
	 
	 public ArrayList<Servicio> findServicioList() {
		 
		 // Consulta que se realizara contra la base de datos
		    String sql = "SELECT * FROM servicio";
		    
		    //creamos una lista de los servicios
		    ArrayList<Servicio> servicios= new ArrayList<Servicio>(); 
		    
		    // Entidad que retornara el metodo
		    Servicio servicio= null;
		    
		    // Objetos que administran la conexion a la base de datos
		    Connection conn = null;
		    PreparedStatement ps = null;
		    ResultSet rs = null;
		    
		    try {
			      // Obtiene la conexion y prepara la consulta
			      conn = dataSource.getConnection();
			      ps = conn.prepareStatement(sql);

			      // Se obtienen los datos
			      rs = ps.executeQuery();
			      while (rs.next()) {
			    	  
			    	 servicio= new Servicio(rs.getString("nombre"),
			    			 				rs.getString("descripcion"),
			    			 				rs.getString("valor")); 
			    	  
			        
			        servicios.add(servicio);
			      }

			      return servicios;
			    } catch (SQLException e) {
			      e.printStackTrace();
			    } finally {
			    	try {
			            if (rs != null) {
			              rs.close();
			            }
			            if (ps != null) {
			              ps.close();
			            }
			            // Se cierra la conexion aqui porque siempre se debe usar independiente de las excepciones
			            if (conn != null) {
			              conn.close();
			            }
			        } catch (SQLException e) {
			          e.printStackTrace();
			        }
			      }
			    

			    return null;
			  
		    
		 
	 }
 
		}
	 



