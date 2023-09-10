package resolucion;



/**Teniendo en cuenta la siguiente clase en Java
public class Fraccion
{
int numerador;
int denominador;
}
a) Escribir el constructor Fraccion(int numerador, int denominador)
b) Escribir el m´etodo de instancia void imprimir() que imprime en pantalla la fracci´on en alg´un
formato c´omodo. Crear en un main una Fraccion e imprimirla con este m´etodo.
c) Escribir el metodo de instancia void invertirSigno() que invierte el signo del n´umero: si era
negativo pasa a ser positivo y viceversa.
d) Escribir el m´etodo de instancia void invertir() que invierte el numerador y el denominador de
la fracci´on. Ej. invertir(1/2) = 2/1.
e) Escribir el m´etodo de instancia double aDouble() que convierte el n´umero racional en un double
(n´umero de punto flotante) y devuelve el resultado.
f) Escribir el m´etodo de instancia void reducir() que reduce el n´umero racional a sus t´erminos m´as
chicos. Para esto buscar el MCD del numerador y el denominador y luego dividir numerador y
denominador por su MCD. Usar la funci´on ya programada de la pr´actica anterior.
g) Escribir el m´etodo de clase static Fraccion producto(Fraccion q1, Fraccion q2) que calcula el
producto entre dos fracciones en nuevo objeto Fraccion. Este debe estar reducido a su m´ınima ´
expresi´on, de modo que el numerador y el denominador no tengan un divisor com´un mayor a 1.
¿Por qu´e en este caso hace falta la palabra clave static?
h) Escribir el m´etodo de clase static Fraccion suma(Fraccion q1, Fraccion q2) que calcula la suma
de dos fracciones en un nuevo objeto Fraccion. Este debe debe estar reducido a su m´ınima ´
expresi´on.*/

//-----------------------------------------------------------------------------------------------------------------------------------
public class Fraccion {
	int numerador;
	int denominador;
	
	public Fraccion(int numerador, int denominador) {
		this.numerador  = numerador;
		this.denominador = denominador;
	}
	
	public void Imprimir(int numerador , int denominador){
		System.out.println(this.numerador + "/" + this.denominador);
	}
	public void InvertirSigno(){
		int signo = -1;
		this.numerador = this.numerador * signo;
		this.denominador = this.denominador * signo;
	}
	public void Invertir() {
		int aux = 0;
		aux = this.numerador;
		this.numerador = this.denominador;
		this.denominador = aux;
	}
	public double Adouble() {
		double a;
		double b;
		
		a = this.numerador;
		b = this.denominador;
			
		double resultado = a/b;
		
		return resultado;
	}
	public static int Mcd(int  num1 , int num2) {
		int a = Math.max(num1 , num2);
		int b = Math.min(num1, num2);
		
		int resultado = 0;
		do {
			resultado = b;
			b = a % b;
			a = resultado;
		} while(b != 0);
		return resultado;
	}
	
	public void reducir() {
		int mcd= Mcd(this.numerador, this.denominador);
		this.numerador = this.numerador / mcd;
		this.denominador = this.denominador / mcd;
	}
	
	static Fraccion producto(Fraccion q1, Fraccion q2) {
		int nuevoNumerador = q1.numerador * q2.numerador;
		int nuevoDenominador = q1.denominador * q2.denominador;
		
		int mcd = Mcd(nuevoNumerador , nuevoDenominador);
		
		nuevoNumerador /= mcd;
		nuevoDenominador /= mcd;
		
		Fraccion resultado = new Fraccion(nuevoNumerador, nuevoDenominador);
		return resultado;
	}
	static Fraccion suma(Fraccion q1, Fraccion q2) {
		int nuevoNumerador = (q2.denominador * q1.numerador) + (q1.denominador * q2.numerador);
		int nuevoDenominador = q1.denominador * q2.denominador;
		
		int mcd = Mcd(nuevoNumerador , nuevoDenominador);
		
		nuevoNumerador /= mcd;
		nuevoDenominador /= mcd;
		
		Fraccion resultado = new Fraccion(nuevoNumerador, nuevoDenominador);
		return resultado;
	}
}

















