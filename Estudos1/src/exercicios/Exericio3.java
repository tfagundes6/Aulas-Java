package exercicios;

public class Exericio3 {

	public static void main(String[] args) {
		// Imprima todos os múltiplos de 3, entre 1 e 100.
		
		int i = 1;
	
		while(i <= 100) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
			i = i +1;
		}
	}

}
