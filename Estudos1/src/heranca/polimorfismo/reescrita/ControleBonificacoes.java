package heranca.polimorfismo.reescrita;

public class ControleBonificacoes {
	
	private double quantidadeBonificacoes;
	
	public void registra(Funcionario funcionario) {
		this.quantidadeBonificacoes += funcionario.bonificacao();
	}

	public double retornaBonificacoes() {
		return this.quantidadeBonificacoes;
	}
	
}
