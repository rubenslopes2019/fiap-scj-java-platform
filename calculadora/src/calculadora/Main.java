package calculadora;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		 Calculadora calculadora = new Calculadora();
		 float op1,op2;
		
		 op1=Float.valueOf(JOptionPane.showInputDialog("Entre com o operador 1"));
		 op2=Float.valueOf(JOptionPane.showInputDialog("Entre com o operador 2"));
		
		
		 System.out.println("Divis�o "+calculadora.dividir(op1, op2));
		 System.out.println("Multiplica��o "+calculadora.multiplicar(op1, op2));
		 System.out.println("Adi��o "+calculadora.somar(op1, op2));
		 System.out.println("Subtra��o "+calculadora.subtrair(op1, op2));
 }
}