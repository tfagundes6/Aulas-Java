package composicao2;

public class TestaConta {
	public static void main(String args[]) {
		
		Conta conta1 = new Conta();
		
		
		conta1.setAgencia(6931);
		conta1.setNumero(799);
		conta1.setLimite(0);
		conta1.setSaldo(500);
		conta1.getCliente().setCpf("350.185.788-82");
		conta1.getCliente().setNome("Thiago Fagundes Ataides");
		
		System.out.println("Conta " + conta1.getNumero() + " Cliente: " + conta1.getCliente().getNome() );
		
	}

}
