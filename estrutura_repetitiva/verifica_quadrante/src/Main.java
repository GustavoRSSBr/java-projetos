import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
		// indeterminada de pontos no sistema
		// cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O
		// algoritmo será encerrado quando pelo
		// menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem
		// alguma).

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor de X");
		double x = scan.nextDouble();
		System.out.println("Digite o valor de Y");
		double y = scan.nextDouble();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("PRIMEIRO");
			} else if (x < 0 && y > 0) {
				System.out.println("SEGUNDO");
			} else if (x < 0 && y < 0) {
				System.out.println("TERCEIRO");
			} else {
				System.out.println("QUARTO");
			}

			System.out.println("--------------------------------");
			
			System.out.println("Digite o valor de X");
			x = scan.nextDouble();
			System.out.println("Digite o valor de Y");
			y = scan.nextDouble();
		}

		scan.close();
	}

}
