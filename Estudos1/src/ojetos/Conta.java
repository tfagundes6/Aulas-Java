package ojetos;

public class Conta {
	
	public Integer numeroConta;
	public Cliente cliente = new Cliente();
	public double saldo;
	public double limite;
	
	
	public void sacar(double valor) {
		saldo = getSaldo() - valor;
	}
	
	public void depositar(double valor) {
		saldo = getSaldo() + valor;
	}
	
	
	
	public Integer getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
}
