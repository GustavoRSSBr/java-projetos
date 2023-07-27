import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char letra;
		int quantidadeDeErros = 0;
		char[] palavraEscolhida = escolherPalavra();
		char[] palavraIncompleta = new char[palavraEscolhida.length];
		palavraIncompleta = colocarTraco(palavraEscolhida);

		while (true) {
			System.out.print("Digite uma letra: ");
			letra = sc.next().charAt(0);

			if (validarLetra(letra, palavraEscolhida)) {
				palavraIncompleta = substituirLetra(letra, palavraEscolhida, palavraIncompleta);
				System.out.println(palavraIncompleta);
				System.out.println("Quantidade de erros: " + quantidadeDeErros);

				if (Arrays.equals(palavraIncompleta, palavraEscolhida)) {
					System.out.println("Parabens você ganhou!");
					break;
				}

			} else {
				quantidadeDeErros++;
				System.out.println(palavraIncompleta);
				System.out.println("Quantidade de erros: " + quantidadeDeErros);
				if (quantidadeDeErros > 5) {
					System.out.println("Você perdeu!");
					break;
				}
			}
		}

		sc.close();
	}

	public static char[] escolherPalavra() {
		JPasswordField passwordField = new JPasswordField();
		passwordField.setEchoChar(' ');
		int result = JOptionPane.showConfirmDialog(null, passwordField, "Digite a palavra do jogo:",
				JOptionPane.OK_CANCEL_OPTION);
		if (result == JOptionPane.OK_OPTION) {
			char[] input = passwordField.getPassword();
			return input;
		} else {
			return null;
		}
	}

	public static boolean validarLetra(char letra, char[] palavra) {
		boolean temLetra = false;
		for (int i = 0; i < palavra.length; i++) {
			if (palavra[i] == letra) {
				temLetra = true;
				break;
			}
		}
		return temLetra;
	}

	public static char[] colocarTraco(char[] palavra) {

		char[] palavraTracada = new char[palavra.length];

		for (int i = 0; i < palavra.length; i++) {
			palavraTracada[i] = '-';
		}

		return palavraTracada;
	}

	public static char[] substituirLetra(char letra, char[] palavraEscolhida, char[] palavraIncompleta) {

		for (int i = 0; i < palavraEscolhida.length; i++) {
			if (palavraEscolhida[i] == letra) {
				palavraIncompleta[i] = letra;
			}
		}

		return palavraIncompleta;
	}

}
