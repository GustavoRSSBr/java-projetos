import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro valor: ");
            double valor1 = sc.nextDouble();

            System.out.println("Digite o operador (+ , - , /, *)");
            char operador = sc.next().charAt(0);

            System.out.println("Digite o segundo valor: ");
            double valor2 = sc.nextDouble();

            System.out.println(valor1 + " " + operador + " " + valor2 + " = " + Calculadora.calcular(valor1, valor2, operador));

        } catch (InputMismatchException e) {
            System.out.println("Valor Inválido");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
