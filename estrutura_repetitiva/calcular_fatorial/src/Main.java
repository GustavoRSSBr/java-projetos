import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N =
		// N * (N-1) * (N-2) * (N-3) * ... * 1.
		// Lembrando que, por definição, fatorial de 0 é 1.

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o valor: ");
		int n = scan.nextInt();
		int fatorial = 1;

		for (int i = 1; i <= n; i++) {
			fatorial = fatorial * i;
		}

		System.out.println(fatorial);

		scan.close();

	}

}
