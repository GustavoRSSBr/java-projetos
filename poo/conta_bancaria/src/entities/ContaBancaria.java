package entities;

public class ContaBancaria {
	private int numConta;
	private String nome;
	private double saldo;

	public ContaBancaria(int numConta, String nome) {
		this.numConta = numConta;
		this.nome = nome;
	}

	public ContaBancaria(int numConta, String nome, double valor) {
		super();
		this.numConta = numConta;
		this.nome = nome;
		depositar(valor);
	}

	public int getNumConta() {
		return numConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void sacar(double valor) {
		this.saldo -= (valor + 5.00);
	}

	public void exibir() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Conta = " + numConta + ", Nome = " + nome + ", Saldo = $ " + String.format("%.2f", saldo);
	}

}
