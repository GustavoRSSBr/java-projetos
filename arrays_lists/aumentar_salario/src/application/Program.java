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
		Integer id;
		String nome;
		Double salario;
		Double percent;
		Boolean controle = false;

		Funcionario objeto = null;
		List<Funcionario> lista = new ArrayList<>();

		System.out.print("Quantos Funcionários deseja Digitar? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Funcionário " + (i + 1));
			System.out.print("ID: ");
			id = sc.nextInt();
			System.out.print("NOME: ");
			sc.nextLine();
			nome = sc.nextLine();
			System.out.print("SALÁRIO: ");
			salario = sc.nextDouble();

			objeto = new Funcionario(id, nome, salario);
			lista.add(objeto);
		}

		System.out.print("Digite o ID do funcionario que terá o salário aumentado: ");
		id = sc.nextInt();
		System.out.print("Digite a porcentagem que vai aumentar: ");
		percent = sc.nextDouble();

		for (Funcionario obj : lista) {
			if (obj.getId() == id) {
				obj.aumentarSalario(percent);
				controle = true;
			}
		}

		System.out.println();

		if (controle == false) {
			System.out.println("Funcionário não encontrado");
		}

		for (Funcionario obj : lista) {
			System.out.println(obj);
		}

		sc.close();
	}

}
