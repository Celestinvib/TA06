import javax.swing.JOptionPane;

public class UnoApp {

	public static void main(String[] args) {
		double area = Integer.MIN_VALUE;
		String figura = JOptionPane.showInputDialog(null,"Que �rea deseas calcular?(cm)");
		
		switch(figura.toLowerCase()) {
			case "circulo":
				area = areaCirculo();
				break;
			case "triangulo":
				area = areaTriangulo();
				break;
			case "cuadrado":
				area = areaCuadrado();
				break;
			default:
				JOptionPane.showMessageDialog(null, "El programa no puede calcular el �rea de esa figura");
		}
		
		if(area != Integer.MIN_VALUE) {
			JOptionPane.showMessageDialog(null, "El �rea del "+figura+" es "+area+" cm2");
		}
	}
	
	public static double areaCirculo () {
		double R =Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio del c�rculo:"));
		
		return Math.PI*Math.pow(R, 2); 
	}

	public static double areaTriangulo () {
		double base =Double.parseDouble(JOptionPane.showInputDialog("Introduce la base del tri�ngulo:"));
		double altura =Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura del tri�ngulo:"));
		
		return (base* altura) /2;
	}

	public static double areaCuadrado () {
		double lado =Double.parseDouble(JOptionPane.showInputDialog("Introduce el tama�o de los lados del cuadrado:"));
		
		return lado * lado;
	}
}
