package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		Retangulo retangulo = new Retangulo();

		System.out.print("Digite a altura do Retangulo: ");
		retangulo.altura = scan.nextDouble();
		System.out.print("Digite a largura do Retangulo: ");
		retangulo.largura = scan.nextDouble();

		System.out.println("------------------------------");
		System.out.println("Área: " + retangulo.calcularArea());
		System.out.println("Perímetro: " + retangulo.calcularPerimetro());
		System.out.println("Diagonal: " + retangulo.calcularDiagonal());

		scan.close();

	}

}
