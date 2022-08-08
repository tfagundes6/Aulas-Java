package basico;

public class Estudo1 {

	public static void main(String[] args) {
		
		
		/*
		 * VARIAVEIS E TIPOS PRIMITIVOS 
		 */
		
		int idade;
		idade = 15;
		
		// Calcular idade no ano seguinte
		
		idade = idade +1;
		
		System.out.println(idade);
	
		//Operadores 
		
		int quatro = 2+2;
		int cinco = 4-1;
		int oito = 4*2;
		int dois = 8/4;
		int um = 5%2;
		
		System.out.println(quatro);
		System.out.println(cinco);
		System.out.println(oito);
		System.out.println(dois);
		System.out.println(um);
		
		// Tipo double 
		
		double pi = 3.14;
		double a = 5*2;
		
		
		//Boolean
		
		boolean verdade = true;
		boolean mentira = false;
		
		
		idade = 15;
		boolean menorIdade = idade < 18;
		
		System.out.println(menorIdade);
		
		// Tipo Char
		
		char letra = 'a';
		
		System.out.println(letra);
		
		double mes1 = 15.000;
		double mes2 = 23.000;
		double mes3 = 17.000;
		
		double media = (mes1 + mes2 + mes3) /3;
		double soma = mes1 + mes2 + mes3;
		
		System.out.println("Soma " + soma);
		System.out.println("Media " + media);
		
		/**
		 * Casting
		 */
		
		double aa = 1;
		
		// Pq não compila? Entrar com exemplos!
		//int bb = 1.1;
		
		double a3 = 3.14;
		int b2 = (int)a3;
		
		System.out.println(b2);
		
		// Note o valor de b2!
		
		long l1 = 10000002;
		int i1 = (int) l1;
		System.out.println(i1);
		
		// não compila
		//float x = 0.0;
		
		float x = 0.0f;
		
		//outros casos
		
		double d = 5;
		float f = 3;
		
		float f2 = (float) (f + d);
		// ou
		f2 = f + (float)d;
		
	}

		
	
	
	
	
	
	
	

}
