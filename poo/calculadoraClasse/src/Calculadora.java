public class Calculadora {

    private static final char SOMA = '+';
    private static final char SUBTRACAO = '-';
    private static final char DIVISAO = '/';
    private static final char MULTIPLICACAO = '*';


    public static double calcular(double valor1, double valor2, char operador) {

        switch (operador) {
            case SOMA:
                return somar(valor1, valor2);

            case SUBTRACAO:
                return subtrair(valor1, valor2);

            case DIVISAO:
                if (valor2 == 0) {
                    throw new ArithmeticException("Não é possível dividir por zero");
                }
                return dividir(valor1, valor2);

            case MULTIPLICACAO:
                return multiplicar(valor1, valor2);

            default:
                throw new IllegalArgumentException("Operador inválido");
        }
    }

    private static double multiplicar(double valor1, double valor2) {
        return valor1 * valor2;
    }

    private static double dividir(double valor1, double valor2) {
        return valor1 / valor2;
    }

    private static double subtrair(double valor1, double valor2) {
        return valor1 - valor2;
    }

    private static double somar(double valor1, double valor2) {
        return valor1 + valor2;
    }

    public static double circulo(double raio) {
        return 3.14 * Math.pow(raio, 2);
    }

    public static double triangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double quadrado(double lado) {

        return lado * lado;
    }

    public static double retangulo(double comprimento, double largura) {
        return comprimento * largura;
    }

    public static int fatorial(int fatorial) {
        if (fatorial == 0) {
            return 1;
        }
        return fatorial * fatorial(fatorial - 1);
    }

    public static double raiz(double numero) {
        return Math.sqrt(numero);
    }

    public static double potencia(double numero, double elevado) {
        return Math.pow(numero, elevado);
    }
}
