package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme
		 * exemplo. Depois, mostrar na tela a altura média das pessoas, e mostrar também
		 * a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas
		 * pessoas caso houver.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double soma = 0;
		double media = 0;
		double porcentagemMenor = 0;
		double countPessoa = 0;

		System.out.print("Digite pessoas serão digitadas? ");
		int n = sc.nextInt();
		Pessoa[] vetorPessoa = new Pessoa[n];

		for (int i = 0; i < vetorPessoa.length; i++) {
			System.out.print("Digite o Nome da Pessoa: ");
			String nome = sc.next();
			System.out.print("Digite a idade da Pessoa: ");
			int idade = sc.nextInt();
			System.out.print("Digite a altura da Pessoa: ");
			double altura = sc.nextDouble();

			System.out.println();

			vetorPessoa[i] = new Pessoa(nome, idade, altura);
			soma += vetorPessoa[i].getAltura();

			if (vetorPessoa[i].getIdade() < 16) {
				countPessoa++;
			}
		}

		media = soma / vetorPessoa.length;
		System.out.printf("Altura Média: %.2f%n", media);

		porcentagemMenor = countPessoa * 100 / vetorPessoa.length;

		System.out.printf("Pessoas Menores de 16 anos: %.1f%% %n", porcentagemMenor);
		
		for (int i = 0; i < vetorPessoa.length; i++) {
			if (vetorPessoa[i].getIdade() < 16) {
				System.out.println(vetorPessoa[i].getNome());
			}
		}

		sc.close();

	}

}
