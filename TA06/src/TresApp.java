import javax.swing.JOptionPane;

public class TresApp {
	public static boolean primo = true;

	public static void main(String[] args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce un número para averiguar si es primo:"));
		  primo = esPrimo(num); 
		  if(primo) {
			  JOptionPane.showMessageDialog(null,num+ " es un número primo");
		  }else {
			  JOptionPane.showMessageDialog(null,num+ " no es un número primo");
		  }
	}
	
	public static boolean esPrimo (int num) {
		for (int i = 1; i <= num ; i++) {
			if(i != num && i != 1 && num % i == 0) {
				primo = false;
				break;
			}
		}	
		return primo;
	}
}
