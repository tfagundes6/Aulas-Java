package polimorfismo;

public class TestaFaculdade {

	public static void main(String[] args) {
		
		GeradorRelatorio relatorio = new GeradorRelatorio();
		Professor professor = new Professor();
		professor.setNome("Thiago");
		professor.setSalario(500);
		professor.setHorasAulas(100);
		
		
		relatorio.adiciona(professor);
		

	}

}
