package formas;

public class Quadrado extends Formas {

	public Quadrado(int altura) {
		super();
		this.altura = altura;
	}

	public int calcularArea() {
		area = (int) Math.pow(altura, 2);
		return area;
	}
}
