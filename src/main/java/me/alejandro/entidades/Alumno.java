package me.alejandro.entidades;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "alumnos")
public class Alumno {
	// PROPIEDADES PARA ALUMNO
	@Id
	@Column(name = "NMAT")
	private int NMAT;
	private String NOMA;
	@Temporal(TemporalType.DATE)
	private Date FN;
	private String PROV;
	private String BECA;

	// RELACIONES
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Asignatura> asignaturas;

	// CONSTRUCTORES
	public Alumno() {
	}
	public Alumno(int nMAT, String nOMA, Date fN, String pROV, String bECA, List<Asignatura> asignaturas) {
		super();
		NMAT = nMAT;
		NOMA = nOMA;
		FN = fN;
		PROV = pROV;
		BECA = bECA;
		this.asignaturas = asignaturas;
	}


	// GETTERS Y SETTERS
	public int getNMAT() {
		return NMAT;
	}
	public void setNMAT(int nMAT) {
		NMAT = nMAT;
	}
	public String getNOMA() {
		return NOMA;
	}
	public void setNOMA(String nOMA) {
		NOMA = nOMA;
	}
	public Date getFN() {
		return FN;
	}
	public void setFN(Date fN) {
		FN = fN;
	}
	public String getPROV() {
		return PROV;
	}
	public void setPROV(String pROV) {
		PROV = pROV;
	}
	public String getBECA() {
		return BECA;
	}
	public void setBECA(String bECA) {
		BECA = bECA;
	}
	public List<Asignatura> getAsignaturas() {
		return asignaturas;
	}
	public void setAsignaturas(List<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}

}
