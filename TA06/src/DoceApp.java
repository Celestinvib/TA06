import java.util.Iterator;

import javax.swing.JOptionPane;

public class DoceApp {

	public static void main(String[] args) {
		int tamany = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el tamaño de la array"));
		int array1[] = new int[tamany];	
		
		array1 = NueveApp.rellenarArray(array1,1,300); //Llamo al método del ejercicio 9 para rellenar arrays vacias entre 2 numeros indicados 
		
		String digito = JOptionPane.showInputDialog(null,"Introduce un digito");
		
		if(digito.length() == 1) {
			int arrayDigitoIgual[] = arrayIgualDigito(array1,digito);
			System.out.println("Numeros de la array acabados en "+digito+" :");
			OnceApp.showArray(arrayDigitoIgual);//Llamo al método de la clase 11 para mostrar la array
			
		}else {
			JOptionPane.showMessageDialog(null, "Introduce un digito válido");
		}
	}
	
	/*Crea una nueva array con los numeros de la array de los args que acaban en el digito indicado 
	(He evitado el uso de ArrayList y por eso la presencia de arrays auxiliares) */
	public static int[] arrayIgualDigito(int array1[] , String digito) {
		int emptyArray[] = new int[array1.length]; //Array auxiliar creada para almacenar los numeros 
		String d = "";
		int y = 0;

		for (int i = 0; i < array1.length; i++) {
			//Almacena la el último digito del num de la array actual
			d = Integer.toString(array1[i]);
			d = d.substring(d.length() -1);	
			
			if(digito.equals(d)) { 
				emptyArray[y] = array1[i];
				y++;
			}
		}
		//Se crea una nueva array con la longitud exacta a las variables modificadas en la array anterior para que no haya posiciones indefinidas
		int newArray[] = new int[y]; 
		for (int i = 0; i < newArray.length; i++) { 
			newArray[i] = emptyArray[i];
		}	
		
		return newArray;
		
	}
	
	

}
