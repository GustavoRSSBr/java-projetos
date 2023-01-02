package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	/*
	 * Ler os dados do funcionário (nome, salarioLiquido, imposto), em seguida
	 * mostrar o nome e o salario Liquido do Funcionario; Depois digitar o valor que
	 * deseja aumentar do salario em porcentagem e mostrar os dados atualizados(nome e salario liquido).
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();

		System.out.print("Digite o nome do funcionário: ");
		funcionario.nome = scan.nextLine();
		System.out.print("Digite o salário bruto do funcionario: ");
		funcionario.salarioBruto = scan.nextDouble();
		System.out.print("Digite o imposto do salário: ");
		funcionario.imposto = scan.nextDouble();

		System.out.println();

		System.out.println(funcionario);

		System.out.println("---------------------------------------");

		System.out.print("Digite o aumento do salario (%): ");
		funcionario.aumentarSalario(scan.nextDouble());
		System.out.println("---------------------------------------");

		System.out.println("Dados Atualizados! \n\n" + funcionario);

		scan.close();

	}

}
