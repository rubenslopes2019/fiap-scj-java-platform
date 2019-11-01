public class TesteErro {

	public static void main(String[] args) {
		System.out.println("inicio main");
		try {
			metodo1();		
		} catch(NullPointerException e) {
			System.out.println("teve um erro");
		}

		System.out.println("fim main");
	}

	private static void metodo1() {
		System.out.println("inicio metodo1");
		metodo2();
		System.out.println("fim metodo1");
	}

	private static void metodo2() {
		System.out.println("inicio metodo2");
		ContaCorrente cc = new ContaCorrente();
		
		
//		try {
			for (int i = 0; i <= 15; i++) {
				cc.deposita(i + 1000);
				System.out.println(cc.getSaldo());
				if (i == 5) {
					cc = null;
				}
			}
//		} catch (NullPointerException e) {
//			System.out.println("erro: " + e);
//		}

		System.out.println("fim do metodo2");
	}
}
