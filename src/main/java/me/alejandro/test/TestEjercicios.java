package me.alejandro.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import me.alejandro.entidades.Alumno;
import me.alejandro.entidades.Asignatura;
import me.alejandro.entidades.Profesor;

public class TestEjercicios {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("miBD");
	private static EntityManager em = emf.createEntityManager();
	
	public static void main(String[] args) {
//		apartadoB();
		apartadoC();
	}

	public static void apartadoB() {
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

	public static void apartadoC() {
		em.getTransaction().begin();
		
		/*
		 * 1
		 */
		Alumno alumno7 = em.find(Alumno.class, 7);
		List<Asignatura> asignaturasMatriculadas = alumno7.getAsignaturas();

		System.out.println("Asignaturas en las que está matriculado el 7:");
		for (Asignatura asignatura : asignaturasMatriculadas) {
		    System.out.println(asignatura.getDASIG());
		}
		
		/*
		 * 2
		 */
		Alumno resultado = (Alumno) em.createQuery("SELECT a FROM Alumno a JOIN a.asignaturas asig WHERE asig.nombre = 'Acceso a Datos'")
				.getSingleResult();
		System.out.println(resultado);
		
		/*
		 * 3
		 */
		List<Profesor> profesores = em.createQuery("SELECT p FROM Profesor p", Profesor.class).getResultList();

	    for (Profesor profesor : profesores) {
	        System.out.println("El profesor " + profesor.getNOMP() + " imparte las siguientes asignaturas:");
	        for (Asignatura asignatura : profesor.getAsignatura()) {
	            System.out.println("- " + asignatura.getDASIG());
	        }
	    }
	    
	    em.close();

	}
	
	public static void apartadoD(String nombreAlumno) {
		/*
		 * 1
		 */
		String consulta = "SELECT a.noma FROM Alumno a JOIN a.matriculas m JOIN m.asignatura asi WHERE asi.dasig = 'bases de datos'";

		List<String> nombres = em.createQuery(consulta, String.class).getResultList();

		for (String nombre : nombres) {
		    System.out.println(nombre);
		}

		/*
		 * 2
		 */
		// Encontrar el alumno con el nombre dado
	    Alumno alumno = em
	            .createQuery("SELECT a FROM Alumno a WHERE a.nombre = :nombre", Alumno.class)
	            .setParameter("nombre", nombreAlumno)
	            .getSingleResult();

	    // Obtener la lista de asignaturas en las que está matriculado el alumno
	    List<Asignatura> asignaturas = alumno.getAsignaturas();

	    // Imprimir la lista de asignaturas
	    System.out.println("Asignaturas en las que está matriculado " + nombreAlumno + ":");
	    for (Asignatura asignatura : asignaturas) {
	        System.out.println(asignatura.getDASIG() + " - " + asignatura.getCUR());
	    }
	    
	    /*
	     * 3
	     */
	    
	    /*
	     * 4
	     */
	    // Obtener el alumno "Fernando Riera Perera"
	    Alumno alumnoBuscar = em.createQuery("SELECT a FROM Alumno a WHERE a.nombre = 'Fernando Riera Perera'", Alumno.class).getSingleResult();

	    // Obtener las asignaturas del alumno
	    List<Asignatura> asignaturasAlumno = alumnoBuscar.getAsignaturas();

	    // Obtener los profesores que imparten cada una de las asignaturas
	    Set<Profesor> profesores = new HashSet<>();
	    for (Asignatura asignatura : asignaturasAlumno) {
	        profesores.add(asignatura.getProfesor());
	    }

	    // Mostrar la lista de profesores
	    System.out.println("Los profesores que dan clase al alumno Fernando Riera Perera son:");
	    for (Profesor profesor : profesores) {
	        System.out.println("- " + profesor.getNOMP());
	    }

	}
	
	public static void apartadoE() {
		/*
		 * 1
		 */
		em.getTransaction().begin();
		Alumno alumno5 = em.find(Alumno.class, 5); // Buscamos el alumno 5 en la BD
		Asignatura asignatura12 = em.find(Asignatura.class, 12); // Buscamos la asignatura 12 en la BD

		alumno5.setAsignaturas((List<Asignatura>) asignatura12); // Agregamos la asignatura 12 al alumno 5

		em.persist(alumno5); // Actualizamos los cambios en la BD
		em.getTransaction().commit();
		
		/*
		 * 2
		 */
		em.getTransaction().begin();
		Profesor profesorCambiarNombre = em.find(Profesor.class, 4L);
		profesorCambiarNombre.setNOMP("NUEVO NOMBRE PROFESOR FECHERITO");
		em.getTransaction().commit();
		
		/*
		 * 3
		 */
		// Crear la nueva asignatura
		Asignatura nuevaAsignatura = new Asignatura();
		nuevaAsignatura.setDASIG("Nueva asignatura");
		nuevaAsignatura.setCUR(String.valueOf(2));

		// Crear el nuevo profesor
		Profesor nuevoProfesor = new Profesor();
		nuevoProfesor.setNOMP("Nuevo profesor");
		nuevoProfesor.setCPROF(23);

		// Asociar la nueva asignatura con el nuevo profesor
		nuevoProfesor.setAsignatura((List<Asignatura>) nuevaAsignatura);

		// Asociar el alumno 5 con la nueva asignatura
		Alumno cambiarAlumno5 = em.find(Alumno.class, 5);
		cambiarAlumno5.setAsignaturas((List<Asignatura>) nuevaAsignatura);

		// Guardar los cambios en la base de datos
		em.getTransaction().begin();
		em.persist(nuevaAsignatura);
		em.persist(nuevoProfesor);
		em.getTransaction().commit();
		
		/*
		 * 4
		 */
		// Obtener el profesor 6
		Profesor profesor6 = em.find(Profesor.class, 6);

		// Crear el nuevo profesor
		Profesor nuevoProfesor4 = new Profesor();
		nuevoProfesor4.setNOMP("Juan Pérez");

		// Obtener las asignaturas en las que imparte el profesor 6
		List<Asignatura> asignaturas = em.createQuery("SELECT a FROM Asignatura a WHERE a.profesor = :profesor", Asignatura.class)
		        .setParameter("profesor", profesor6)
		        .getResultList();

		// Actualizar el profesor en cada asignatura
		for (Asignatura asignatura : asignaturas) {
		    asignatura.setProfesor(nuevoProfesor4);
		}

		// Persistir los cambios en la base de datos
		em.getTransaction().begin();
		em.persist(nuevoProfesor4);
		em.getTransaction().commit();
	}

}