package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Program {

	public static void main(String[] args) {
		/*
		 * Em um banco, para se cadastrar uma conta bancária, é necessário informar o
		 * número da conta, o nome do titular da conta, e o valor de depósito inicicial
		 * que o titular depositou ao abrir a conta. Este valor de depósito inicial,
		 * entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar
		 * no momento de abrir sua conta, o depósito inicial não será feito e o saldo
		 * inicial da conta será, naturalmente 0
		 * 
		 * Importante: uma vez que uma conta bancária foi aberta, o número da conta
		 * nunca poderá ser alterado. Já o nome do titular pode ser alterado (pois uma
		 * pessoa pode mudar de nome por ocasião de casamento por exemplo).
		 * 
		 * Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver
		 * um mecanismo para proteger isso. O saldo só aumnta por meio de depósitos, e
		 * só diminui por meio de saques. Para cada saque realizado, o banco cobra uma
		 * taxa de $ 5.00. Nota: a conta pode ficar com saldo negátivo se o saldo não
		 * for suficiente para realizar o saque e/ou pagar a taxa.
		 * 
		 * Você deve fazer um programa que realize o cadastro de uma conta, dando opção
		 * para que seja ou não informado o valor de depósito inicial. Em seguida,
		 * realizar um depósito e depois um saque, sempre mostrando os dados da conta
		 * após cada operação
		 */

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		double valor;
		ContaBancaria conta;

		System.out.print("Digite o número da Conta: ");
		int numConta = scan.nextInt();

		System.out.print("Digite o nome do Titular: ");
		String nome = scan.next();

		System.out.print("Desejá realizar um depósito inicial? [s/n]");
		char opc = scan.next().toLowerCase().charAt(0);

		if (opc == 's') {
			System.out.print("Digite o valor do depósito incial: ");
			valor = scan.nextDouble();
			conta = new ContaBancaria(numConta, nome, valor);
			System.out.print("Dados da conta: ");
			conta.exibir();
			System.out.println();

		} else {
			conta = new ContaBancaria(numConta, nome);
			conta.exibir();
			System.out.println();
		}

		System.out.print("Digite o valor do depósito: ");
		valor = scan.nextDouble();
		conta.depositar(valor);
		System.out.print("Dados da Conta atualizados: ");
		conta.exibir();
		System.out.println();

		System.out.print("Digite o valor a ser sacado: ");
		valor = scan.nextDouble();
		conta.sacar(valor);
		System.out.print("Dados da Conta atualizados: ");
		conta.exibir();

		scan.close();

	}

}
