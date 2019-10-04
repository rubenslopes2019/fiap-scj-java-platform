package heranca;

public class Teste {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		f1.setNome("paulo");
		f1.setNumero(1232);
		
		Funcionario[] arrayFunc = new Funcionario[3];
		arrayFunc[0] =  f1;
		arrayFunc[1] = new Funcionario(5656,"Pepe");
		arrayFunc[2] = new Motorista(5656, "Satan");
		
		
		System.out.println(arrayFunc[0].getNome());
		System.out.println(arrayFunc[1].getNome());
		System.out.println(arrayFunc[2].getNome());
		
		
		arrayFunc[0].trabalha();
		arrayFunc[1].trabalha();
		arrayFunc[2].trabalha();
		
		//((Motorista) arrayFunc[2]).dirige();
		
		
		ControleBonificacao cb = new ControleBonificacao();
		cb.registra(f1);
		cb.registra(arrayFunc[2]);
		
		System.out.println(cb.getTotalBonificacao());
		
		
		
		
		
//		Funcionario m1 = new Funcionario();
//		m1.setNome("paulo");
//		m1.setNumero(1232);
//		m1.trabalha();
//		System.out.println(m1.getNome());
//		
//		Motorista m2 = new Motorista();
//		m2.setNome("joao");
//		m2.setNumero(1232);
//		m2.trabalha();
//		System.out.println(m2.getNome());
//		
//		Funcionario f2 = new Funcionario(45454,"Maria");
//		System.out.println(f2.getNome());
//		
//		Motorista m3 = new Motorista(45664,"jose");
//		System.out.println(m3.getNome());
	}

}
