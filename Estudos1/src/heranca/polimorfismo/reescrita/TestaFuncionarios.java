package heranca.polimorfismo.reescrita;

public class TestaFuncionarios {
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		Funcionario funcionario = new Funcionario();
		
		gerente.setNome("Thiago");
		gerente.setSenha(12345);
		gerente.setSalario(500);
		
		funcionario.setSalario(500);
		
		
		
		gerente.autenticaSenha(12345);
		
		System.out.println(gerente.getNome());
		System.out.println("Salario Gerente " + gerente.bonificacao());
		System.out.println("Salario Funcionario " + funcionario.bonificacao());
	}

}
