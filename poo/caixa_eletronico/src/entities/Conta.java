package entities;

public class Conta {

	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		if (valor < 0) {
			System.out.println("Valor Inválido");
		} else {
			saldo += valor;
		}

		System.out.println();
	}

	public void sacar(double valor) {
		if (valor < 0) {
			System.out.println("Valor Inválido");
		} else if (valor <= saldo) {
			saldo -= valor;
		} else {
			System.out.println("\nSaldo insuficiente!");
		}
		System.out.println();
	}

	@Override
	public String toString() {
		return "O saldo atual da conta é R$: " + String.format("%.2f", saldo);
	}

}
