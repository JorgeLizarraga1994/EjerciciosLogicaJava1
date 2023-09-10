package resolucion;

public class Main {

	public static void main(String[] args) {
		/**Fraccion q1 = new Fraccion(10,5);
		Fraccion q2 = new Fraccion(5,3);
		
		Fraccion resultado = Fraccion.suma(q1, q2);
		
		System.out.println("la suma de la fracción es " + resultado.numerador + "/" + resultado.denominador);*/
		
		
		/**Punto p1 = new Punto(5,5);
		Punto p2 = new Punto(10,10);
		double distanciaDef = Punto.distancia(p1, p2);
		System.out.println("la distancia entre los puntos es: " + distanciaDef);*/
		Dibujador dib = new Dibujador();
		Circulo circ1 = new Circulo(200, 100, 120); // Ver constructor m´as abajo
		Circulo circ2 = new Circulo(500, 300, 120); // Ver constructor m´as abajo
		
		dib.dibujar(circ1);
		dib.dibujar(circ2);
		
		System.out.println(Circulo.distancia(circ1, circ2));
		System.out.println(Circulo.seTocan(circ1, circ2));
		
	}

}