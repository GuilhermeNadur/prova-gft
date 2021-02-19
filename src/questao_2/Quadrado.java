package questao_2;

public class Quadrado implements AreaCalculavel {

	private double lado;
	
	Quadrado (double lado) {
		this.lado = lado;
	}
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return lado * lado;
	}
}
