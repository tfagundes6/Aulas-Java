package interfaces;

public class Gerente extends Funcionario implements AutenticaSenha{

	
	private final String senha = "121185";
	private double bonificacao;
	
	
	@Override
	public double calculaSalario(double salario, double valor) {
		
		return salario + bonificacao;
	}


	public String getSenha() {
		return senha;
	}

	public double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}

	@Override
	public boolean autenticaAcesso(String senha) {
		
		if(senha.equalsIgnoreCase(this.senha)) {
			return true;
		}

	return false;
		
		
	}
	
	

}
