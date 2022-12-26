package salario_reajuste;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	// Receba o salário de um funcionário e mostre o novo salário com reajuste
	// de 15%

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		double reajuste;

		System.out.println("Digite o salario do funcionario");
		double salario = scan.nextDouble();

		reajuste = salario * 1.15;

		System.out.printf("O valor do salário com o reajuste é : %.2f", reajuste);

		scan.close();

	}

}
