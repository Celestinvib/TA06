import javax.swing.JOptionPane;

public class CuatroApp {

	public static void main(String[] args) {
		int num =Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce un número para calcular el vectorial:"));
		int factorial = calcularFactorial(num);
		
		JOptionPane.showMessageDialog(null, "El factorial de "+num+" es "+ factorial);
	}
	
	public static int calcularFactorial(int num) {
		int r=1;
		for (int i = 1; i <= num; i++) {
			r *= i;
		}
		return r;
	}

}
