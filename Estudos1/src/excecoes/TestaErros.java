package excecoes;

public class TestaErros {

	public static void main(String[] args) {
		try {
			int valor = 100;
			valor = valor / 0;

			System.out.println(valor);
			
		} catch (Exception e) {
			System.out.println(e.getCause() + e.getMessage());
			//Tratando melhor a msg para o usuario
			System.out.println("Não é possível dividir por Zero");
		}
		
	}

}
