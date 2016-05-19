package co.com.peluqueria.model;

import java.io.Serializable;

public class ReservaDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3641091616568873974L;

	private int id;
	
	private String cliente;
	
	private String date;
	
	private String servicio;
	
	private String lugar;
	
	private String empleado;
	
	private String hour;

	public int getId() {
		return id;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getServicio() {
		return servicio;
	}

	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getEmpleado() {
		return empleado;
	}

	public void setEmpleado(String empleado) {
		this.empleado = empleado;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ReservaDTO(int id, String cliente, String date, String servicio, String lugar, String empleado,
			String hour) {
	
		this.id = id;
		this.cliente = cliente;
		this.date = date;
		this.servicio = servicio;
		this.lugar = lugar;
		this.empleado = empleado;
		this.hour = hour;
	}

	public ReservaDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
	
}
