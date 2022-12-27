import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro, e depois dizer se este número é
		// negativo ou não.

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um valor");
		int valor = scan.nextInt();
		
		if (valor < 0) {
			System.out.println("O valor é negativo");
		} else {
			System.out.println("O valor não é negativo");
		}

		scan.close();

	}

}
