package entities;

public class Funcionario {

	private Integer id;
	private String nome;
	private Double salario;

	public Funcionario(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Funcionario() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void aumentarSalario(double percent) {
		this.salario += (this.salario * percent / 100);
	}

	@Override
	public String toString() {
		return id + ", " + nome + ", R$" + String.format("%.2f", salario);
	}

}
