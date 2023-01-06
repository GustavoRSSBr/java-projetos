package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em
		 * seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos
		 * elementos correspondentes de A e B. Imprima o vetor C gerado.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números irá digitar em cada vetor? ");
		int n = sc.nextInt();

		int[] vetorA = new int[n];
		int[] vetorB = new int[n];
		int[] vetorC = new int[n];

		System.out.println("Digite os valores do vetor A");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sc.nextInt();
		}

		System.out.println("Digite os valores do vetor A");
		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = sc.nextInt();
		}

		System.out.println("Vetor resultante: ");
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorB[i] + vetorA[i];
			System.out.println(vetorC[i]);
		}

		sc.close();

	}

}
