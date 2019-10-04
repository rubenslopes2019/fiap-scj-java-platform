
public class Controles {
	public static void main(String[] args) {
		int x = 0;
		while(x  <= 10) {
			System.out.println(x);
			x++;
			if(x == 7) {
				break;
			}
		}
		
		if(x == 0) {
			System.out.println("x é igual a 0");
		} else {
			System.out.println("x é diferente de 0");
		}
		
	}
}
