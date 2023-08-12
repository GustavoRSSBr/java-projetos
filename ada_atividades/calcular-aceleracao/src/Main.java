import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Faça um programa para calcular a aceleração adquirida de um determinado
		 * objeto de acordo com a sua força e massa, recordando que F=M.A. O objeto
		 * deverá possuir como características força e massa. Exemplo: Um carro com
		 * força de 2000N(Newton) e 200 kg de massa deverá possuir 10 m/s² de aceleração
		 * pois:
		 * 
		 * F=M.A
		 * 
		 * 2000=200.a = 2000/200 = a = 10m/s²
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor da força do objeto em Newton: ");
		double forca = sc.nextDouble();

		System.out.print("Digite o valor da massa do objeto em kg: ");
		double massa = sc.nextDouble();

		Aceleracao aceleracao = new Aceleracao(forca, massa);

		aceleracao.calcularAceleracao();

		sc.close();

	}

}
