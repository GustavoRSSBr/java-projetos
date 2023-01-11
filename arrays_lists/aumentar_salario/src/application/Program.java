package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	/*
	 * Fazer um programa para ler um número inteiro N e depois os dados (id, nome e
	 * salario) de N funcionários. Não deve haver repetição de id. Em seguida,
	 * efetuar o aumento de X por cento no salário de um determinado funcionário.
	 * Para isso, o programa deve ler um id e o valor X. Se o id informado não
	 * existir, mostrar uma mensagem e abortar a operação. Ao final, mostrar a
	 * listagem atualizada dos funcionários, conforme exemplos. Lembre-se de aplicar
	 * a técnica de encapsulamento para não permitir que o salário possa ser mudado
	 * livremente. Um salário só pode ser aumentado com base em uma operação de
	 * aumento por porcentagem dada
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Funcionario> lista = new ArrayList<>();

		System.out.print("Quantos Funcionários deseja Digitar? ");
		int n = sc.nextInt();
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.println("Funcionário " + (i + 1));
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			while (verificarId(lista, id)) {
				System.out.print("ID já existente, digite novamente: ");
				id = sc.nextInt();
			}

			System.out.print("NOME: ");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.print("SALÁRIO: ");
			Double salario = sc.nextDouble();

			Funcionario objeto = new Funcionario(id, nome, salario);
			lista.add(objeto);
			System.out.println();
		}

		System.out.print("Digite o ID do funcionario que terá o salário aumentado: ");
		Integer id = sc.nextInt();

		Funcionario obj = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		System.out.println();

		if (obj == null) {
			System.out.println("Funcionário não encontrado");

		} else {
			System.out.print("Digite a porcentagem que vai aumentar: ");
			Double percent = sc.nextDouble();
			obj.aumentarSalario(percent);
		}

		System.out.println();

		for (Funcionario func : lista) {
			System.out.println(func);
		}

		sc.close();
	}

	public static boolean verificarId(List<Funcionario> lista, int id) {
		Funcionario obj = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return obj != null;
	}

}
