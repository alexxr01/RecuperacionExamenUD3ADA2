package me.alejandro.entidades;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "profesores")
public class Profesor {
	// PROPIEDADES PARA EL PROFESOR
	@Id
	@Column(name = "CPROF")
	private int CPROF;
	private String NOMP;
	private String TURNO;
	
	// RELACIONES
	@OneToMany(mappedBy = "profesor")
	private List<Asignatura> asignaturas;
	
	// CONSTRUCTORES
	public Profesor() {
	}
	public Profesor(int cPROF, String nOMP, String tURNO) {
		super();
		CPROF = cPROF;
		NOMP = nOMP;
		TURNO = tURNO;
	}
	
	// GETTERS Y SETTERS
	public int getCPROF() {
		return CPROF;
	}
	public void setCPROF(int cPROF) {
		CPROF = cPROF;
	}
	public String getNOMP() {
		return NOMP;
	}
	public void setNOMP(String nOMP) {
		NOMP = nOMP;
	}
	public String getTURNO() {
		return TURNO;
	}
	public void setTURNO(String tURNO) {
		TURNO = tURNO;
	}
	public List<Asignatura> getAsignatura() {
		return asignaturas;
	}
	public void setAsignatura(List<Asignatura> asignatura) {
		this.asignaturas = asignatura;
	}
	
	
}
