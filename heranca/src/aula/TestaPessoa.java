package aula;

public class TestaPessoa {

	public static void main(String[] args) {
		Pessoa p1  = new Pessoa("João", 15);
		Pessoa p2  = new Pessoa("Paulo", 33);
		Pessoa p3  = new Pessoa("Daniel", 33);
		p1.caminha();
		System.out.println(p2.getIdentificador());
	}
}
