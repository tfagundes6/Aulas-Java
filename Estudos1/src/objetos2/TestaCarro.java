package objetos2;

public class TestaCarro {

	public static void main(String[] args) {
		
		Carro meuCarro = new Carro();
		
		meuCarro.cor = "Preto";
		meuCarro.modelo = "Fusca";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;
		meuCarro.motor.potencia = 1000;
	
		
		meuCarro.liga();
		meuCarro.acelera(30);
		System.out.println("Velocidade Atual: " + meuCarro.velocidadeAtual);
		System.out.println("Minha Potencia: " + meuCarro.motor.potencia);
		
		

	}

}
