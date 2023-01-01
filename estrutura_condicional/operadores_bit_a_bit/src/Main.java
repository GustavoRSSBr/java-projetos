import java.util.Scanner;

public class Main {

	// ler um valor e verificar se o sexto bit dele é verdadeiro ou falso

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int _6mask = 0b100000;

		System.out.print("Digite o valor: ");
		int valor = scan.nextInt();
		
		int valorBit = _6mask & valor; //se o valor der falso o resultado valorBit recebe 0;

		if (valorBit != 0) {
			System.out.println("O sexto bit é Veradeiro"); // se o sexto bit for 1
		} else {
			System.out.println("O sexto bit é falso"); // se o sexto bit for 0
		}

		scan.close();

	}

}
