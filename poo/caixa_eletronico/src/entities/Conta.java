package entities;

public class Conta {

	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public String toString() {
		return "O saldo atual da conta é R$: " + String.format("%.2f", saldo);
	}

}
