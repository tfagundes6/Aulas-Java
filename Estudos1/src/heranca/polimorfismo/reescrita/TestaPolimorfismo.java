package heranca.polimorfismo.reescrita;

public class TestaPolimorfismo {
	public static void main (String args[]) {
		
		ControleBonificacoes controleBonificacoes = new ControleBonificacoes();
		
		Gerente funcionario1 = new Gerente();
		funcionario1.setSalario(500);
		controleBonificacoes.registra(funcionario1);
	
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setSalario(200);
		controleBonificacoes.registra(funcionario2);
	
		
		System.out.println(controleBonificacoes.retornaBonificacoes());
	}

}
