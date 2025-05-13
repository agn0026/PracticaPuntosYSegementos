package app;
import clases.Punto;
import clases.Segmento;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Punto p1 = new Punto (aleatotiox(), aleatotiox());
		Punto p2 = new Punto (aleatotiox(), aleatotiox());
		Punto p3 = new Punto (aleatotiox(), aleatotiox());
		Punto p4 = new Punto (aleatotiox(), aleatotiox());
		
		Segmento s1 = new Segmento (p1, p2);
		Segmento s2 = new Segmento (p3, p4);
		
		double d1 = s1.distancia(p1, p2);
		double d2 = s2.distancia(p3, p4);

	}
	
	public static int aleatotiox() {
		int aleatorio = 1 + (int)(Math.random()*(10-0+1));
		return aleatorio; 
	}
	

}
