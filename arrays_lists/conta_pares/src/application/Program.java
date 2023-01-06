package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em
		 * seguida, mostre na tela todos os números pares, e também a quantidade de
		 * números pares.
		 */

		Scanner sc = new Scanner(System.in);
		int contador = 0;

		System.out.print("Quantos números vai digitar? ");
		int n = sc.nextInt();

		int[] vetor = new int[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}

		System.out.println("Números Pares: ");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + "  ");
				contador++;
			}
		}

		System.out.println();
		System.out.print("Quantidade de pares = " + contador);

		sc.close();

	}

}
