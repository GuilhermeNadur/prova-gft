package questao_2;

public class Teste {

	public static void main(String[] args) {
		
		Quadrado quadrado = new Quadrado(5);
		System.out.println(quadrado.calcularArea());
		
		Retangulo retangulo = new Retangulo(5, 5);
		System.out.println(retangulo.calcularArea());
		
		Circulo circulo = new Circulo(5);
		System.out.println(circulo.calcularArea());
	}
}
