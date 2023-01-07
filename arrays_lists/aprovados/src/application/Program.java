package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um conjunto de N nomes de alunos, bem como as
		 * notas que eles tiraram no 1º e 2º semestres. Cada uma dessas informações deve
		 * ser armazenada em um vetor. Depois, imprimir os nomes dos alunos aprovados,
		 * considerando aprovados aqueles cuja média das notas seja maior ou igual a 6.0
		 * (seis).
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();

		Aluno[] alunos = new Aluno[n];
		double[] notas;
		String nome;

		for (int i = 0; i < alunos.length; i++) {
			notas = new double[2];
			System.out.println("Digite o nome, primeira e segunda nota do " + (i + 1) + "° aluno");
			sc.nextLine();
			nome = sc.nextLine().trim();
			notas[0] = sc.nextDouble();
			notas[1] = sc.nextDouble();
			
			alunos[i] = new Aluno(nome, notas);
		}

		System.out.println("Alunos aprovados: ");

		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i].media() >= 6) {
				System.out.println(alunos[i].getNome());
			}
		}

		sc.close();

	}

}
