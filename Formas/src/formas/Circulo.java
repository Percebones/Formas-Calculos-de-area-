package formas;

public class Circulo extends Formas {
	Double raio;
	Double pi = 3.14;

	public Circulo(Double raio) {
		super();
		this.raio = raio;
	}

	public int calcularArea() {
		area = (int) (pi * (Math.pow(raio, 2)));
		return area;
	}
}
