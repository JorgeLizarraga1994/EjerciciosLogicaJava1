package resolucion;



/**Teniendo en cuenta la siguiente clase en Java
public class Punto
{
double x;
double y;
}

a) Escribir el constructor Punto() que inicializa las dos coordenadas a 0.
b) Escribir el constructor Punto(double x, double y)
c) Escribir el m´etodo void imprimir() que muestra por consola los valores del punto.
d) Escribir el m´etodo de instancia void desplazar(double desp_x, double desp_y) que desplace el
punto tanto como lo indiquen los par´ametros recibidos.
e) Escribir el m´etodo de clase static double distancia(Punto p1, Punto p2) que devuelve la distancia
entre los dos puntos.*/
public class Punto {
	double x;
	double y;
	
	public Punto() {
		this.x = 0;
		this.y = 0;
	}
	public Punto(double X ,double Y) {
		this.x = X;
		this.y = Y;
	}
	void imprimir() {
		System.out.println("x = " + this.x + "," + "y = " + this.y);
	}
	public void desplazar(double desp_x , double desp_y) {
		this.x = desp_x;
		this.y = desp_y;
	}
	static double distancia(Punto p1 , Punto p2) {
		double nuevoPuntoX = p2.x - p1.x;
		double nuevoPuntoY = p2.y - p1.y;
		double distancia = Math.sqrt((nuevoPuntoX * nuevoPuntoX) + (nuevoPuntoY * nuevoPuntoY));
		return distancia;
	}
}
