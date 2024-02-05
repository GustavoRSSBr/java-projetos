import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {


    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        menuPrincipal();

        sc.close();

    }

    private static void menuPrincipal() {
        try {
            while (true) {
                System.out.println("########--Menu de Opções--########\n");
                System.out.println("|--------------------------------|");
                System.out.println("| Opção 1 - Calcular(+, -, /, *) |");
                System.out.println("| Opção 2 - Calcular área        |");
                System.out.println("| Opção 3 - Outros               |");
                System.out.println("| Opção 4 - Sair                 |");
                System.out.println("|--------------------------------|");
                System.out.println("Digite uma opção: ");

                int opc = sc.nextInt();

                switch (opc) {
                    case 1:
                        menuCalcular();
                        break;
                    case 2:
                        menuArea();
                        break;
                    case 3:
                        outros();
                        break;
                    case 4:
                        System.out.println("Até logo!");
                        return;

                    default:
                        System.out.println("Opção inválida.");
                }

            }
        } catch (InputMismatchException e) {
            System.out.println("Valor Inválido");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void outros() {
        while (true) {
            System.out.println("######--Menu Outros--######\n");
            System.out.println("|-------------------------|");
            System.out.println("| Opção 1 - Fatorial      |");
            System.out.println("| Opção 2 - Raiz Quadrada |");
            System.out.println("| Opção 3 - Potência      |");
            System.out.println("| Opção 4 - Retornar      |");
            System.out.println("|-------------------------|");
            System.out.println("Digite uma opção: ");

            int opc = sc.nextInt();

            switch (opc) {
                case 1:
                    inputFatorial();
                    break;
                case 2:
                    inputRaizQuadrada();
                    break;
                case 3:
                    inputPotencia();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private static void inputPotencia() {
        System.out.println("Digite o valor: ");
        double numero = sc.nextDouble();
        System.out.println("Elevado a: ");
        double elevado = sc.nextDouble();

        double resultado = Calculadora.potencia(numero, elevado);
        System.out.println("O resultado é: " + resultado);
    }

    private static void inputRaizQuadrada() {
        System.out.println("Digite o valor para encontrar a sua raiz quadrada: ");
        double numero = sc.nextDouble();
        double resultado = Calculadora.raiz(numero);
        System.out.println("O resultado é: " + resultado);
    }

    private static void inputFatorial() {
        System.out.println("Digite o valor para encontrar o seu fatorial: ");
        int numero = sc.nextInt();
        int resultado = Calculadora.fatorial(numero);
        System.out.println("O resultado é: " + resultado);
    }

    private static void menuArea() {

        while (true) {
            System.out.println("#####--Menu Área--#####\n");
            System.out.println("|---------------------|");
            System.out.println("| Opção 1 - Circulo   |");
            System.out.println("| Opção 2 - Triangulo |");
            System.out.println("| Opção 3 - Quadrado  |");
            System.out.println("| Opção 4 - Retangulo |");
            System.out.println("| Opção 5 - Retornar  |");
            System.out.println("|---------------------|");
            System.out.println("Digite uma opção: ");

            int opc = sc.nextInt();

            switch (opc) {
                case 1:
                    inputCirculo();
                    break;
                case 2:
                    inputTriangulo();
                    break;
                case 3:
                    inputQuadrado();
                    break;
                case 4:
                    inputRetangulo();
                case 5:
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }

    }

    private static void inputRetangulo() {
        System.out.println("Digite o comprimento do retângulo");
        double comprimento = sc.nextDouble();
        System.out.println("Digite a largura do retângulo");
        double largura = sc.nextDouble();
        double resultado = Calculadora.retangulo(comprimento, largura);
        System.out.println("A área do retângulo é " + resultado);
    }

    private static void inputQuadrado() {
        System.out.println("Digite o valor do lado do quadrado");
        double lado = sc.nextDouble();
        double resultado = Calculadora.quadrado(lado);
        System.out.println("O valor da área do quadrado é " + resultado);
    }

    private static void inputTriangulo() {
        System.out.println("Digite o valor da base do triângulo");
        double base = sc.nextDouble();
        System.out.println("Digite o valor da altura do triângulo");
        double altura = sc.nextDouble();
        double resultado = Calculadora.triangulo(base, altura);
        System.out.println("O valor da área do triângulo é " + resultado);
    }

    private static void inputCirculo() {
        System.out.println("Digite o raio do circulo: ");
        double raio = sc.nextDouble();
        double resultado = Calculadora.circulo(raio);
        System.out.println("O valor da área do circulo é " + resultado);
    }

    private static void menuCalcular() {

        System.out.println("Digite o primeiro valor: ");
        double valor1 = sc.nextDouble();

        System.out.println("Digite o operador (+ , - , /, *)");
        char operador = sc.next().charAt(0);

        System.out.println("Digite o segundo valor: ");
        double valor2 = sc.nextDouble();

        System.out.println(valor1 + " " + operador + " " + valor2 + " = " + Calculadora.calcular(valor1, valor2, operador));


    }
}
