package abstracao2;

public class TestaManiferos {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		dog.setNome("Thor");
		dog.setRaca("Pit bull");
		dog.setTamanho("Grande");
		
		System.out.println(dog.amamentar());
		System.out.println(dog.emitirSom());

		Gato cat = new Gato();
		
		cat.setNome("Pandora");
		
		System.out.println(cat.amamentar());
		System.out.println(cat.emitirSom());
		
		
	}

}
