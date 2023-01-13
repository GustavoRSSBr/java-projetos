package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * Receba um valor N, que definirá o tamanho do vetor. Preencha esse vetor com
		 * números inteiros e imprima o vetor ordenado.
		 */

		Scanner sc = new Scanner(System.in);
		boolean controle;
		int aux;

		System.out.print("Digite o tamanho do Vetor: ");
		int n = sc.nextInt();

		int[] vetor = new int[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o valor da " + (i + 1) + "° posição do vetor: ");
			vetor[i] = sc.nextInt();
		}

		for (int i = 0; i < vetor.length; i++) {
			controle = true;
			for (int j = 0; j < (vetor.length - 1); j++) {
				if (vetor[j] > vetor[j + 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
					controle = false;
				}
			}

			if (controle) {
				break;
			}

		}

		System.out.println();
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}

		sc.close();

	}

}
