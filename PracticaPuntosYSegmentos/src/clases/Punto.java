package clases;

/**
 * Clase que implementa funciones sobre Punto
 * 
 * @author Adrián
 */

public class Punto {
	private int x;
	private int y;
	
	/**
	 * Crea un punto con la coordena x e y 0
	 */
	public Punto() {
		this.x = 0;
		this.y = 0;
	}
	
	/**
	 * Crea un punto con la coordena x e y 0 pasadas por parametro
	 * 
	 * @param x
	 * @param y
	 */
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getPuntoX() {
		return this.x;
	}
	
	public int getPuntoY() {
		return this.y;
	}
	
	public void setPuntoX(int nuevaX) {
		this.x = nuevaX; 
	}
	
	public void setPuntoY(int nuevaY) {
		this.y = nuevaY; 
	}
	
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}
	
	


}
