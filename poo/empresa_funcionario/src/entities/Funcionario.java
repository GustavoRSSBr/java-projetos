package entities;

public class Funcionario {

	private String nome;
	private Integer horasTrabalhadas;
	private Double valorHora;

	public Funcionario() {
	}

	public Funcionario(String nome, Integer horasTrabalhadas, Double valorHora) {
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(Integer horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}

	public Double pagamento() {
		return horasTrabalhadas * valorHora;
	}

}
