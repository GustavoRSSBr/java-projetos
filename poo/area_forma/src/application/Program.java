package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {
	/*
	 * Fazer um programa para ler os dados de N figuras (N fornecido pelo usuário),
	 * e depois mostrar as áreas destas figuras na mesma ordem em que foram
	 * digitadas.
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Shape> list = new ArrayList<>();

		System.out.print("Enter the number of shapes:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char opt = sc.next().toLowerCase().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());

			if (opt == 'c') {
				System.out.print("Radius: ");
				Double radius = sc.nextDouble();

				list.add(new Circle(color, radius));

			} else {
				System.out.print("Width: ");
				Double width = sc.nextDouble();
				System.out.print("Heigth: ");
				Double height = sc.nextDouble();

				list.add(new Rectangle(color, width, height));
			}
		}

		System.out.println("SHAPE AREAS: ");
		for (Shape s : list) {
			System.out.println(String.format("%.2f", s.area()));
		}

		sc.close();

	}

}
