
public abstract class ContaBancaria {
	private String titular;
	protected double saldo;
	private String Tipo;
	private String conta;	
	private int numero;
	
	public ContaBancaria(String nome, int conta) {
		this.titular = nome;
		this.numero = conta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public abstract void saque(double valor);

	public abstract String getTipo();

	public String getConta() {
		return conta;
	}

	public String getTitular() {
		return titular;
	}
	
	
	
	

}
