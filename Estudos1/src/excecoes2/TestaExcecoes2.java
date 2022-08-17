package excecoes2;

public class TestaExcecoes2 {
	
	public static double saldo = 500;
	
	
	public static void sacar(double valor) {
		if(saldo < valor) {
			throw new SaldoInsuficienteException("Saldo Insuficiente");
		}else {
			saldo = saldo - valor;
			System.out.println("Valor sacado: " + valor);
			System.out.println("Saldo Atual: " + saldo);
		}	
	}
	
	
	public  static void main(String args[]) {
		try {
			sacar(600);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Finally sempre será executada!");
		}
		
		
		
	}

}
