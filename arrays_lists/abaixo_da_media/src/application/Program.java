package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro N e depois um vetor de N números
		 * reais. Em seguida, mostrar na tela a média aritmética de todos elementos com
		 * três casas decimais. Depois mostrar todos os elementos do vetor que estejam
		 * abaixo da média, com uma casa decimal cada.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double soma = 0;
		double media = 0;

		System.out.print("Digite a quantidade de elementos do vetor: ");
		int n = sc.nextInt();

		double[] vetor = new double[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
			soma += vetor[i];
		}

		media = soma / vetor.length;

		System.out.println();
		System.out.printf("Media do vetor: %.3f\n", media);
		System.out.println("Elementos abaixo da média: ");

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < media) {
				System.out.println(vetor[i]);
			}
		}

		sc.close();

	}

}
