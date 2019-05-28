package test;

import static org.junit.jupiter.api.Assertions.*;

import dominio.AnioAcademico;

class Test {

	@org.junit.jupiter.api.Test
	void test01() {
		//Arrange Preparo el codigo
		String expectNombre = "Licenciatura en Enologia";
		String expectAbreviatura = "Lic. Enolog.";
		String expectPlan = "128/02";
		
		//Act    Ejecuta
		Carrera c01 = new Carrera(expectNombre, expectAbreviatura,expectPlan);
		String actualNombre = c01.getNombre();
		String actualAbreviatura= c01.getAbreviatura();
		String actualPlan = c01.getPlan();
		
		//Assert Controla
		assertEquals(expectNombre, actualNombre);
		assertEquals(expectAbreviatura, actualAbreviatura);
		assertEquals(expectPlan, actualPlan);
	}
	void test02() {
		//Arrange Preparo el codigo
		Carrera c01 = new Carrera("Licenciatura en Sistemas", "Lic. Sist.","071/08");
		Carrera c02 = new Carrera("Licenciatura en Sistemas", "Lic. Sist.","070/08");
		Carrera c03 = new Carrera("Ingenieria en Sistemas", "Ing. Sist.","071/08");
		
		//Act    Ejecuta
		
		boolean actual01= c01.equals(c02);
		boolean actual02= c01.equals(c03);
		
		//Assert Controla
		assertEquals(false, actual01);
		assertEquals(true, actual02);
		
	}
	void test03() {
		//Arrange Preparo el codigo
		String expectMateria = "Programacion";
		String expectAbrev = "Prog";
		AnioAcademico nu = AnioAcademico.II;
		
		//Act    Ejecuta
		Materia m01 = new Materia(expectMateria, expectAbrev,nu);
		String actualMateria = c01.getMateria();
		String actualAbrev= c01.getAbrev();
		AnioAcademico actualAnioAcademico = c01.getAnioAcademico();
		
		//Assert Controla
		assertEquals(expectMateria, actualMateria);
		assertEquals(expectAbrev, actualAbrev);
		assertEquals(nu, actualAnioAcademico);
	}
	void test04() {
		//Arrange Preparo el codigo
		Materia c01 = new Materia("Programacion", "Prog.", AnioAcademico.I);
		Materia c02 = new Materia("Sistemas II", "Prog.",AnioAcademico.II);
		Materia c03 = new Materia("Programacion", "Program.", AnioAcademico.III);
		
		//Act    Ejecuta
		
		boolean actual01= c01.equals(c02);
		boolean actual02= c01.equals(c03);
		
		//Assert Controla
		assertEquals(false, actual01);
		assertEquals(true, actual02);
	}
	void test05_AgregarMaterias() {
		//Arrange Preparo el codigo
		Carrera c01 = new Carrera("Licenciatura en Sistemas", "Lic. Sist.","071/08");	
		Materia m01 = new Materia("Programacion II", "Prog.",AnioAcademico.III);
		String listadoMaterias[] = {"Programacion II"};
		
		//Act    Ejecuta
		
		boolean actual01= c01.addMateria(m01);
		String [] actual02= c01.getMateria(AnioAcademico.III);
		
		//Assert Controla
		assertEquals(false, actual01);
		assertEquals(listadoMaterias, actual02);
	}
	void test05_AgregarMaterias() {
		//Arrange Preparo el codigo
		Carrera c01 = new Carrera("Licenciatura en Sistemas", "Lic. Sist.","071/08");	
		Materia m01 = new Materia("Programacion II", "Prog. II",AnioAcademico.III);
		String listadoMaterias[] = {"Programacion II"};
		
		//Act    Ejecuta
		boolean actual01= c01.addMateria(m01);
		boolean actual02= c01.addMateria(m01);
		String [] actual03 = c01.getMateriaS(AnioAcademico.III);
		
		//Assert Controla
		assertEquals(true, actual01);
		assertEquals(false, actual01);
		assertEquals(listadoMaterias, actual02);
	}
	void test05_MateriasDuplicadas() {
		//Arrange Preparo el codigo
		Carrera c01 = new Carrera("Licenciatura en Sistemas", "Lic. Sist.","071/08");	
		Materia m01 = new Materia("Programacion II", "Prog. II",AnioAcademico.II);
		Materia m02 = new Materia("Programacion II", "Prog. II",AnioAcademico.III);
		
		//Act    Ejecuta
		boolean actual01= c01.addMateria(m01);
		boolean actual02= c01.addMateria(m01);
		
		//Assert Controla
		assertEquals(true, actual01);
		assertEquals(false, actual02);
	}
	
	void test05_MaxTresMateriasPorAnio() {
		//Arrange Preparo el codigo
		Carrera c01 = new Carrera("Licenciatura en Sistemas", "Lic. Sist.","071/08");	
		
		Materia m01 = new Materia("Programacion I", "Prog. II",AnioAcademico.II);
		Materia m02 = new Materia("Analisis Matematico II", "A. Mat. II",AnioAcademico.II);
		Materia m03 = new Materia("Programacion I", "Prog. I",AnioAcademico.II);
		Materia m04 = new Materia("Programacion II", "Prog. II",AnioAcademico.III);
		Materia m05 = new Materia("Analisis Matematico II", "A. Mat. I",AnioAcademico.II);
				
		//Act    Ejecuta
		boolean actual01= c01.addMateria(m01);
		boolean actual02= c01.addMateria(m02);
		boolean actual03= c01.addMateria(m03);
		boolean actual04= c01.addMateria(m04);
		boolean actual05= c01.addMateria(m05);
		
				
		//Assert Controla
		assertEquals(true, actual01);
		assertEquals(false, actual01);
		assertEquals(false, actual01);
		assertEquals(false, actual01);
		assertEquals(true, actual01);
		}
	void test06_MateriasPorAnio() {
		//Arrange Preparo el codigo
		Carrera c01 = new Carrera("Licenciatura en Sistemas", "Lic. Sist.","071/08");	
		
		Materia m01 = new Materia("Programacion I", "Prog. II",AnioAcademico.II);
		Materia m02 = new Materia("Analisis Matematico II", "A. Mat. II",AnioAcademico.II);
		Materia m03 = new Materia("Programacion I", "Prog. I",AnioAcademico.II);
		Materia m04 = new Materia("Programacion II", "Prog. II",AnioAcademico.III);
		Materia m05 = new Materia("Analisis Matematico II", "A. Mat. I",AnioAcademico.II);
				
		//Act    Ejecuta
		boolean actual01= c01.addMateria(m01);
		boolean actual02= c01.addMateria(m02);
		boolean actual03= c01.addMateria(m03);
		boolean actual04= c01.addMateria(m04);
		boolean actual05= c01.addMateria(m05);
		
				
		//Assert Controla
		assertEquals(true, actual01);
		assertEquals(true, actual01);
		assertEquals(true, actual01);
		assertEquals(false, actual01);
		assertEquals(true, actual01);
		}
	
	
	void test07_ListadoMaterias() {
		//Arrange Preparo el codigo
		Materia m01 = new Materia("Programacion II", "Prog.",AnioAcademico.III);
		String anioCalendario = "2019";
		String fechaInicio = "01/01";
		String fechaFin = "12/12";
		Alumnos listadoAlumnos[] = null;
		
		Implementacion imp01 = new Implementacion(m01, anioCalendario, fechaInicio, fechaFin);
		
		//Act    Ejecuta
		
		boolean actual01= imp01.getMateria();
		String actual02 = imp01.getAnioCalendario();
		String actual03 = imp01.getFechaInicio();
		String actual04 = imp01.getFechaFin();
		Alumnos[] actual05 = imp01.getListadoAlumnos().length();
		
		//Assert Controla
		assertEquals(m01, actual01);
		assertEquals(m01, actual02);
		assertEquals(m01, actual03);
		assertEquals(m01, actual04);
		assertArrayEquals(listadoAlumnos, actual05);
	}
	void test08_AgregarAlumnos() {
		//Arrange Preparo el codigo
		Carrera c01 = new Carrera("Licenciatura en Sistemas", "Lic. Sist.","071/08");	
		Alumno m01 = new Alumno("Nombre","Apellido","dni", "Matrícula","Carrera");
		String listadoAlumnos[] = "Ingenieria en Sistemas";
		
		//Act    Ejecuta
		
		boolean actual01= c01.addAlumno(m01);
		String [] actual02= c01.getAlumno();
		
		//Assert Controla
		assertEquals(false, actual01);
		assertEquals(listadoAlumnos, actual02);
	}
	void test08_AlumnosDuplicados() {
		//Arrange Preparo el codigo
		Carrera c01 = new Carrera("Licenciatura en Sistemas", "Lic. Sist.","071/08");	
		Alumno m01 = new Alumno("Daniela","Triador","36965115", "19063","Ingenieria en Sistemas");
		Alumno m02 = new Alumno("Daniela","Triador","36965115", "19063","Ingenieria en Sistemas");
		Alumno m02 = new Alumno("Daniela","Triador","36965115", "19594","Licenciatura en Sistemas");
		
		//Act    Ejecuta
		boolean actual01= c01.addMateria(m01);
		boolean actual02= c01.addMateria(m01);
		boolean actual03= c01.addMateria(m01);
		
		//Assert Controla
		assertEquals(true, actual01);
		assertEquals(true, actual01);
		assertEquals(false, actual02);
	}
	void test08_AlumnosDeLaCarrera() {
		//Arrange Preparo el codigo
		Carrera c01 = new Carrera("Licenciatura en Sistemas", "Lic. Sist.","071/08");	
		Alumno m01 = new Alumno("Daniela","Triador","36965115", "19063","Ingenieria en Sistemas");
		Alumno m02 = new Alumno("Daniela","Triador","36965115", "19063","Ingenieria en Sistemas");
		Alumno m02 = new Alumno("Daniela","Triador","36965115", "19594","Licenciatura en Sistemas");
		
		//Act    Ejecuta
		boolean actual01= c01.addMateria(m01);
		boolean actual02= c01.addMateria(m01);
		boolean actual03= c01.addMateria(m01);
		
		//Assert Controla
		assertEquals(true, actual01);
		assertEquals(true, actual01);
		assertEquals(false, actual02);
	}
}
