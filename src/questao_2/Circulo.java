package questao_2;

public class Circulo implements AreaCalculavel {

	private final double PI = 3.14;
	private double raio;
	
	Circulo (double raio) {
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return PI * Math.pow(raio, 2);
	}
}
