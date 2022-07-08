import javax.swing.JOptionPane;

public class OnceApp {

	public static void main(String[] args) {
		int tamany = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el tamaño de la array"));
		int array1[] = new int[tamany];	
		int array2[] = new int[tamany];	
		
		array1 = NueveApp.rellenarArray(array1,1,100); //Llamo al método del ejercicio 9 para rellenar arrays vacias entre 2 numeros indicados 

		//		array1 = array2; //Apuntar array2 al array1 (misma posición en la memória) 
		array2= array1.clone(); 
		array2 = NueveApp.rellenarArray(array2,1,100);
		
		int array3[] = multiplicarArrays(array1, array2);
		
		System.out.println("Contenido de la Array1:");
		showArray(array1);
		System.out.println("\nContenido de la Array2:");
		showArray(array2);
		System.out.println("\n\nContenido de la con los valores multiplicados:");
		showArray(array3);
	}
	
	public static int[] multiplicarArrays (int array1[], int array2[]) {
		int arrayResultado[] = new int[array1.length];	
		
		for (int i = 0; i < arrayResultado.length; i++) {
			arrayResultado[i] = array1[i] * array2[i];
		}
		return arrayResultado;	
	}
	
	public static void showArray (int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if(i != array.length -1) {
				System.out.print(",");
			}
		}
	}

}
