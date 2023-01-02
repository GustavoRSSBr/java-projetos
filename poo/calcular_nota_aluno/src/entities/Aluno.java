package entities;

public class Aluno {

	public String nome;
	public double nota;

	public void adicionarNota(double nota) {
		this.nota += nota;
	}

	public void validarNota() {
		if (nota >= 60) {
			System.out.println("Nota final: " + nota);
			System.out.println("Aprovado!");
		} else {
			System.out.println("Nota final: " + nota);
			System.out.println("Reprovado!");
			System.out.println("Faltou: " + (60 - nota) + " para ser aprovado");
		}
	}
}
