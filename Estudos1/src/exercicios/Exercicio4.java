package exercicios;

public class Exercicio4 {

	public static void main(String[] args) {

		//Imprima os fatoriais de 1 a 10.
		
		int result = 1;
		int fatorial = 10;
		
		for (int n = 1; n <= fatorial; n++) {
			result*=n;
			System.out.println("fatorial de " + n + " é: " + result);

		}
	}

}
