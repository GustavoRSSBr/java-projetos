package appplication;

import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		// "Crie um caixa eletrônico que, após o usuário inserir o cartão, pergunte se
		// deseja fazer um saque, um depósito ou ver o saldo."

		Scanner sc = new Scanner(System.in);

		int n = 0;
		Conta c = new Conta();

		System.out.println("Cartão inserido com sucesso!");

		while (n != 9) {
			System.out.println("Menu Principal");
			System.out.println("1 – Depositar\r\n" + "2 – Sacar\r\n" + "3 – Mostrar Saldo\r\n" + "9 – Fim");
			System.out.print("Escolha uma opção: ");
			n = sc.nextInt();

			if (n == 1) {
				System.out.print("Digite o valor que deseja depositar: ");
				double valor = sc.nextDouble();
				c.depositar(valor);

			} else if (n == 2) {
				System.out.print("Digite o valor que sacar: ");
				double valor = sc.nextDouble();
				c.sacar(valor);

			} else if (n == 3) {
				System.out.println("\n" + c.toString());
			}

		}

		System.out.println("\nObrigado, Volte Sempre!");

		sc.close();

	}

}
