package appplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler os dados de N produtos (N fornecido pelo usuário).
		 * Ao final, mostrar a etiqueta de preço de cada produto na mesma ordem em que
		 * foram digitados. Todo produto possui nome e preço. Produtos importados
		 * possuem uma taxa de alfândega, e produtos usados possuem data de fabricação.
		 * Estes dados específicos devem ser acrescentados na etiqueta de preço conforme
		 * exemplo (próxima página). Para produtos importados, a taxa e alfândega deve
		 * ser acrescentada ao preço final do produto
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Product " + i + " data: ");
			System.out.print("Common, used or imported (c/u/i): ");
			char opc = sc.next().toUpperCase().charAt(0);

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Price: ");
			Double price = sc.nextDouble();

			if (opc == 'C') {
				list.add(new Product(name, price));
			} else if (opc == 'U') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate data = LocalDate.parse(sc.next(), UsedProduct.fmt1);
				list.add(new UsedProduct(name, price, data));
			} else {
				System.out.print("Customs fee: ");
				Double customs = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customs));
			}
		}

		System.out.println();
		System.out.println("PRICE TAGS:");

		for (Product p : list) {
			System.out.println(p.priceTag());
		}

		sc.close();

	}

}
