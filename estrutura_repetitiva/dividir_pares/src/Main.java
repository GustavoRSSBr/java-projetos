import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Fazer um programa para ler um número N. Depois leia N pares de números e
		// mostre a divisão do primeiro pelo
		// segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao
		// impossivel".
		
		Scanner scan = new Scanner(System.in);
		double a, b;
		double resultado;
		
		System.out.print("Digite quantos pares deseja dividir: ");
		int x = scan.nextInt();
		
		for (int i = 1; i <= x; i++ ) {
			System.out.print("Digite o dividendo: ");
			a = scan.nextDouble();
			System.out.print("Digite o denominador: ");
			b = scan.nextDouble();
			
			if(b == 0) {
				System.out.println("Divisão impossivel");
			}else {
				resultado = a / b;
				System.out.println(a + " / " + b + " = " + resultado);
			}
		}
		
		scan.close();

	}

}
