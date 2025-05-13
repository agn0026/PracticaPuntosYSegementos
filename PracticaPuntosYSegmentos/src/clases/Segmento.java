package clases;

/**
 * Clase que implementa funciones sobre Segmento
 * 
 * @author Adrián
 */

public class Segmento {
	private Punto a;
	private Punto b;
	
	/**
	 * Crea un segmento entre los puntos (0,0) y (1,1)
	 */
	public Segmento() {
		this.a = new Punto (0,0);
		this.b = new Punto (1,1);
	}

	
	/**
	 * Crea un segmento entre los puntos pasados por parametros
	 * @param a
	 * @param b
	 */
	public Segmento(Punto a, Punto b) throws IllegalArgumentException{
		if ((a.getPuntoX()==b.getPuntoX()) && (a.getPuntoY()==b.getPuntoY())) {
			throw new IllegalArgumentException ("Los puntos son iguales");
		}else {
			this.a = a;
			this.b = b;
		}
	}
	
	public Punto getPuntoA() {
		return this.a;
	}
	
	public Punto getPuntoB() {
		return this.b;
	}
	
	public void setPuntoA(Punto nuevaA) {
		this.a = nuevaA; 
	}
	
	public void setPuntoB(Punto nuevaB) {
		this.b = nuevaB; 
	}
	
	public String toString() {
		return "[" + this.a + "," + this.b + "]";
	}
	
	/**
	 * Calcula la distancia entre ambos puntos 
	 * @param a 
	 * @param b
	 * @return devuelve la distancia en decimales entre ambos puntos
	 */
	public static double distancia (Punto a, Punto b) {
		double distanciaTotal = Math.sqrt((Math.pow(b.getPuntoX()-a.getPuntoX(), 2))+(Math.pow(b.getPuntoY()-a.getPuntoY(), 2)));
		return distanciaTotal;
	}

}
