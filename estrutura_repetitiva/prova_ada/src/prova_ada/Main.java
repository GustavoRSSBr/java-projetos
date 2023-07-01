package prova_ada;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double salarios[] = new double[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < salarios.length; i++) {
			System.out.println("Digite o salário do " + (i + 1) + "° funcionário");
			salarios[i] = sc.nextDouble();
		}

		for (int i = 0; i < salarios.length; i++) {
			System.out.printf("O salário Bruto do %d ° funcionário é de R$ %.2f \n",(i+1),salarios[i]);
			calcularSalario(salarios[i]);
			System.out.println("---------------------------------");

		}
		
		sc.close();
	}

	static void calcularSalario(double salario) {
		double salarioLiquido = salario - (calcularINSS(salario) + calcularImposto(salario));
		System.out.printf("O salario Liquido é de R$ %.2f \n", salarioLiquido);
	}

	static double calcularINSS(double salario) {
		double imposto = 0;
		double resto;

		if (salario <= 1212.00) {
			imposto = salario * 0.075;
		} else if (salario > 1212.00 && salario <= 2427.35) {
			resto = salario - 1212.00;
			imposto += resto * 0.09 + (1212.00 * 0.075);

		} else if (salario > 2427.35 && salario <= 3641.03) {
			resto = salario - 2427.35;
			imposto += resto * 0.12 + (1212.00 * 0.075) + (0.09 * 1215.35);

		} else if (salario > 3641.03 && salario <= 7087.22) {
			resto = salario - 3641.03;
			imposto += resto * 0.14 + (1212.00 * 0.075) + (0.09 * 1215.35) + (0.12 * 1212.68);
		} else {
			imposto = 1153.22;
		}
		System.out.printf("Ele pagou ao INSS R$ %.2f \n", imposto);
		return imposto;

	}

	static double calcularImposto(double salario) {
		double imposto = 0;
		double resto;

		if (salario > 1903.98 && salario <= 2826.65) {
			imposto += (salario - 1903.98) * 0.075;

		} else if (salario > 2826.65 && salario <= 3751.05) {
			resto = salario - 2826.65;
			imposto += resto * 0.15 + (1903.98 * 0.075);

		} else if (salario > 3751.05 && salario <= 4664.68) {
			resto = salario - 3751.05;
			imposto += resto * 0.225 + (1903.98 * 0.075) + (924.40 * 0.15);

		} else if (salario > 4664.68) {
			resto = salario - 4664.68;
			imposto += resto * 0.275 + (1903.98 * 0.075) + (924.40 * 0.15) + (913.63 * 0.225);
		}
		System.out.printf("Ele pagou ao Imposto de Renda R$ %.2f \n", imposto);
		return imposto;

	}

}
