package questao_2;

public class Retangulo implements AreaCalculavel {

	private double largura;
	private double altura;
	
	Retangulo (double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}
	
	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return largura * altura;
	}
}
