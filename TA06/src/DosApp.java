import javax.swing.JOptionPane;

public class DosApp {

	public static void main(String[] args) {
		 int numeros =Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantos n�meros aleatorios quieres generar:"));
		 int rangoMax= Integer.parseInt(JOptionPane.showInputDialog(null,"N�mero m�ximo del rango:"));
		 int rangoMin = Integer.parseInt(JOptionPane.showInputDialog(null,"N�mero m�nimo del rango:"));	
		 for (int i = 0; i <= numeros; i++) {
			System.out.println(randomNumber(rangoMax, rangoMin));
		}
	}
	
	public static int randomNumber(int rangoMax, int rangoMin) {
		 return (int)((Math.random() * ((rangoMax+1) - rangoMin)) + rangoMin);
	}
	
	

}
