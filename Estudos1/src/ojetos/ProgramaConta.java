package ojetos;

public class ProgramaConta {

	public static void main(String[] args) {
		
		Conta ct = new Conta();
		
		ct.setSaldo(1500.000);
		ct.setLimite(15.000);
		ct.setNumeroConta(954215);
		ct.getCliente().setIdCliente(1);
		ct.getCliente().setNomeCliente("Thiago Fagundes Ataides");
		
		System.out.println("Cliente: " + ct.getCliente().getNomeCliente());
		System.out.println("Conta: " + ct.getNumeroConta());
		System.out.println("Saldo: " + ct.getSaldo());
		System.out.println("Limite: " + ct.getLimite());
		
		//Vamos sacar
		ct.sacar(1000);
		System.out.println("Novo saldo: " + ct.getSaldo());
		
		//Vamos Depositar
		ct.depositar(300);
		System.out.println("Novo saldo: " + ct.getSaldo());
	}

}
