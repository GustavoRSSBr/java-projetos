package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTerceirizado;

public class Program {

	/*
	 * Uma empresa possui funcionários próprios e terceirizados. Para cada
	 * funcionário, deseja-se registrar nome, horas trabalhadas e valor por hora.
	 * Funcionários terceirizado possuem ainda uma despesa adicional. O pagamento
	 * dos funcionários corresponde ao valor da hora multiplicado pelas horas
	 * trabalhadas, sendo que os funcionários terceirizados ainda recebem um bônus
	 * correspondente a 110% de sua despesa adicional. Fazer um programa para ler os
	 * dados de N funcionários (N fornecido pelo usuário) e armazená-los em uma
	 * lista. Depois de ler todos os dados, mostrar nome e pagamento de cada
	 * funcionário na mesma ordem em que foram digitados.
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Funcionario> lista = new ArrayList<>();

		System.out.print("Quantos funcionarios serão digitados? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("O funcionanário é Terceirizado? [S/N]: ");
			char opc = sc.next().toUpperCase().charAt(0);

			System.out.println("Digite os dados do " + i + "° Funcionário");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.print("Quantidade de horas Trabalhadas: ");
			Integer horas = sc.nextInt();

			System.out.print("Valor da hora Trabalhada: ");
			Double valorHora = sc.nextDouble();

			if (opc == 'S') {
				System.out.print("Digite o valor das despesas: ");
				Double despesa = sc.nextDouble();	
				lista.add(new FuncionarioTerceirizado(nome, horas, valorHora, despesa));
			} else {
				lista.add(new Funcionario(nome, horas, valorHora));
			}
			System.out.println();
		}

		for (Funcionario f : lista) {
			System.out.println("Nome: " + f.getNome());
			System.out.println("Pagamento: $" + String.format("%.2f", f.pagamento()));
			System.out.println("----------------------");

		}

		sc.close();

	}

}
