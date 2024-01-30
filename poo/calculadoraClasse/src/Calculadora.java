public class Calculadora {
    public static double calcular(double valor1, double valor2, char operador) {

        switch (operador) {
            case '+':
                return somar(valor1, valor2);

            case '-':
                return subtrair(valor1, valor2);

            case '/':
                if (valor2 == 0) {
                    throw new ArithmeticException("Não é possível dividir por zero");
                }
                return dividir(valor1, valor2);

            case '*':
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
}
