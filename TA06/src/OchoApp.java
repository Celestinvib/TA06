import java.util.Scanner;

public class OchoApp {

	public static void main(String[] args) {
		int numeros[] = new int[10];
		rellenarArray(numeros);
		mostrarArray(numeros);
	}
	
	public static int[] rellenarArray (int numeros[]) {
        Scanner sc = new Scanner(System.in);
		System.out.println("\nRellenar array numeros(10 posiciones):");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Introduce un valor: ");
			numeros[i] =  sc.nextInt();
		}
		
		return numeros;
	}
	
	public static void mostrarArray (int numeros[]) {
		System.out.println("\nArray numeros:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Valor en la posición "+i+" = "+numeros[i]);

		}
	}

}
