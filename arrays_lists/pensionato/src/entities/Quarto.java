package entities;

public class Quarto {

	private Pessoa pessoa;
	private int numero;

	public Quarto(Pessoa pessoa, int numero) {
		this.pessoa = pessoa;
		this.numero = numero;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return numero + ": " + pessoa;
	}

}
