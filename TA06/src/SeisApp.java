import javax.swing.JOptionPane;

public class SeisApp {

	public static void main(String[] args) {
		String num = JOptionPane.showInputDialog(null,"Introduce un número entero positivo para averiguar su número de caracteres");
		
		if(Integer.parseInt(num) < 1) {
			JOptionPane.showMessageDialog(null, "No has introducido un número entero positivo!");
		}else {
			int  nCifras = numeroCifras(num);
			JOptionPane.showMessageDialog(null, num+" tiene "+nCifras+" cifras");			
		}
	}
	
	public static int numeroCifras(String num) {
		return num.length();
	}

}
