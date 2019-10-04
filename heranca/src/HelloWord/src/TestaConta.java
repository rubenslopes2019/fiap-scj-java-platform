
public class TestaConta {
	
	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria("jose", 11212);
		ContaBancaria c2 = new ContaBancaria("Paulo", 65656);
		c1.deposita(99);
		c1.saque(30);
		System.out.println(c1.getSaldo());
		c2.deposita(978);
		c2.saque(50);
		System.out.println(c2.getSaldo());
		
	}

}
