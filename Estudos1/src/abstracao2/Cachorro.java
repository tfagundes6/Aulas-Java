package abstracao2;

public class Cachorro extends Mamifero{

	
	private String tamanho;
	private String raca;
	private final String som = "AuAu";
	
	
	
	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	@Override
	public String amamentar() {
		String retorno = "Sou um Cachorro, vou amametar";
		return retorno;
	}

	@Override
	public String emitirSom() {
		return som;
	}

}
