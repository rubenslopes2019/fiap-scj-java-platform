
public class Pessoa {
	private String nome;
	private int idade;
	private double peso;
	private static int identificador;
	
	/// construtor default
	public Pessoa(String nome) {
		this.nome = nome;
		identificador++;
	}
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		identificador++;
	}
	
	
	public static int getIdentificador() {
		return identificador;
	}

	public static void setIdentificador(int identificador) {
		Pessoa.identificador = identificador;
	}

	void caminha() {
		System.out.println("pessoa está caminhado");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	

	
}
