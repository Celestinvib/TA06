import javax.swing.JOptionPane;

public class DiezApp {

	public static void main(String[] args) {
		int tamany = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el tamaño de la array"));
		int numeros[] = new int[tamany];	
		
		numeros = rellenarArray(numeros, 2, 100); //El rango deseado directamente indicado en la app 
		mostrarResultados(numeros);
		
		
	}
	
	public static int[] rellenarArray (int numeros[], int rangoMin, int rangoMax) {
		boolean primo = true;
		int n = 0;
		for (int i = 0; i < numeros.length; i++) {
			/*Generación de numeros aleatorios hasta que se obtenga uno entero*/
			do { //La primera vez entra al bucle aunque la var primo sea true
				 n = (int)((Math.random() * ((rangoMax+1) - rangoMin)) + rangoMin);
				primo = TresApp.esPrimo(n); //Llamo al método del ejercicio 3 para comprobar que el número aleatorio generado es primo
			}
			while(!primo);

			numeros[i] = n;
		}
		return numeros;
	}
	
	public static void mostrarResultados(int numeros[]) {
		int mayor = Integer.MIN_VALUE;
		
		System.out.println("\nArray de numeros primos:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]);
			if(i != numeros.length -1) {
				System.out.print(",");
			}
			
			if(mayor < numeros[i]) {
				mayor = numeros[i];
			}
			
		}
		System.out.println("\nNúmero primo mayor de todos: "+mayor);

	}

}
