package application;

import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas
		 * idades. Depois, mostrar na tela o nome da pessoa mais velha.
		 */

		Scanner sc = new Scanner(System.in);
		String nome;
		int idade;
		Pessoa maiorIdade = null;

		System.out.print("Quantas pessoas deseja digitar? ");
		int n = sc.nextInt();

		Pessoa[] vetor = new Pessoa[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite os dados da " + (i + 1) + "° Pessoa");
			nome = sc.next();
			idade = sc.nextInt();

			vetor[i] = new Pessoa(nome, idade);

			if (i == 0) {
				maiorIdade = vetor[i];
			} else if (vetor[i].getIdade() > maiorIdade.getIdade()) {
				maiorIdade = vetor[i];
			}
		}

		System.out.print("Pessoa mais velha: " + maiorIdade.getNome());

		sc.close();
	}

}
