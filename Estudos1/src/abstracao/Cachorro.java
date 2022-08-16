package abstracao;

public class Cachorro extends Animal{
	
	private String raca;
	private String tamanho;
	private final String som = "AuAu";
	

	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	@Override
	public String emitirSom() {
		
		return som;
	}
	

}
