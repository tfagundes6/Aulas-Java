package interfaces;

public class Professor extends Funcionario{
	
	
	
	private double horasAula;
	private final double valorHora = 50;
	
	
	@Override
	public double calculaSalario(double salario, double qtdeHoras) {
		return salario + (qtdeHoras * this.valorHora);
	}
	
	
	
	
	public double getHorasAula() {
		return horasAula;
	}
	public void setHorasAula(double horasAula) {
		this.horasAula = horasAula;
	}

	
	

	
	
}
