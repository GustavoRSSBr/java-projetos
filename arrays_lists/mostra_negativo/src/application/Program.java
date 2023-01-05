package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		// Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois
		// N números inteiros e armazene-os em um vetor. Em seguida, mostrar na tela
		// todos os números negativos lidos

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int n = scan.nextInt();

		int[] vetor = new int[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = scan.nextInt();
		}
		
		System.out.println();
		System.out.println("Números Negativos:");

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
		}

		scan.close();

	}

}
