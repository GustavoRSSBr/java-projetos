package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	/*
	 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve
	 * nos três trimestres do ano (primeiro trimestre vale 30 e o segundo e terceiro
	 * valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano. Dizer
	 * também se o aluno está aprovado ou não e, em caso negativo, quantos pontos
	 * faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota).
	 * Você deve criar uma classe Aluno para resolver este problema
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Aluno aluno = new Aluno();

		System.out.print("Digite o nome do Aluno: ");
		aluno.nome = scan.nextLine();

		for (int i = 1; i <= 3; i++) {
			System.out.print("Digite a " + i + "° nota: ");
			aluno.adicionarNota(scan.nextDouble());
		}
		System.out.println();

		aluno.validarNota();

		scan.close();

	}

}
