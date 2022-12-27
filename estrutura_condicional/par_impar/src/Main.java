import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro e dizer se este número é par ou
		// ímpar.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor");	
		int valor = scan.nextInt();
		
		if (valor % 2 == 0) {
			System.out.println("O valor é par");
		}else {
			System.out.println("O valor é impar");
		}
			
		scan.close();
	}

}
