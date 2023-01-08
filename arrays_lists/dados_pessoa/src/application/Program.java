package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		/*
		 * Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas.
		 * Fazer um programa que calcule e escreva a maior e a menor altura do grupo, a
		 * média de altura das mulheres, e o número de homens.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double altura = 0;
		char genero;
		double maior = 0;
		double menor = 0;
		double mediaMulher;
		double somaMedia = 0;
		int qtdHomem = 0;
		int qtdMulher = 0;

		System.out.print("Quantas pessoas vai ser digitadas? ");
		int n = sc.nextInt();

		Pessoa[] vetorPessoa = new Pessoa[n];

		for (int i = 0; i < vetorPessoa.length; i++) {
			System.out.print("Digite a altura da " + (i + 1) + "° Pessoa: ");
			altura = sc.nextDouble();
			System.out.print("Digite o gênero da " + (i + 1) + "° Pessoa: ");
			genero = sc.next().toLowerCase().charAt(0);
			vetorPessoa[i] = new Pessoa(altura, genero);
		}

		for (int i = 0; i < vetorPessoa.length; i++) {
			if (i == 0) {
				maior = vetorPessoa[i].getAltura();
				menor = vetorPessoa[i].getAltura();
			} else if (vetorPessoa[i].getAltura() > maior) {
				maior = vetorPessoa[i].getAltura();
			} else if (vetorPessoa[i].getAltura() < menor) {
				menor = vetorPessoa[i].getAltura();
			}

			if (vetorPessoa[i].getGenero() == 'f') {
				qtdMulher++;
				somaMedia += vetorPessoa[i].getAltura();
				;
			} else {
				qtdHomem++;
			}
		}

		mediaMulher = somaMedia / qtdMulher;

		System.out.printf("Menor altura = %.2f\n", menor);
		System.out.printf("Maior altura = %.2f\n", maior);
		System.out.printf("Média da altura das mulheres = %.2f\n", mediaMulher);
		System.out.printf("Número de homens = %d", qtdHomem);

		sc.close();

	}

}
