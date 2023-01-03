package application;

import java.util.Locale;
import java.util.Scanner;

import utils.CurrencyConverter;

public class Program {

	/*
	 * Faça um programa para ler a cotação do dólar, e depois um valor em dólares a
	 * ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai
	 * pagar pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF
	 * sobre o valor em dólar. Criar uma classe CurrencyConverter para ser
	 * responsável pelos cálculos.
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		double precoDolar;
		double qtdDolar;

		System.out.print("Digite o preço do dólar: ");
		precoDolar = scan.nextDouble();
		System.out.print("Digite o quantos dolares irá comprar: ");
		qtdDolar = scan.nextDouble();
		
		System.out.println();
		System.out.printf("Você pagará R$ %.2f pelos doláres", CurrencyConverter.converter(qtdDolar, precoDolar));

		scan.close();

	}

}
