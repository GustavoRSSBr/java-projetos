package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Receba um texto e imprima se ele é um Palíndromo ou não

		Scanner sc = new Scanner(System.in);
		String inverte = "";

		System.out.print("Digite um texto: ");
		String texto = sc.next().trim().toLowerCase();
		
		System.out.println();

		for (int i = (texto.length() - 1); i >= 0; i--) {
			inverte += texto.charAt(i);
		}

		if (inverte.equals(texto)) {
			System.out.println("É um palíndromo");
		} else {
			System.out.println("Não é um palindromo");
		}
		
		System.out.println();
		System.out.println("Texto: " + texto);
		System.out.println("Texto invertido: " + inverte);

		sc.close();

	}

}
