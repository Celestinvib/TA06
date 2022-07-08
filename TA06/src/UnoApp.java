import javax.swing.JOptionPane;

public class UnoApp {

	public static void main(String[] args) {
		double area = Integer.MIN_VALUE;
		String figura = JOptionPane.showInputDialog(null,"Que área deseas calcular?(cm)");
		
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
				JOptionPane.showMessageDialog(null, "El programa no puede calcular el área de esa figura");
		}
		
		if(area != Integer.MIN_VALUE) {
			JOptionPane.showMessageDialog(null, "El área del "+figura+" es "+area+" cm2");
		}
	}
	
	public static double areaCirculo () {
		double R =Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio del círculo:"));
		
		return Math.PI*Math.pow(R, 2); 
	}

	public static double areaTriangulo () {
		double base =Double.parseDouble(JOptionPane.showInputDialog("Introduce la base del triángulo:"));
		double altura =Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura del triángulo:"));
		
		return (base* altura) /2;
	}

	public static double areaCuadrado () {
		double lado =Double.parseDouble(JOptionPane.showInputDialog("Introduce el tamaño de los lados del cuadrado:"));
		
		return lado * lado;
	}
}
