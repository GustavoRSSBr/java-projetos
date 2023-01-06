package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um vetor de N números inteiros. Em seguida,
		 * mostrar na tela a média aritmética somente dos números pares lidos, com uma
		 * casa decimal. Se nenhum número par for digitado, mostrar a mensagem
		 * "NENHUM NUMERO PAR"
		 */

		Scanner sc = new Scanner(System.in);
		int soma = 0;
		double media = 0;
		int contador = 0;
		boolean controle = false;

		System.out.print("Digite a quantidade de elementos do vetor: ");
		int n = sc.nextInt();

		int[] vetor = new int[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();

			if (vetor[i] % 2 == 0) {
				soma += vetor[i];
				contador ++;
				controle = true;
			}
		}

		if (controle) {
			media = soma / contador;
			System.out.println("Media dos pares: " + media);
		} else {
			System.out.println("Nenhum número par");
		}

		sc.close();

	}

}
