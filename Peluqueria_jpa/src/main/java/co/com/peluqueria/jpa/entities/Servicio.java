package co.com.peluqueria.jpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	/**
	 * Entidad que contiene toda la informacion de los Servicios
	 */
	
	@Entity
	@Table(name="servicio")
	
	public class Servicio{
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nombre")
	private String name;
	
	@Column(name="urlFotografia")
	private String photography;
	
	@Column(name="descripcion")
	private String description;
	
	@Column(name="valor")
	private String price;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the photography
	 */
	public String getPhotography() {
		return photography;
	}

	/**
	 * @param photography the photography to set
	 */
	public void setPhotography(String photography) {
		this.photography = photography;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}

		
		
	}
	
	
		
	


