package verifica_senha;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Escreva um programa que repita a leitura de uma senha até que ela seja
		// válida. Para cada leitura de senha
		// incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for
		// informada corretamente deve ser
		// impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que
		// a senha correta é o valor 2002.

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite sua senha: ");
		int senha = scan.nextInt();

		while (senha != 2002) {
			System.out.println("Senha incorreta");
			System.out.println();
			System.out.println("Digite a senha novamente: ");
			senha = scan.nextInt();
		}

		System.out.println("Acesso Permitido");

		scan.close();

	}

}
