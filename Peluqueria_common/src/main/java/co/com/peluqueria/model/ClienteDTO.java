package co.com.peluqueria.model;

import java.io.Serializable;
import java.sql.Date;

public class ClienteDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4083430803758265474L;
	
	private int id;
	
	private String name;
	
	private String phone;
	
	private String adress;
	
	private String email;
	
	private Date birthdate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public ClienteDTO(int id, String name, String phone, String adress, String email, Date birthdate) {
		
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.adress = adress;
		this.email = email;
		this.birthdate = birthdate;
	}

	public ClienteDTO() {
		super();
		
	}
	
	
	
	

}
