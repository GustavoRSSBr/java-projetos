import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X
		// que serão lidos em seguida.
		// Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos
		// estão fora do intervalo, mostrando
		// essas informações conforme exemplo (use a palavra "in" para dentro do
		// intervalo, e "out" para fora do intervalo)

		Scanner scan = new Scanner(System.in);
		int x = 0;
		int in = 0;
		int out = 0;

		System.out.print("Digite um valor: ");
		int n = scan.nextInt();

		for (int ctd = 0; ctd < n; ctd++) {
			System.out.print("digite um valor: ");
			x = scan.nextInt();

			if (x >= 10 && x <= 20) {
				in++;
			} else {
				out++;
			}
		}

		System.out.println(in + " IN");
		System.out.println(out + " OUT");

		scan.close();
	}

}
