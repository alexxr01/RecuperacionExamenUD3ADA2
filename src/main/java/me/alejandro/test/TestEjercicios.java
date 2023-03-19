package me.alejandro.test;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import me.alejandro.entidades.Alumno;
import me.alejandro.entidades.Asignatura;
import me.alejandro.entidades.Profesor;

public class TestEjercicios {
	public static void main(String[] args) {
		apartadoA();
	}

	public static void apartadoA() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("miBD");
		EntityManager em = emf.createEntityManager();


		// Lista de profesores
		Profesor profesor1 = new Profesor(1, "Celso Espada Ferrando", "Mañana");
		Profesor profesor2 = new Profesor(2, "Valeria Peiró Marquez", "Mañana");
		Profesor profesor3 = new Profesor(3, "Primitivo Pizarro Luján", "Tarde");
		Profesor profesor4 = new Profesor(4, "Nazario Anaya Aznar", "Mañana");
		Profesor profesor5 = new Profesor(5, "Vilma Hervia Yáñez", "Tarde");
		Profesor profesor6 = new Profesor(6, "Gertrudis Baeza Borrego", "Tarde");
		// Lista de asignaturas
		Asignatura asignatura1 = new Asignatura(1, "Sistems Informáticos", "Primero", null, profesor1);
		Asignatura asignatura2 = new Asignatura(2, "Bases de Datos", "Primero", null, profesor3);
		Asignatura asignatura3 = new Asignatura(3, "Programación", "Primero", null, profesor3);
		Asignatura asignatura4 = new Asignatura(4, "Lenguajes de Marcas", "Primero", null, profesor2);
		Asignatura asignatura5 = new Asignatura(5, "Entornos de Desarrollo", "Primero", null, profesor1);
		Asignatura asignatura6 = new Asignatura(6, "Formación y Orientación Laboral", "Primero", null, profesor6);
		Asignatura asignatura7 = new Asignatura(7, "Sistemas de gestión empresarial", "Segundo", null, profesor4);
		Asignatura asignatura8 = new Asignatura(8, "Programación de servicios y procesos", "Segundo", null, profesor2);
		Asignatura asignatura9 = new Asignatura(9, "Acceso a datos", "Segundo", null, profesor5);
		Asignatura asignatura10 = new Asignatura(10, "Desarrollo de Interfaces", "Segundo", null, profesor5);
		Asignatura asignatura11 = new Asignatura(11, "Programación Multimedia y dispositivos móviles", "Segundo", null, profesor4);
		Asignatura asignatura12 = new Asignatura(12, "Empresa e iniciativa emprendedora", "Segundo", null, profesor6);
		// Alumnos disponibles
		List<Asignatura> asignaturasAlumno1 = new ArrayList<Asignatura>();
		asignaturasAlumno1.add(asignatura7);
		asignaturasAlumno1.add(asignatura8);
		asignaturasAlumno1.add(asignatura9);
		asignaturasAlumno1.add(asignatura10);
		asignaturasAlumno1.add(asignatura11);
		asignaturasAlumno1.add(asignatura12);
		Alumno alumno1 = new Alumno(1, "Silvio Núñez Silvestre", null, "Cádiz", "N", asignaturasAlumno1);
		List<Asignatura> asignaturasAlumno2 = new ArrayList<Asignatura>();
		asignaturasAlumno2.add(asignatura7);
		asignaturasAlumno2.add(asignatura8);
		asignaturasAlumno2.add(asignatura9);
		asignaturasAlumno2.add(asignatura10);
		asignaturasAlumno2.add(asignatura11);
		asignaturasAlumno2.add(asignatura12);
		Alumno alumno2 = new Alumno(2, "Alexandra del Rosell", null, "Sevilla", "N", asignaturasAlumno2);
		List<Asignatura> asignaturasAlumno3 = new ArrayList<Asignatura>();
		asignaturasAlumno3.add(asignatura7);
		asignaturasAlumno3.add(asignatura8);
		asignaturasAlumno3.add(asignatura9);
		asignaturasAlumno3.add(asignatura10);
		asignaturasAlumno3.add(asignatura11);
		asignaturasAlumno3.add(asignatura12);
		asignaturasAlumno3.add(asignatura2);
		Alumno alumno3 = new Alumno(3, "María Pilar Robledo", null, "Cádiz", "S", null);
		List<Asignatura> asignaturasAlumno4 = new ArrayList<Asignatura>();
		asignaturasAlumno4.add(asignatura2);
		asignaturasAlumno4.add(asignatura3);
		asignaturasAlumno4.add(asignatura8);
		asignaturasAlumno4.add(asignatura9);
		asignaturasAlumno4.add(asignatura10);
		Alumno alumno4 = new Alumno(4, "Severino Egea Tenorio", null, "Málaga", "S", asignaturasAlumno4);
		List<Asignatura> asignaturasAlumno5 = new ArrayList<Asignatura>();
		asignaturasAlumno5.add(asignatura1);
		asignaturasAlumno5.add(asignatura2);
		asignaturasAlumno5.add(asignatura3);
		asignaturasAlumno5.add(asignatura10);
		asignaturasAlumno5.add(asignatura11);
		Alumno alumno5 = new Alumno(5, "Rosa Serra Bárcena", null, "Cádiz", "N", asignaturasAlumno5);
		List<Asignatura> asignaturasAlumno6 = new ArrayList<Asignatura>();
		asignaturasAlumno6.add(asignatura3);
		asignaturasAlumno6.add(asignatura7);
		asignaturasAlumno6.add(asignatura8);
		asignaturasAlumno6.add(asignatura9);
		asignaturasAlumno6.add(asignatura12);
		Alumno alumno6 = new Alumno(6, "Ernesto Sedano Alonso", null, "Córdoba", "N", asignaturasAlumno6);
		List<Asignatura> asignaturasPrimero = new ArrayList<Asignatura>();
		asignaturasPrimero.add(asignatura1);
		asignaturasPrimero.add(asignatura2);
		asignaturasPrimero.add(asignatura3);
		asignaturasPrimero.add(asignatura4);
		asignaturasPrimero.add(asignatura5);
		asignaturasPrimero.add(asignatura6);
		Alumno alumno7 = new Alumno(7, "Encarnación Nebot Heredia", null, "Granada", "S", asignaturasPrimero);
		Alumno alumno8 = new Alumno(8, "Fernando Riera Perera", null, "Granada", "N", asignaturasPrimero);

		em.getTransaction().begin();
		//em.persist(investigador);
		em.persist(alumno1);
		em.persist(alumno2);
		em.persist(alumno3);
		em.persist(alumno4);
		em.persist(alumno5);
		em.persist(alumno6);
		em.persist(alumno7);
		em.persist(alumno8);
		em.getTransaction().commit();

	}

	public static void apartadoB() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("miBD");
		EntityManager em = emf.createEntityManager();

		// SQL: SELECT NOMA FROM alumnos alum, alumnos_asignaturas a_a, asignaturas asig WHERE alum.NMAT = a_a.Alumno_NMAT AND asig.CASIG = a_a.asignaturas_CASIG AND asig.DASIG = "Bases de Datos";
		String consulta = "SELECT alum,asig FROM Alumno alum, Asignatura asig WHERE asig.alumno=alum AND asig.DASIG = 'Bases de Datos'";
		Alumno resultado = (Alumno) em.createQuery(consulta).getSingleResult();

		System.out.println(resultado);

		em.close();

	}

	public static void apartadoC() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("miBD");

		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Profesor profesor = em.find(Profesor.class, 1);

		profesor.setNOMP("profesor 4");

		em.getTransaction().commit();
	}

}