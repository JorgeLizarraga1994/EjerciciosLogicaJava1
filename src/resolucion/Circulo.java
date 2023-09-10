package resolucion;


/**La siguiente clase en Java describe a un circulo en un plano (representado mediante su radio y
las coordenadas de su centro):
public class Circulo
{
double radio;
Punto centro;
}

a) Escribir el constructor Circulo(double centro_x, double centro_y, double radio).
b) Escribir el metodo void imprimir() que muestra por consola los valores del c´ırculo.
c) Escribir los metodos de instancia double perimetro() y double superficie() que devuelven el
per´ımetro y la superficie del c´ırculo, respectivamente.
d) Escribir el metodo de instancia void escalar(double factor) que modifique el radio del c´ırculo
en un factor de escala pasado como par´ametro.
e) Escribir el metodo de instancia void desplazar(double desp_x, double desp_y) que desplace el
centro del circulo tanto como lo indiquen los par´ametros recibidos.
f) Escribir el metodo de clase static double distancia(Circulo c1, Circulo c2) que calcula y devuelve la distancia
 entre los puntos m´as cercanos de los c´ırculos. Por ejemplo, un c´ırculo con centro
(0, 0) y radio 1 tiene distancia 1 de otro de centro (3, 0) y radio 1. Observaci´on: notar que la
distancia no puede ser un valor negativo, es decir, si los c´ırculos se solapan, entonces la distancia
entre ellos es cero.
g) Escribir el metodo de clase static boolean seTocan(Circulo c1, Circulo c2) que devuelva verdadero si 
las ´areas de los circulos pasados como parametro se solapan y falso si no.*/

public class Circulo {
	double radio;
	Punto centro;
	double pi = 3.1416;
	
	
	public Circulo(double Centro_X, double Centro_Y, double Radio) {
		centro = new Punto(Centro_X, Centro_Y);
		radio = Radio;
	}
	public void imprimir() {
		System.out.println("x = " + centro.x + "y = " + centro.y + "radio = " + radio);
	}
	public double perimetro() {
		double per = (2*pi) * radio;
		return per;
	}
	public double superficie() {
		double sup = ((pi * radio) + (pi * radio));
		return sup;
	}
	public void escalar(double factor) {
		radio = radio * factor;
	}
	public void desplazar(double desp_x, double desp_y) {
		centro.x = desp_x;
		centro.y = desp_y;
	}
    public static double distancia(Circulo c1, Circulo c2) {
        double distanciaCentros = Punto.distancia(c1.centro, c2.centro);
        double sumaRadios = c1.radio + c2.radio;

        if (distanciaCentros > sumaRadios) {
            return distanciaCentros - sumaRadios;
        } else {
            return 0.0; // Los círculos se solapan, la distancia es cero
        }
    }
    
    public static boolean seTocan(Circulo c1, Circulo c2) {
    	if (distancia(c1, c2) == 0) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
}
