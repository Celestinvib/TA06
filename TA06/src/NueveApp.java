import javax.swing.JOptionPane;

public class NueveApp {

	public static void main(String[] args) {
		
		int tamany = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el tamaño de la array"));
		int numeros[] = new int[tamany];	
		
		rellenarArray(numeros, 0, 9);
		mostrarResultados(numeros);
	}
	
	public static int[] rellenarArray (int numeros[], int rangoMin, int rangoMax) {
		
		for (int i = 0; i < numeros.length; i++) {
			 numeros[i] = (int)((Math.random() * ((rangoMax+1) - rangoMin)) + rangoMin);
		}
		return numeros;
	}

	public static void mostrarResultados (int numeros[]) {
		int suma = 0;
		System.out.println("\nArray numeros:");
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]);
			if(i != numeros.length -1) {
				System.out.print(",");
			}
			
			suma += numeros[i];
		}
		
		System.out.println("\n\nSuma de todos los valores: "+suma);
	}
}
