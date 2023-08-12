import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Faça um programa que receba um número como entrada e informe ao usuário se o
		 * número é impar ou par. Para determinar se o número é impar ou par, você deve
		 * criar uma classe que represente este cálculo.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");

		int numero = sc.nextInt();

		VerificadorDeNumeros.verificaPar(numero);

		sc.close();

	}

}
