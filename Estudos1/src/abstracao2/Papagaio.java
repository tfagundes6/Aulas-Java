package abstracao2;

public class Papagaio extends Ave{

	private final String som = "Olá Louro";
	
	@Override
	public String voar() {
		String retorno = "Sou uma Ave, vou voar";
		return retorno;
	}

	@Override
	public String emitirSom() {
		return som;
	}

}
