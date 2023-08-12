package calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Descreva o código Java para definir um objeto do tipo “Calculadora” que tem
		 * como características um valor1 e um valor2 e possui os comportamentos de
		 * somar,subtrair,multiplicar e dividir. Cada comportamento deve retornar o
		 * valor da operação correspondente.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor do primeiro termo: ");

		double valor1 = sc.nextDouble();

		System.out.print("Digite o valor do segundo termo: ");

		double valor2 = sc.nextDouble();

		Calculadora calculadora = new Calculadora(valor1, valor2);

		System.out.println(calculadora.getValor1() + " + " + calculadora.getValor2() + " = " + calculadora.somar());
		System.out.println(calculadora.getValor1() + " - " + calculadora.getValor2() + " = " + calculadora.subtrair());
		System.out.println(calculadora.getValor1() + " * " + calculadora.getValor2() + " = " + calculadora.multiplicar());
		System.out.println(calculadora.getValor1() + " / " + calculadora.getValor2() + " = " + calculadora.dividir());

		sc.close();

	}

}
