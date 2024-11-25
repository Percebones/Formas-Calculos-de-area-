package formas;

public class Triangulo extends Formas {

	public Triangulo(int altura, int base) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public int calcularArea() {
		area = (altura * base) / 2;
		return area;
	}
}
