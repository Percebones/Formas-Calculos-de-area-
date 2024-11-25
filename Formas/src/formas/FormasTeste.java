package formas;

public class FormasTeste {

	public static void main(String[] args) {

		Circulo a = new Circulo(20.0);// Raio
		Quadrado b = new Quadrado(5);// Altura
		Retangulo c = new Retangulo(5, 8);// Altura e Base
		Triangulo d = new Triangulo(8, 8);// Altura e Base

		System.out.println("Area Circulo: " + a.calcularArea());
		System.out.println("Area Quadrado: " + b.calcularArea());
		System.out.println("Area Retangulo: " + c.calcularArea());
		System.out.println("Area Triangulo: " + d.calcularArea());

	}

}
