package heranca;

public class Diretor extends Funcionario implements Autenticavel {

	private String senha ="123";
	
	@Override
	public int getBonificacao() {
		return 0;
	}

	public boolean autentica(String senha) {
		if(this.senha != senha) {
			return false;
		}
		return true;
	}

}
