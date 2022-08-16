package interfaces;

public class TestaInterface {
	public static void main(String args[]) {
		
		Gerente gerente = new Gerente();
		gerente.setNome("Thiago");
		gerente.setId(123);
		gerente.setBonificacao(500);
		gerente.setSalario(5000);
		
		System.out.println(gerente.calculaSalario(gerente.getSalario(), gerente.getBonificacao()));
		
		if(gerente.autenticaAcesso("121185")) {
			System.out.println("Logado");
		}else {
			System.out.println("Senha Inválida");
		}
		
		Professor prof = new Professor();
		prof.setHorasAula(45);
		prof.setSalario(2500);
		
		System.out.println("Salario Total Professor " +prof.calculaSalario(prof.getSalario(), prof.getHorasAula()));
		
		
	}

}
