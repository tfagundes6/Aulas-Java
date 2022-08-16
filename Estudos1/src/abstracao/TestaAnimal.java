package abstracao;

public class TestaAnimal {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		dog.setNome("Borris");
		dog.setRaca("Labrador");
		
		System.out.println(dog.emitirSom());
		
		
	}

}
