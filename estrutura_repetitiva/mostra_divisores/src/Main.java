import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Ler um número inteiro N e calcular todos os seus divisores
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um valor: ");
		int valor = scan.nextInt();

		for (int i = 1; i <= valor; i++) {

			if (valor % i == 0) {
				System.out.println(i);
			}

		}

		scan.close();

	}

}
