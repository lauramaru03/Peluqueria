package co.com.peluqueria.jpa.entities;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
;


@Entity
@Table(name="Reserva")

public class Reserva {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="id")
		private int id;
		
		@Column(name="fecha")
		private String date;
		
		@OneToOne
		@JoinColumn(name="cliente")
		private Cliente cliente;
		
		@OneToOne
		@JoinColumn(name="servicio")
		private Servicio servicio;
		
		@OneToOne
		@JoinColumn(name="lugar")
		private Lugar lugar;
		
		@OneToOne
		@JoinColumn(name="empleado")
		private Empleado empleado;
		
		
		
		private String hour;



		public int getId() {
			return id;
		}



		public void setId(int id) {
			this.id = id;
		}



		public String getDate() {
			return date;
		}



		public void setDate(String date) {
			this.date = date;
		}



		public Cliente getCliente() {
			return cliente;
		}



		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}



		public Servicio getServicio() {
			return servicio;
		}



		public void setServicio(Servicio servicio) {
			this.servicio = servicio;
		}



		public Lugar getLugar() {
			return lugar;
		}



		public void setLugar(Lugar lugar) {
			this.lugar = lugar;
		}



		public Empleado getEmpleado() {
			return empleado;
		}



		public void setEmpleado(Empleado empleado) {
			this.empleado = empleado;
		}



		public String getHour() {
			return hour;
		}



		public void setHour(String hour) {
			this.hour = hour;
		}
		
		


}
