package troca_valores;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Receba os valores em x e y. Efetua a troca de seus valores e mostre seus
		// conteúdos.

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int x, y, aux;

		System.out.println("Digite o valor de X");
		x = scan.nextInt();
		System.out.println("Digite o valor de Y");
		y = scan.nextInt();

		aux = x;
		x = y;
		y = aux;

		System.out.printf("Y = %d e X = %d", y, x);
		
		scan.close();

	}

}
