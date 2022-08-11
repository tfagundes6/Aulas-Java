package recursividade;

public class Exemplos {

	public static void main(String[] args) {
		
		
		    System.out.println("Inicio do programa.");
		    Exemplos exple = new Exemplos();
		    System.out.println(exple.imprimirRecursivo(5));
		    System.out.println("Fim do programa.");
		    System.out.println(fatorial(3));
		    
			/*
			 * for (int i = 0; i < 1; i++) { System.out.println("Fatorial de " + i + "=" +
			 * fatorial(i)); }
			 */
		    
		    
		    
		  }	

	
	private static int fatorial(int n){
		
		if(n==1)
			return n;
		return fatorial(n-1)*n;
		
	}

		  private int imprimirRecursivo(int x) {
		    if(x == 0)
		      return 0;

		    if(x % 2 == 0)
		      return x + imprimirRecursivo(x - 1);

		    return imprimirRecursivo(x - 1);
		  }
		
		

	}


