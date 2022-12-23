import java.util.Locale;
import java.util.Scanner;

public class Main {
	// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
	// valor unitário de cada peça 1,  Calcule e mostre o valor total a ser pago
	

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		double valorTotal;
		
		System.out.println("Digite o código da peça");
		int codPeca = scan.nextInt();
		System.out.println("Digite o Valor da peça");
		double valorUnitario = scan.nextDouble();
		System.out.println("Digite a quantidade de peças");
		int qtdPeca = scan.nextInt();
		scan.nextLine();
		

		valorTotal = qtdPeca * valorUnitario;

		System.out.printf("Codigo: %d%nValor da peça: %.2f%nQuantidade de peças: %d%nValor total: %.2f", codPeca,
				valorUnitario, qtdPeca, valorTotal);

		scan.close();

	}

}
