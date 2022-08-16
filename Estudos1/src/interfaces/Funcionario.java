package interfaces;

public abstract class Funcionario {
	
	private int id;
	private String nome;
	private double salario;
	
	
	public abstract double calculaSalario(double salario, double qtdeHoras);
		
	
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
