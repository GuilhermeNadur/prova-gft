package questao_3;

public class Divisao extends Operacao {

	@Override
	public double efetuarOperacao(double x, double y) {
		
		if (x == 0 || y == 0) {
			System.out.println("Opera��o n�o ser� poss�vel!");
			return 0;
		}
		
		return x / y;
	}
}