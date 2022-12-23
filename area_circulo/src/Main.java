import java.util.Locale;
import java.util.Scanner;

public class Main {

	// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
	// valor da área deste círculo com quatro casas decimais

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		double pi = 3.14159;
		double area;

		System.out.println("Digite o valor do raio");
		double raio = scan.nextDouble();

		area = pi * Math.pow(raio, 2);

		System.out.printf("O valor da área do círculo é de %.4f", area);

		scan.close();
	}

}
