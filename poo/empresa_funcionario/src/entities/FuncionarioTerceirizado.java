package entities;

public class FuncionarioTerceirizado extends Funcionario {

	private Double despesaAdicional;

	public FuncionarioTerceirizado() {
		super();
	}

	public FuncionarioTerceirizado(String nome, Integer horasTrabalhadas, Double valorHora, Double despesaAdicional) {
		super(nome, horasTrabalhadas, valorHora);
		this.despesaAdicional = despesaAdicional;
	}

	public Double getDespesaAdicional() {
		return despesaAdicional;
	}

	public void setDespesaAdicional(Double despesaAdicional) {
		this.despesaAdicional = despesaAdicional;
	}

	@Override
	public final Double pagamento() {
		return super.pagamento() + despesaAdicional * 1.1;
	}

}
