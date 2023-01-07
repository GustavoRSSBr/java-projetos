package entities;

public class Aluno {

	private String nome;
	private double[] notas = new double[2];

	public Aluno(String nome, double[] notas) {
		this.nome = nome;
		this.notas = notas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double media() {
		return (notas[0] + notas[1]) / 2;
	}

}
