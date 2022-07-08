import javax.swing.JOptionPane;

public class CincoApp {

	public static void main(String[] args) {
		int num =Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce un número en base decimal a convertir a binario"));
		
		String numBinario = conversorBinario(num);
		
		JOptionPane.showMessageDialog(null,num+ " en binario es "+numBinario);
	}
	
	public static String conversorBinario(int num) {
		String r = "";
		while(num != 0) {
			r += (num % 2);
			num /= 2;
		}
	    //Utilizo la clase de Java StringBuilder para revertir el orden caracter x caracter del resultado 
		return  new StringBuilder(r).reverse().toString();//Lo tengo que convertir de StringBuilder a String ya que necesito devolver un String
	}

}
