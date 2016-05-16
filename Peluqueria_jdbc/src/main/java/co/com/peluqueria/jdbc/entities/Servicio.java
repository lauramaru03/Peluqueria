package co.com.peluqueria.jdbc.entities;

public class Servicio {
	
	private int id;
	
	private String name;
	
	private String photography;
	
	private String description;
	
	private String price;
	

	public Servicio(String nombre, String fotografia, String descripcion, String precio) {
		this.name=nombre;
		this.description=descripcion;
		this.price=precio;
		this.photography=fotografia;
		
		
		
	}

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
	

	public String getPhotography() {
		return photography;
	}

	public void setPhotography(String photography) {
		this.photography = photography;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	

}
