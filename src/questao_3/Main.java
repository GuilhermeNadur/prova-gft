package questao_3;

public class Main {

	public static void main(String[] args) {
		
		Soma soma = new Soma();
		System.out.println("Soma: " + soma.efetuarOperacao(5, 2));
		
		Subtracao subtracao = new Subtracao();
		System.out.println("Subtração: " + subtracao.efetuarOperacao(15, 3));
		
		Multiplicacao multiplicacao = new Multiplicacao();
		System.out.println("Multiplição: " + multiplicacao.efetuarOperacao(10, 5));
		
		Divisao divisao = new Divisao();
		System.out.println("Divisão: " + divisao.efetuarOperacao(10, 2));
		System.out.println("Divisão: " + divisao.efetuarOperacao(5, 0));
	}
}