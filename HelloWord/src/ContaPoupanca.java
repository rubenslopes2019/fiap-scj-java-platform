
public class ContaPoupanca extends ContaBancaria {

	public ContaPoupanca(String nome, int conta) {
		super(nome, conta);
	}
	
	public void saque(double valor) {
		super.saldo -= (valor);
	}
	
	public String getTipo() {
		return "Conta Poupança";
	}

}
