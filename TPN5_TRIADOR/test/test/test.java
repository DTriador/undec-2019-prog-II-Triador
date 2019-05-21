package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Arbitro;
import dominio.Jugador;
import dominio.Persona;

class test {

	@Test
	void test01() {
		Persona p1 = new Persona();
		String nombre = p1.getNombre();
		String apellido = p1.getApellido();
		
		assertEquals("", nombre);
		assertEquals("", apellido);
	}
	@Test
	void test02() {
		Persona p1 = new Persona();
		
		p1.setNombre("Juan");
		p1.setApellido("Gonzalez");
		
		
		String nombre = p1.getNombre();
		String apellido = p1.getApellido();
		
		assertEquals("Juan", nombre);
		assertEquals("Gonzalez", apellido);
	}
	
	@Test
	void test03() {
		
		Persona p1 = new Persona();
		p1.setNombre("Juan");
		p1.setApellido("Gonzalez");
		
		Persona p2 = new Persona();
		p2.setNombre("Juan");
		p2.setApellido("Gonzalez");

		
		assertEquals(false, p1 == p2);
		
	}
	

	@Test
	void test04() {
		
		Persona p1 = new Persona();
		p1.setNombre("Juan");
		p1.setApellido("Gonzalez");
		
		Persona p2 = new Persona();
		p2.setNombre("Juan");
		p2.setApellido("Gonzalez");
		
		assertEquals(true, p1.equals(p2));
	}
	
	@Test
	void test05() {
		
		Persona p1 = new Jugador();
		Jugador p2 = (Jugador) p1; //declaro una variable de tipo jugador y casteo a persona
		p2.setPuesto("Defensor");
	}
	@Test
	void test06() {
		
		Persona p1 = new Arbitro();
		Arbitro p2 = (Arbitro) p1; //declaro una variable de tipo arbitro y casteo a persona
		p2.setApellido("Rojas"); //Controla que cuando pida apellido, devuelva Arbitro Rojas
		assertEquals("Arbitro Rojas", p2.getApellido());
		
	}
}
