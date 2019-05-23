package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDivisibilidad {

	@Test
	void test01DivisiblePorDos_NoValido() {
		//Arrange
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorDos(3);
		boolean actual02 = Divisibilidad.esDivisiblePorDos(5);
		boolean actual03 = Divisibilidad.esDivisiblePorDos(7);
		boolean actual04 = Divisibilidad.esDivisiblePorDos(9);
		boolean actual05 = Divisibilidad.esDivisiblePorDos(11);
		boolean actual06 = Divisibilidad.esDivisiblePorDos(457);
		boolean actual07 = Divisibilidad.esDivisiblePorDos(895);
		boolean actual08 = Divisibilidad.esDivisiblePorDos(983);
		boolean actual09 = Divisibilidad.esDivisiblePorDos(1297);
		
		//Assert
		assertEquals(false, actual01);
		assertEquals(false, actual02);
		assertEquals(false, actual03);
		assertEquals(false, actual04);
		assertEquals(false, actual05);
		assertEquals(false, actual06);
		assertEquals(false, actual07);
		assertEquals(false, actual08);
		assertEquals(false, actual09);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	void test02DivisiblePorDos_Valido() {
		//Arrange
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorDos(4);
		boolean actual02 = Divisibilidad.esDivisiblePorDos(6);
		boolean actual03 = Divisibilidad.esDivisiblePorDos(8);
		boolean actual04 = Divisibilidad.esDivisiblePorDos(10);
		boolean actual05 = Divisibilidad.esDivisiblePorDos(12);
		boolean actual06 = Divisibilidad.esDivisiblePorDos(456);
		boolean actual07 = Divisibilidad.esDivisiblePorDos(898);
		boolean actual08 = Divisibilidad.esDivisiblePorDos(984);
		boolean actual09 = Divisibilidad.esDivisiblePorDos(1292);
		
		//Assert
		assertEquals(true, actual01);
		assertEquals(true, actual02);
		assertEquals(true, actual03);
		assertEquals(true, actual04);
		assertEquals(true, actual05);
		assertEquals(true, actual06);
		assertEquals(true, actual07);
		assertEquals(true, actual08);
		assertEquals(true, actual09);
	}
	@Test
	void test01DivisiblePorTres_NoValido() {
		//Arrange
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorTres(3);
		boolean actual02 = Divisibilidad.esDivisiblePorTres(5);
		boolean actual03 = Divisibilidad.esDivisiblePorTres(7);
		boolean actual04 = Divisibilidad.esDivisiblePorTres(9);
		boolean actual05 = Divisibilidad.esDivisiblePorTres(11);
		boolean actual06 = Divisibilidad.esDivisiblePorTres(457);
		boolean actual07 = Divisibilidad.esDivisiblePorTres(895);
		boolean actual08 = Divisibilidad.esDivisiblePorTres(983);
		boolean actual09 = Divisibilidad.esDivisiblePorTres(1297);
		
		//Assert
		assertEquals(false, actual01);
		assertEquals(false, actual02);
		assertEquals(false, actual03);
		assertEquals(false, actual04);
		assertEquals(false, actual05);
		assertEquals(false, actual06);
		assertEquals(false, actual07);
		assertEquals(false, actual08);
		assertEquals(false, actual09);
	}
}
