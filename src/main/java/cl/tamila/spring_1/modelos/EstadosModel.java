package cl.tamila.spring_1.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
 

@Entity
@Table(name="estados") 
public class EstadosModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 50, name="nombre")
	private String Nombre;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) { 
		Nombre = nombre;
	}
	public EstadosModel(String nombre) {
		 
		Nombre = nombre;
	}
	public EstadosModel() {
		super();
	}
	 
	
	
	
	
}