import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Leia 1 valor inteiro N, que representa o número de casos de teste que vem a
		// seguir. Cada caso de teste consiste
		// de 3 valores reais, cada um deles com uma casa decimal. Apresente a média
		// ponderada para cada um destes
		// conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo
		// valor tem peso 3 e o terceiro valor tem peso 5.

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite a quantidade de médias que deseja calcular: ");
		int n = scan.nextInt();
		double media = 0;
		double valor = 0;

		for (int ctd = 1; ctd <= n; ctd++) {
			media = 0;

			for (int i = 1; i <= 3; i++) {
				System.out.print("Digite o " + i + "° valor: ");
				valor = scan.nextDouble();

				if (i == 0) {
					media += valor * 0.2;
				} else if (i == 1) {
					media += valor * 0.3;
				} else {
					media += valor * 0.5;
				}
			}

			System.out.printf("%nA %d° média é: %.1f%n", ctd, media);
			System.out.println("--------------------------------------");
		}

		scan.close();

	}
}
