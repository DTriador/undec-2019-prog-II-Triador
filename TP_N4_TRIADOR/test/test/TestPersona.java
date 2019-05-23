package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import dominio.Persona;

class TestPersona {

	@Test
	void test01Persona_CostructorYGetters() {
		//Arrange
		String nombre = "Juan";
		String apellido = "Gonzalez";
		String dni = "12345678";
		
		//Act
		Persona p = new Persona (apellido, nombre, dni);
		String actual1 = p.getApellido();
		String actual2 = p.getNombre();
		String actual3 = p.getDni();
		
		
		//Assert
		assertEquals(nombre, actual1);
		assertEquals(apellido, actual2);
		assertEquals(dni, actual3);
	}
	
	@Test
	void test02Persona_CostructorPorDefault() {
		//Arrange
		
		//Act
		Persona p = new Persona();
		String actual1 = p.getApellido();
		String actual2 = p.getNombre();
		String actual3 = p.getDni();
		
		
		//Assert
		assertEquals("", actual1);
		assertEquals("", actual2);
		assertEquals("", actual3);
	}
	
	@Test
	void test03Persona_Setters() {
		//Arrange
		String nombre = "Juan";
		String apellido = "Gonzalez";
		String dni = "12345678";
		Persona p = new Persona ();
		
		
		//Act
		p.setApellido(apellido);
		p.setNombre(nombre);
		p.setDni(dni);
		String actual1 = p.getApellido();
		String actual2 = p.getNombre();
		String actual3 = p.getDni();
		
		//Assert
		assertEquals(apellido, actual1);
		assertEquals(nombre, actual2);
		assertEquals(dni, actual3);
	}
	@Test
	void test04Persona_ApellidoYNombreFormateado() {
		//Arrange
		String nombre = "Juan";
		String apellido = "Gonzalez";
		String dni = "12345678";
		Persona p = new Persona (apellido, nombre, dni);
		String esperado = "Gonzalez, Juan";		
		
		//Act
		String actual1 = p.getApellidoYNombre();
		
		
		//Assert
		assertEquals(esperado, actual1);
	}
	@Test
	void test05Persona_DniConFormato() {
		//Arrange
		String nombre = "Juan";
		String apellido = "Gonzalez";
		String dni = "12345678";
		Persona p = new Persona (apellido, nombre, dni);
		String esperado = "D.N.I.: 12345678";
		
		//Act
		String actual1 = p.getDniConFormato();
		
		//Assert
		assertEquals(esperado, actual1);
	}
	@Test
	void test06Persona_RedefinirElEquals01() {
		Persona p1 = new Persona ("Gonzalez", "Juan", "12345678");
		Persona p2 = new Persona ("Gonzalez", "Juan", "12345678");
		
		//Act
		boolean actual1 = p1 == p2;
		boolean actual2 = p1.equals(p2);
		
		//Assert
		assertEquals(false, actual1);
		assertEquals(true, actual2);
	}
	@Test
	void test07Persona_RedefinirElEqualsFino() {
		Persona p1 = new Persona ("Gonzalez", "Juan", "12345678");
		Persona p2 = new Persona ("Gonzalez", "Juan", "12345678");
		
		//Act
		boolean actual1 = p1 == p2;
		boolean actual2 = p1.equals(p2);
		
		//Assert
		assertEquals(false, actual1);
		assertEquals(true, actual2);
	}
}
