import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
		 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são
		 * múltiplos entre si. Atenção: os números devem poder ser digitados em ordem
		 * crescente ou decrescente
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor de A");
		int a = scan.nextInt();
		System.out.println("Digite o valor de B");
		int b = scan.nextInt();

		if (a % b == 0) {
			System.out.println("São multiplos");
		} else if (b % a == 0) {
			System.out.println("São multiplos");
		} else {
			System.out.println("Não são multiplos");
		}

		scan.close();

	}

}
