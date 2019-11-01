
public class ContaCorrente {

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
