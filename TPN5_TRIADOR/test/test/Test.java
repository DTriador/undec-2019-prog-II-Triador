package test;

import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void test01() {
		//Arrange Preparo el codigo
		String expectNombre = "Licenciatura en Enologia";
		String expectAbreviatura = "Lic. Enolog";
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

}
