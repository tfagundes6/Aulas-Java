package singletonExemple;

public class AcessoBanco {
	
	private static AcessoBanco instanceBd;
	
	private AcessoBanco() { 
		
		final String URL = "198.155.0.0.0.0";
		final String password = "123";
		
	} 
	
	public static synchronized AcessoBanco getInstance() {
		
		if(instanceBd == null) {
			instanceBd = new AcessoBanco();
			System.out.println("Vamos ao Banco de dados!!!");
			//syso - atalho!
			
			System.out.println("Singleton Baby");
		}
		
		return instanceBd;
		
	}

}
