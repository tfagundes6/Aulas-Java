package qualificadorAcesso;

public class Casse2 {
	public static void main(String[] args) {
	
		
	Classe1 c = new Classe1();
	
	 /**
	  * Podemos observar que não conseguimos chamar o nome da classe 1
	  * com os getteres e setteres conseguimos chamar
	  */
	
	c.setSobreNome("Fagundes");
	System.out.println(c.getSobreNome());
	
	
	}
}
