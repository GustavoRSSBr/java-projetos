package application;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.Pedido;
import entities.PedidoItem;
import entities.Produto;
import entities.enums.PedidoStatus;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os dados do cliente");

		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Data de nascimento (dd/mm/aaaa) : ");
		LocalDate data = LocalDate.parse(sc.next(), Pedido.formato1);

		Cliente c1 = new Cliente(nome, email, data);

		System.out.println("Digite os dados do pedido");
		System.out.print("Status: ");
		String status = sc.next();

		Pedido pedido = new Pedido(Instant.now(), PedidoStatus.valueOf(status), c1);

		System.out.print("Quantos itens tem o pedido? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Digite os dados do " + i + "° item");
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.print("Valor do produto: ");
			Double preco = sc.nextDouble();

			Produto p = new Produto(nomeProduto, preco);

			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();

			PedidoItem item = new PedidoItem(quantidade, p);

			pedido.addItem(item);
		}

		System.out.println();
		System.out.println(pedido.toString());

		sc.close();

	}

}
