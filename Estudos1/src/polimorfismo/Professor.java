package polimorfismo;

public class Professor extends EmpregadoFaculdade{
	
	private int horasAulas;
	
	@Override
	public double getGastos() {
		return this.getSalario() + this.horasAulas * 10;
	}

	public String getInfo() {
		String infoBasica = super.getInfo();
		String info  = infoBasica + " Horas Aula " + this.horasAulas;
		
		return info;
	}

	public int getHorasAulas() {
		return horasAulas;
	}

	public void setHorasAulas(int horasAulas) {
		this.horasAulas = horasAulas;
	}
	
	
	
}
