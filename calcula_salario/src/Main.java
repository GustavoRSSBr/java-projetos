import java.util.Locale;
import java.util.Scanner;

public class Main {
	// Fazer um programa que leia o número de um funcionário, seu número de horas
	// trabalhadas, o valor que recebe por
	// hora e calcula o salário desse funcionário. A seguir, mostre o número e o
	// salário do funcionário, com duas casas
	// decimais.

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double salario;

		System.out.println("Digite o ID do funcionário");
		int idFunc = scan.nextInt();
		System.out.println("Digite a quantidade de horas trabalhadas do funcionário");
		int horasTrab = scan.nextInt();
		System.out.println("Digite o valor da hora do funcionário");
		double valorHora = scan.nextDouble();

		salario = horasTrab * valorHora;

		System.out.printf("O salario do funcionario %d é %.2f", idFunc, salario);

		scan.close();

	}

}
