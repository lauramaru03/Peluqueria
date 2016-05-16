package co.com.peluqueria.model;

import java.io.Serializable;

public class ServicioDTO implements Serializable  {
	
/**
	 * 
	 */
	private static final long serialVersionUID = -59540920061746146L;

	private int id;
	
	private String name;
	
	private String photography;
	
	private String description;
	
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

	public ServicioDTO(int id, String name, String photography, String description, String price) {

		this.id = id;
		this.name = name;
		this.photography = photography;
		this.description = description;
		this.price = price;
	}

	public ServicioDTO() {
		super();
	
	}



}
