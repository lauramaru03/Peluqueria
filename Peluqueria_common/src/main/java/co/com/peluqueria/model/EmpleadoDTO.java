package co.com.peluqueria.model;

import java.io.Serializable;

public class EmpleadoDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private String name;
	
	private String photography;
	
	private String profession;
	
	private String description;
	
	private String cellphone;
	
	private String email;
	
	private int lugar_id;
	


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
	 * @return the profession
	 */
	public String getProfession() {
		return profession;
	}

	/**
	 * @param profession the profession to set
	 */
	public void setProfession(String profession) {
		this.profession = profession;
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
	 * @return the cellphone
	 */
	public String getCellphone() {
		return cellphone;
	}

	/**
	 * @param cellphone the cellphone to set
	 */
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	

	public EmpleadoDTO(int id, String name, String photography, String profession, String description, String cellphone,
			String email) {
		
		this.id = id;
		this.name = name;
		this.photography = photography;
		this.profession = profession;
		this.description = description;
		this.cellphone = cellphone;
		this.email = email;
		this.lugar_id = lugar_id;
		
	}

	public EmpleadoDTO() {
		super();
		
	}
	

}
