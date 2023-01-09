package application;

import java.util.Scanner;

import entities.Pessoa;
import entities.Quarto;

public class Program {

	public static void main(String[] args) {
		/*
		 * A dona de um pensionato possui dez quartos para alugar para estudantes, sendo
		 * esses quartos identificados pelos números 0 a 9.
		 * 
		 * Fazer um programa que inicie com todos os dez quartos vazios , e depois leia
		 * uma quantidade N representando o número de estudantes que vão alugar quartos
		 * (N pode ser de 1 a 10). Em seguida, registra o aluguel dos N estudants. Para
		 * cada registro de aluguel, informar o nome e email do estudante, bem como qual
		 * dos quartos ele escolheu (de 0 a 9). Suponha que seja escolhido um quarto
		 * vago. Ao final, seu programa deve imprimir um relatório de todas ocupações do
		 * pensionato, por ordem de quarto.
		 */

		Scanner sc = new Scanner(System.in);
		String nome;
		String email;
		int numeroQuarto;

		System.out.print("Quantas pessoas irão alugar? ");
		int n = sc.nextInt();
		Pessoa[] pessoas = new Pessoa[n];
		Quarto[] quartos = new Quarto[10];

		for (int i = 0; i < pessoas.length; i++) {
			System.out.print("\nLocação " + (i + 1));
			System.out.print("\nNome: ");
			sc.nextLine();
			nome = sc.nextLine().trim();

			System.out.print("Email: ");
			email = sc.next();

			pessoas[i] = new Pessoa(nome, email);

			System.out.print("Quarto: ");
			numeroQuarto = sc.nextInt();

			quartos[numeroQuarto - 1] = new Quarto(pessoas[i], numeroQuarto);
		}

		System.out.println();

		for (int i = 0; i < quartos.length; i++) {
			if (quartos[i] != null) {
				System.out.println(quartos[i]);
			}
		}

		sc.close();

	}

}
