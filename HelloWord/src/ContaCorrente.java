
public class ContaCorrente extends ContaBancaria {

	public ContaCorrente(String nome, int conta) {
		super(nome, conta);
	}
	
	public void saque(double valor) {
		super.saldo -= (valor+0.1);
	}
	
	public String getTipo() {
		return  "Conta Corrente";
	}




}
