package questao_1;

import java.util.Scanner;

public class Questao_1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		int inicioIntervalo = 0;
		int finalIntervalo = 0;
		int produto = 0;
		
		System.out.print("Multiplicando: ");
		numero = entrada.nextInt();
		
		while (numero < 0 || numero > 3000) {
			System.out.print("O n�mero n�o pode ser negativo e nem maior que 3000.\nMultiplicando: ");
			numero = entrada.nextInt();
		}
		
		System.out.print("In�cio do Intervalo: ");
		inicioIntervalo = entrada.nextInt();
		
		while (inicioIntervalo < 0 || inicioIntervalo > 3000) {
			System.out.print("O n�mero n�o pode ser negativo e nem maior que 3000.\nIn�cio do Intervalo: ");
			inicioIntervalo = entrada.nextInt();
		}
		
		System.out.print("Fim do Intervalo: ");
		finalIntervalo = entrada.nextInt();
		
		while (finalIntervalo < 0 || finalIntervalo > 3000) {
			System.out.print("O n�mero n�o pode ser negativo e nem maior que 3000.\nFim do Intervalo: ");
			finalIntervalo = entrada.nextInt();
		}
		
		while (inicioIntervalo > finalIntervalo) {
			System.out.print("O final do intervalo n�o pode ser menor que o in�cio.\nFim do Intervalo: ");
			finalIntervalo = entrada.nextInt();
		}
		
		while (finalIntervalo - inicioIntervalo >= 10) {
			System.out.print("O intervalo n�o pode ser maior que 10.\nFim do Intervalo: ");
			finalIntervalo = entrada.nextInt();
		}
		
		
			for (int i = inicioIntervalo; i <= finalIntervalo; i++) {
				produto = numero * i;
				System.out.printf("%d x %d = %d\n", numero, i, produto);
			}
		
		entrada.close();
	}
}