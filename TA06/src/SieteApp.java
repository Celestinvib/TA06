import javax.swing.JOptionPane;

public class SieteApp {

	public static void main(String[] args) {
		double euros = Double.parseDouble(JOptionPane.showInputDialog(null,"Cantidad de euros:"));
		String moneda = JOptionPane.showInputDialog(null,"Convertir a dolares, yenes o libras(Escribe la moneda):");
		
		conversor(euros, moneda);
	}
	
	public static void conversor (double euros, String moneda) {
		switch(moneda.toLowerCase()) {
			case "libras":
				JOptionPane.showMessageDialog(null,euros+"€ son "+ (euros * 0.86)+" libras");
				break;
			case "dolares":
				JOptionPane.showMessageDialog(null,euros+"€ son "+ (euros * 1.28611)+"$");
				break;
			case "yenes":
				JOptionPane.showMessageDialog(null,euros+"€ son "+ (euros * 129.852)+" yenes");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Introduce una moneda válida!");	
		}
	}

}
