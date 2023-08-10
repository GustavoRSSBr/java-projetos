package aplicacao;
import java.util.Scanner;

import controle.SistemaProdutos;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		SistemaProdutos sistema = new SistemaProdutos();

		while (true) {
			System.out.println("-----------------------------------");
			System.out.println("Digite a opção desejada:");
			System.out.println("1 - Cadastrar produto");
			System.out.println("2 - Buscar produto pelo ID");
			System.out.println("3 - Listar produtos");
			System.out.println("4 - Atualizar produto");
			System.out.println("5 - Remover produto");
			System.out.println("0 - Sair");
			System.out.println("-----------------------------------");

			int opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				sistema.adicionarProduto();
				break;

			case 2:
				sistema.buscarProduto();
				break;

			case 3:
				sistema.listarProdutos();
				break;

			case 4:
				sistema.atualizarProduto();
				break;

			case 5:
				sistema.removerProduto();
				break;

			case 0:
				sc.close();
				System.exit(0);
			default:
				System.out.println("Opção Inválida");

			}

		}
	}
}
