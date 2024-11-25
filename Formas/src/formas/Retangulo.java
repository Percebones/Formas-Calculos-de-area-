package formas;

public class Retangulo extends Formas {

	public Retangulo(int altura, int base) {
		super();
		this.altura = altura;
		this.base = base;
	}

	public int calcularArea() {
		area = altura * base;
		return area;
	}
}
