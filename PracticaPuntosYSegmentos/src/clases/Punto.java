package clases;

public class Punto {
	private int x;
	private int y;
	
	public Punto() {
		this.x = 0;
		this.y = 0;
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
