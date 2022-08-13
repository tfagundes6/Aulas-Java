package heranca.polimorfismo.reescrita;

public class Gerente extends Funcionario{
	
	private int senha;
	private int numeroFuncionariosGerenciados;
	
	public boolean autenticaSenha(int senha) {
		
		if(this.senha == senha) {
			System.out.println("Asso liberado");
			return true;
		}else {
			System.out.println("Acesso Bloqueado");
			return false;
		}
		
	}
	
	@Override
	public double bonificacao() {
		return this.getSalario() + this.getSalario()* 0.15;
	}
	
	
	

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumeroFuncionariosGerenciados() {
		return numeroFuncionariosGerenciados;
	}

	public void setNumeroFuncionariosGerenciados(int numeroFuncionariosGerenciados) {
		this.numeroFuncionariosGerenciados = numeroFuncionariosGerenciados;
	}

	

}
