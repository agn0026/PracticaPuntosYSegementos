package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import clases.Segmento;
import clases.Punto;

class testDistancia {
	static Punto p1;
	static Punto p2;
	static Punto p3;
	static Punto p4;
	
	@BeforeAll
	static void setup() {
		p1 = new Punto (2, 0);
		p2 = new Punto (2, 2);
		p3 = new Punto (-2, -1);
		p4 = new Punto (-7, -3);
	}
	

	@Test
	void testDistancia() {
		Segmento s1 = new Segmento (p1, p2);
		double distanciaObtenida = s1.distancia(p1, p2);
		double distanciaEsperada = 2;
		assertEquals(distanciaEsperada, distanciaObtenida);
	}

	@Test
	void testDistancia2() {
		Segmento s1 = new Segmento (p3, p4);
		double distanciaObtenida = Math.round(s1.distancia(p3, p4)*100)/100;
		double distanciaEsperada = Math.round(5.38*100)/100;
		assertEquals(distanciaEsperada, distanciaObtenida);
	}
	
	@Test
	void testDistancia3() {
		Segmento s1 = new Segmento (p1, p3);
		double distanciaObtenida = Math.round(s1.distancia(p1, p3)*100)/100;
		double distanciaEsperada = Math.round(4.12*100)/100;
		assertEquals(distanciaEsperada, distanciaObtenida);
	}
	/*
	@Test
	void testException() {
		Segmento s1 = new Segmento (p1, p1);
		Exception exception = assertThrows(IllegalArgumentException.class, () -> s1.distancia(p1, p1));
		String mensajeEsperado = "Los puntos son iguales";
		String mensajeObtenido = exception.getMessage();
		assertEquals(mensajeEsperado, mensajeObtenido);
	}
	*/
	

}
