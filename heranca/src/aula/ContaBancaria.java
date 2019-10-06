package aula;

public class ContaBancaria {
	private String titular;
	private double saldo;
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
	
	public void saque(double valor) {
		this.saldo -= valor;
	}
	

}
