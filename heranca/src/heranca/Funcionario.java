package heranca;

public abstract class Funcionario {
	
	int numero;
	String nome;
	
	
	Funcionario(){
		
	}
	Funcionario(int numero, String xnome){
		this.numero = numero;
		nome = xnome;
		System.out.println("criando funcionario");
	}
	
	void trabalha(){
		System.out.println("funcionario que trabalha");
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
//	int getBonificaca() {
//		return 10;
//	}
	
	public abstract int getBonificacao();



	
}
