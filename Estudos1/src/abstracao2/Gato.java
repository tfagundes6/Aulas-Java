package abstracao2;

public class Gato extends Mamifero {

	private final String som = "Miua";
	
	@Override
	public String amamentar() {
		String retorno = "Sou um gato, vou amamentar gatinhos";
		return retorno;
	}

	@Override
	public String emitirSom() {
		return som;
	}

	
	
}
