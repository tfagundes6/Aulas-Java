
public class For {

	public static void main(String[] args) {
		
		/*
		 * Outro comando de loop extremamente utilizado é o for . A ideia é a mesma
		 *  do while : fazer um trecho de código ser repetido, enquanto uma condição
		 *   continuar verdadeira. Mas, além disso, o for isola também um espaço 
		 *   para inicialização de variáveis e o modificador dessas variáveis. 
		 *   Isso faz com que as variáveis relacionadas ao loop fiquem mais legíveis:
		 * 	
		 * for (inicializacao; condicao; incremento) {
		 * 			codigo;
		 * 
		 */
				
		for (int j = 0; j < 10; j++) {
			//System.out.println("J " + j);
		}
		
		//a mesma coisa no while
		
		int i = 0;
		while(i < 10) {
			//System.out.println("I " + i);
			i = i+1;
		}
		
		/*
		 * CONTROLANDO LOOPS
		 */
		
		
		int x = 100; 
		int y = 1000;
		
		for(int i1 = x; i1 < y; i1++) {
			if(i1 % 19 == 0) {
				System.out.println("Achei um número divisível por 19 entre x e y");
				break;
			}
		}
		
		for (int i1 = 0; i1 < 100; i1++) {
			if (i1 > 50 && i1 < 60) {
			continue;
			}
			System.out.println(i1);
			}
		
		
	}

}
