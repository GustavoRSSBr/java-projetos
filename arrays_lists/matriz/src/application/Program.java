package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler dois números inteiros M e N, e depois ler uma
		 * matriz de M linhas por N colunas contendo números inteiros, podendo haver
		 * repetições. Em seguida, ler um número inteiro X que pertence à matriz. Para
		 * cada ocorrência de X, mostrar os valores à esquerda, acima, à direita e
		 * abaixo de X, quando houver, conforme exemplo
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de linhas da matriz: ");
		Integer m = sc.nextInt();
		System.out.println();
		System.out.print("Digite a quantidade de colunas da matriz: ");
		Integer n = sc.nextInt();

		Integer[][] matriz = new Integer[m][n];
		System.out.println("Digite os valores: ");

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				Integer valor = sc.nextInt();
				matriz[i][j] = valor;
			}
		}

		System.out.println();
		System.out.print("Digite o valor que deseja verificar: ");
		int valor = sc.nextInt();
		System.out.println();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == valor) {
					System.out.println("Position " + i + "," + j + ":");
					if (j < matriz[i].length - 1) {
						Integer right = matriz[i][j + 1];
						System.out.println("Right: " + right);
					}

					if (j > 0) {
						Integer left = matriz[i][j - 1];
						System.out.println("Left: " + left);
					}

					if (i > 0) {
						Integer up = matriz[i - 1][j];
						System.out.println("Up: " + up);
					}

					if (i < matriz.length - 1) {
						Integer down = matriz[i + 1][j];
						System.out.println("Down: " + down);
					}

					System.out.println();

				}
			}
		}

		sc.close();

	}

}
