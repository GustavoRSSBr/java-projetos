package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o nome do Departamento: ");
		String nomeDepartamento = sc.nextLine();
		System.out.println("Digite os dados do trabalhador: ");
		System.out.print("Nome: ");
		String nomeTrabalhador = sc.nextLine();
		System.out.print("Nível: ");
		String nivelTrabalhador = sc.nextLine();
		System.out.print("Salário Base: ");
		Double salarioBase = sc.nextDouble();

		Worker trabalhador = new Worker(nomeTrabalhador, WorkerLevel.valueOf(nivelTrabalhador), salarioBase,
				new Departament(nomeDepartamento));

		System.out.print("Quantos Contratos terá o trabalhador: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Entre com os dados do " + i + "° contrato");
			System.out.print("Digite a data do contrato (DD/MM/YYYY): ");
			LocalDate data = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			System.out.print("Valor por hora: ");
			double valorHora = sc.nextDouble();
			System.out.print("Duração (horas): ");
			int horas = sc.nextInt();

			trabalhador.addContract(new HourContract(data, valorHora, horas));
		}

		System.out.println();
		System.out.print("Entre com o mês e o ano para calcular o salário (MM/YYYY): ");
		String mesAno = sc.next();
		int mes = Integer.parseInt(mesAno.substring(0, 2));
		int ano = Integer.parseInt(mesAno.substring(3));

		System.out.println();

		System.out.println("Nome do Trabalhador: " + trabalhador.getName());
		System.out.println("Departamento: " + trabalhador.getDepartament().getNome());
		System.out.println("O trabalhador ganhou R$" + String.format("%.2f", trabalhador.incame(ano, mes))
				+ " em " + mesAno);

		sc.close();

	}

}
