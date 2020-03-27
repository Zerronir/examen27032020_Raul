package ejercicio_examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EjercicioJunitTest {

	@Test
	void testSumar() {
		System.out.println("Comienzan los tests");
		int a = 100;
		int b = 80;
		
		int resultado = a + b;
		System.out.println("Finalizan los tests");
		
	}

	@Test
	void testRestar() {
		System.out.println("Comienzan los tests");
		int a = 100;
		int b = 80;
		int resultado = a - b;
		System.out.println("Finalizan los tests");
	}

	@Test
	void testDividir() {
		System.out.println("Comienzan los tests");
		int a = 100;
		int b = 80;
		int resultado = a / b;
		System.out.println("Finalizan los tests");
	}

	@Test
	void testMultiplicar() {
		System.out.println("Comienzan los tests");
		int a = 100;
		int b = 80;
		int resultado = a * b;
		System.out.println("Finalizan los tests");
	}

}
