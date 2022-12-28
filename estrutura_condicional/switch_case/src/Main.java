import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		String nomeProduto;
		double precoUnd;
		double valorTotal;
		
		//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A 
		//seguir, calcule e mostre o valor da conta a pagar

		System.out.println("Código\t/\tEspecificação\t/\tPreço");
		System.out.println("----------------------------------------------------");
		System.out.println("1\t|\tCachorro Quente\t|\tR$ 4.00");
		System.out.println("2\t|\tX-Salada\t|\tR$ 4.50");
		System.out.println("3\t|\tX-Bacon \t|\tR$ 5.00");
		System.out.println("4\t|\tTorrada simples\t|\tR$ 2.00");
		System.out.println("5\t|\tRefrigerante\t|\tR$ 1.50");
		
		System.out.println("----------------------------------------------------");

		System.out.println("Digite o código do Produto:");
		int codigo = scan.nextInt();
		System.out.println("Digite a quantidade do Produto:");
		int qtdProduto = scan.nextInt();
		System.out.println("----------------------------------------------------");
		switch (codigo) {
		case 1:
			nomeProduto = "Cachorro Quente";
			precoUnd = 4.00;
			valorTotal = qtdProduto * precoUnd;

			System.out.printf("Nome do Produto: %s%nQuantidade: %d%nValor Unitário: R$ %.2f%nTotal: R$ %.2f", nomeProduto,
					qtdProduto, precoUnd, valorTotal);
			break;
		case 2:
			nomeProduto = "X-Salada";
			precoUnd = 4.50;
			valorTotal = qtdProduto * precoUnd;

			System.out.printf("Nome do Produto: %s%nQuantidade: %d%nValor Unitário: R$ %.2f%nTotal: R$ %.2f", nomeProduto,
					qtdProduto, precoUnd, valorTotal);
			break;
		case 3:
			nomeProduto = "X-Bacon";
			precoUnd = 5.00;
			valorTotal = qtdProduto * precoUnd;

			System.out.printf("Nome do Produto: %s%nQuantidade: %d%nValor Unitário: R$ %.2f%nTotal: R$ %.2f", nomeProduto,
					qtdProduto, precoUnd, valorTotal);
			break;
		case 4:
			nomeProduto = "Torrada simples";
			precoUnd = 2.00;
			valorTotal = qtdProduto * precoUnd;

			System.out.printf("Nome do Produto: %s%nQuantidade: %d%nValor Unitário: R$ %.2f%nTotal: R$ %.2f", nomeProduto,
					qtdProduto, precoUnd, valorTotal);
			break;
		case 5:
			nomeProduto = "Refrigerante";
			precoUnd = 1.50;
			valorTotal = qtdProduto * precoUnd;

			System.out.printf("Nome do Produto: %s%nQuantidade: %d%nValor Unitário: R$ %.2f%nTotal: R$ %.2f", nomeProduto,
					qtdProduto, precoUnd, valorTotal);
			break;
		default:
			System.out.println("Codigo indisponivel");
		}

		scan.close();

	}

}
