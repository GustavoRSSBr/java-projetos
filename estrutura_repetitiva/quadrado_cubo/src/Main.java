import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro positivo N. O programa deve
		// então mostrar na tela N linhas,
		// começando de 1 até N. Para cada linha, mostrar o número da linha, depois o
		// quadrado e o cubo do valor, conforme
		// exemplo.

		Scanner scan = new Scanner(System.in);
		int cubo;
		int quadrado;

		System.out.print("Digite um valor: ");
		int valor = scan.nextInt();

		for (int i = 1; i <= valor; i++) {
			quadrado = i * i;
			cubo = i * quadrado;

			System.out.println(i + " " + quadrado + " " + cubo);
		}

		scan.close();

	}

}
