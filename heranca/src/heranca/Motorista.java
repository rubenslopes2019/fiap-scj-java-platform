package heranca;

public class Motorista extends Funcionario {
	
	int habilitacao;
	
	
	Motorista(int XNumero, String Xnome){
		super(XNumero, Xnome);
		System.out.println("criando motorista");
	}
	
	Motorista(){
		
	}
	
	void dirige() {
		System.out.println("motorista dirige");
	}
	
	@Override
	void trabalha() {
		System.out.println("Motorista que trabalha");
	}
	
	public int getBonificacao() {
		return 60;
	}

}
