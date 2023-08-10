package controle;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Produto;

public class SistemaProdutos {
	Scanner sc = new Scanner(System.in);
	List<Produto> lista = new ArrayList<Produto>();

	public void adicionarProduto() {
		Produto p = cadastrarProduto();
		lista.add(p);
	}

	public void buscarProduto() {

		boolean controle = false;

		System.out.print("Digite o ID do produto: ");
		int id = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < lista.size(); i++) {
			if (id == lista.get(i).getId()) {
				controle = true;
				lista.get(i).exibirInformacao();
				;
			}
		}
		if (controle == false) {
			System.err.println("Produto não encontrado");
		}
	}

	public void listarProdutos() {
		for (Produto p : lista) {
			p.exibirInformacao();
		}
	}

	public void atualizarProduto() {
		System.out.print("Digite o nome do produto que deseja atualizar: ");
		String nome = sc.nextLine();

		for (int i = 0; i < lista.size(); i++) {
			if (nome.equalsIgnoreCase(lista.get(i).getNome())) {

				Produto produtoAtualizado = lista.get(i);
				System.out.println("Digite o novo nome: ");
				String novoNome = sc.nextLine();
				System.out.println("Digite o novo preço");
				double novoPreco = sc.nextDouble();

				produtoAtualizado.setNome(novoNome);
				produtoAtualizado.setPreco(novoPreco);

				System.out.println();
				System.out.println("Produto atualizado com sucesso");
			}
		}

	}

	public void removerProduto() {
		boolean controle = false;
		System.out.print("Digite o nome do produto: ");
		String nomeProduto = sc.nextLine();

		for (int i = 0; i < lista.size(); i++) {
			if (nomeProduto.equalsIgnoreCase(lista.get(i).getNome())) {
				controle = true;
				Produto produtoRemovido = lista.get(i);

				lista.remove(produtoRemovido);
				System.out.println("Produto removido com sucesso");
			}
		}

		if (controle == false) {
			System.err.println("Produto não encontrado");
		}

	}

	private Produto cadastrarProduto() {

		System.out.print("Digite o ID do produto: ");
		int id = Integer.parseInt(sc.nextLine());

		System.out.print("Digite o nome: ");
		String nome = sc.nextLine();

		System.out.print("Digite um preço: ");
		double preco = Double.parseDouble(sc.nextLine());

		Produto produtoCadastrado = new Produto(id, nome, preco);
		
		System.out.println("Produto cadastrado com sucesso!");

		return produtoCadastrado;
	}

}
