package appplication;

import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		// "Desenvolva um caixa eletrônico que, após a inserção do cartão, pergunte ao
		// titular da conta se deseja realizar um saque ou um depósito. Ao finalizar a
		// transação, exiba o saldo da conta."

		Scanner sc = new Scanner(System.in);

		int n = 0;
		Conta c = new Conta();

		System.out.println("Cartão inserido com sucesso!");

		while (n != 9) {
			System.out.println("Menu Principal");
			System.out.println("1 – Depositar\r\n" + "2 – Sacar\r\n" + "9 – Fim");
			System.out.print("Escolha uma opção: ");
			n = sc.nextInt();

			if (n == 1) {
				System.out.print("Digite o valor que deseja depositar: ");
				double valor = sc.nextDouble();
				c.depositar(valor);
				System.out.println("\n" + c.toString());

			} else if (n == 2) {
				System.out.print("Digite o valor que sacar: ");
				double valor = sc.nextDouble();

				if (valor <= c.getSaldo()) {
					c.sacar(valor);
					System.out.println("\n" + c.toString());
				} else {
					System.out.println("\nSaldo insuficiente!");
					System.out.println("\n" + c.toString());
				}
			}

		}

		System.out.println("\nObrigado, Volte Sempre!");

		sc.close();

	}

}
