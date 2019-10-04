package heranca;

public class ControleBonificacao {
	
	private int totalBonificacao = 0;
	
	void registra(Funcionario f) {
		totalBonificacao += f.getBonificacao();
		
	}
	
	int getTotalBonificacao() {
		return totalBonificacao;
	}

}
