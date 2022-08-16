package abstracao2;

public class TestaAves {

	public static void main(String[] args) {
		
		Papagaio papa = new Papagaio();
		
		papa.setNome("Louro");
		
		System.out.println(papa.voar());
		System.out.println(papa.emitirSom());

	}

}
