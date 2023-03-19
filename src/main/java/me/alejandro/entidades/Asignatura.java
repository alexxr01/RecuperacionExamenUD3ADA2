package me.alejandro.entidades;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "asignaturas")
public class Asignatura {
	// PROPIEDADES PARA ASIGNATURA
	@Id
	@Column(name = "CASIG")
	private int CASIG;
	private String DASIG;
	private String CUR;

	// RELACIONES
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Alumno> alumno;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_profesor")
	private Profesor profesor;

	// CONSTRUCTORES
	public Asignatura() {
	}

	public Asignatura(int cASIG, String dASIG, String cUR, List<Alumno> alumno, Profesor profesor) {
		super();
		CASIG = cASIG;
		DASIG = dASIG;
		CUR = cUR;
		this.alumno = alumno;
		this.profesor = profesor;
	}


	// GETTERS Y SETTERS
	public int getCASIG() {
		return CASIG;
	}
	public void setCASIG(int cASIG) {
		CASIG = cASIG;
	}
	public String getDASIG() {
		return DASIG;
	}
	public void setDASIG(String dASIG) {
		DASIG = dASIG;
	}
	public String getCUR() {
		return CUR;
	}
	public void setCUR(String cUR) {
		CUR = cUR;
	}
	public Profesor getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	public List<Alumno> getAlumno() {
		return alumno;
	}
	public void setAlumno(List<Alumno> alumno) {
		this.alumno = alumno;
	}

}
