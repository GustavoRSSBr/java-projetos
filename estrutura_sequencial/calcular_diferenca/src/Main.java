import java.util.Locale;
import java.util.Scanner;

public class Main {

	// Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
	// calcule e mostre a diferença do produto
	// de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C *
	// D).

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int a, b, c, d;
		int diferenca;
		
		System.out.println("Digite os valores");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();
		
		diferenca = (a * b - c * d);
		
		System.out.printf("O valor da diferença dos produtos é %d", diferenca);

		scan.close();

	}

}
