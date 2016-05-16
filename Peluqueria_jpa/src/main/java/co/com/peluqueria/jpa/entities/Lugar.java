package co.com.peluqueria.jpa.entities;

import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Entidad que contiene toda la informaci�n de los lugares
 * @author Milton
 */
@Entity
@Table(name="lugar")
public class Lugar {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id")
  private int id;

  @Column(name="nombre")
  private String name;

  @Column(name="urlFotografia")
  private String photography;

@Column(name="direccion")
  private String address;

  @Column(name="dir_lat")
  private Long lat;

  @Column(name="dir_lon")
  private Long lng;

  @Column(name="telefono")
  private String phone;

  @Column(name="descripcion")
  private String description;

  @Column(name="horario")
  private String schedule;

  @Column(name="correo")
  private String email;
  
  /**
   * mappedBy para indicar el nombre de la propiedad en la clase Empleado que define la relaci�n.
   */
  @OneToMany(mappedBy="lugar")
  private List<Empleado> empleados;

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
   * @return the address
   */
  public String getAddress() {
    return address;
  }

  /**
   * @param address the address to set
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * @return the lat
   */
  public Long getLat() {
    return lat;
  }

  /**
   * @param lat the lat to set
   */
  public void setLat(Long lat) {
    this.lat = lat;
  }

  /**
   * @return the lng
   */
  public Long getLng() {
    return lng;
  }

  /**
   * @param lng the lng to set
   */
  public void setLng(Long lng) {
    this.lng = lng;
  }

  /**
   * @return the phone
   */
  public String getPhone() {
    return phone;
  }

  /**
   * @param phone the phone to set
   */
  public void setPhone(String phone) {
    this.phone = phone;
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
   * @return the schedule
   */
  public String getSchedule() {
    return schedule;
  }

  /**
   * @param schedule the schedule to set
   */
  public void setSchedule(String schedule) {
    this.schedule = schedule;
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
}
