
public class IfeElse {

	public static void main(String[] args) {

		int idade1 = 15;
		
		if(idade1 < 18) {
			System.out.println("Menor de Idade");
		}else {
			System.out.println("Pode Entrar");
		}
		
		/**
		 * Operadores Lógicos
		
		 E represenda && 
		 OU reresenta ||
		 
		 sendo 0 == false;
		 	   1 == true;
		 
		 Então :
		 
		 	AND = as duas entradas tem que ser verdadeiras para a saída seja V
		 	OR = pelo uma das saídas da entrada tem quer ser vedadeira para sair V	
		 	XOR = Se ambas entradas forem iguais a saída sempres será F	
		 
		 TABELA
		 
		 AND
		 
		 X	Y 	RESULT
		 F	F	F
		 F	V	F	
		 V	F	F
		 V	V	V
		 
		 OR
		 
		 X	Y 	RESULT
		 F	F	F
		 F	V	V	
		 V	F	V
		 V	V	V
		 
		 
		 */
		
		int idade = 15;
		boolean amigoDono = false;

		if(idade < 18 && amigoDono) {
			System.out.println("Não entrar");
		}else {
			System.out.println("Pode entrar");
		}
		
		/*
		 * if(idade < 18 || amigoDono) { System.out.println("Não Entra"); }else {
		 * System.out.println("Pode entrar"); }
		 */

		if(idade < 18 || amigoDono) {
			System.out.println("Entrar");
		}else {
			System.out.println("N Entrar");
		}
		
		
	}

}
