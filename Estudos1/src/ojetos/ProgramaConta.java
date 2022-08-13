package ojetos;

public class ProgramaConta {

	public static void main(String[] args) {
		
		Conta ct1 = new Conta();
		
		
		//Nova Conta 
		
		Conta ct2 = new Conta();
		
		ct2.setSaldo(1000);
		ct2.setLimite(15.000);
		ct2.setNumeroConta(12);
		ct2.getCliente().setIdCliente(1);
		ct2.getCliente().setNomeCliente("Thiago Fagundes Ataides");
		
		
		
		ct1.setSaldo(1500.000);
		ct1.setLimite(15.000);
		ct1.setNumeroConta(11);
		ct1.getCliente().setIdCliente(1);
		ct1.getCliente().setNomeCliente("Thiago Fagundes Ataides");
		
		System.out.println("Cliente: " + ct1.getCliente().getNomeCliente());
		System.out.println("Conta: " + ct1.getNumeroConta());
		System.out.println("Saldo: " + ct1.getSaldo());
		System.out.println("Limite: " + ct1.getLimite());
		
		//Vamos sacar
		ct1.sacar(1000);
		System.out.println("Novo saldo: " + ct1.getSaldo());
		
		//Vamos Depositar
		ct1.depositar(300);
		System.out.println("Novo saldo: " + ct1.getSaldo());
		
		//Pode sacar?
		
		if(ct1.podeSacar(1500)) {
			System.out.println("Novo Saldo: " + ct1.getSaldo());
		}else {
			System.out.println("Saldo Insuiciente");
		}
	
		
	}

}
