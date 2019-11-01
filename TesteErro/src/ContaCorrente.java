import java.time.LocalDate;

public class ContaCorrente {
	
	private String nome;
	private String endereco;
	private String cpf;
	LocalDate dataNascimento;
	
	public ContaCorrente(String nome, String endereco, String cpf, LocalDate dataNascimento) {
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}
	
	public boolean  equals(Object obj) {
		ContaCorrente conta = (ContaCorrente) obj;
		return (conta.cpf.equals(this.cpf));
		
	}

	private double saldo;

	public void deposita(double valor) {
		this.saldo += valor;

	}

	public double getSaldo() {
		return this.saldo;
	}

	public void saca(double valor) throws SaldoInsuficiente {
		if (this.saldo < valor) {
			throw new SaldoInsuficiente("saldo insuficiente para saque");
		}
		this.saldo -= valor;
	}

}
