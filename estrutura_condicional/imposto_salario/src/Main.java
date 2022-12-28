import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em
		 * pagar seus impostos, pois sabem que nele não existem políticos corruptos e os
		 * recursos arrecadados são utilizados em benefício da população, sem qualquer
		 * desvio. A moeda deste país é o Rombus, cujo símbolo é o R$. Leia um valor com
		 * duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em
		 * seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de
		 * Renda, segundo a tabela abaixo
		 * 
		 * Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas
		 * sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00
		 * é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8%
		 * sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O
		 * valor deve ser impresso com duas casas decimais.
		 */

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		double imposto;

		System.out.println("\tRenda\t\t/\timposto");
		System.out.println("--------------------------------------------------");
		System.out.println("De 0.00 até R$ 2000\t|\tIsento");
		System.out.println("De 2000.01 até R$ 3000\t|\t8%");
		System.out.println("De 3000.01 até R$ 4500\t|\t18%");
		System.out.println("acima de R$ 4500\t|\t28%");
		System.out.println("--------------------------------------------------");

		System.out.println("Digite o sálario da pessoa");
		double salario = scan.nextDouble();
		

		if (salario <= 2000) {
			imposto = 0;
		} else if (salario <= 3000) {
			imposto = (salario - 2000) * 0.08;
		} else if (salario <= 4500) {
			imposto = (salario - 3000) * 0.18 + 1000 * 0.08;
		} else {
			imposto = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
		}
		

		if (imposto == 0) {
			System.out.println("Isento");
		} else {
			System.out.printf("Salário: R$ %.2f%nImposto: R$ %.2f", salario, imposto);
		}

		scan.close();

	}

}
