import java.util.Locale;
import java.util.Scanner;

public class Main {
	// Faça um programa para ler dois valores, calcular e depois mostrar na
	// tela o resultado

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in); // ler dados do teclado
		double resultado = 0.0;

		System.out.println("Digite o calculo:");

		double a = leitor.nextDouble();
		char operador = leitor.next().charAt(0); // pega o primeiro char
		double b = leitor.nextDouble();
		boolean controle = true;

		if (operador == '+') {
			resultado = a + b;
		} else if (operador == '-') {
			resultado = a - b;
		} else if (operador == 'x' || operador == '*' || operador == 'X') {
			resultado = a * b;
		} else if (operador == '/') {
			resultado = a / b;
		} else {
			System.out.println("Operação Inválida");
			controle = false;
		}
		
		if (controle) {
			System.out.printf("%.2f %c %.2f = %.2f", a, operador, b, resultado);
		}
		
		leitor.close(); // sempre fechar o Scanner

	}

}
