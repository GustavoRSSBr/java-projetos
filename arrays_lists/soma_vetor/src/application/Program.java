package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Faça um programa que leia N Números reais e armazene-os em um vetor. Em
		// Seguida: Improma todos os elementos do vetor e Mostre na tela a soma e a
		// média dos elementos do vetor

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double soma = 0;
		double avg = 0;

		System.out.print("Quantos números você vai digitar? ");
		int n = scan.nextInt();

		double[] vetor = new double[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = scan.nextDouble();
		}

		System.out.print("VALORES: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + "  ");
			soma += vetor[i];

		}

		avg = soma / vetor.length;

		System.out.println();
		System.out.println("SOMA: " + soma);
		System.out.println("MÉDIA: " + avg);

		scan.close();

	}

}
