import javax.swing.JOptionPane;

public class ex01 {

	public static void main (String[] args) {
		
		//He creado un menú para elegir la figura con la que trabajar.
		String[] opciones= {"Circulo","Triangulo","Cuadrado"};
		String eleccion= (String) JOptionPane.showInputDialog(null,"Elige una figura","Calcular área",
				JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);
		System.out.println(eleccion);
		
		//Una vez elegida entraremos en el método que necesitemos dependiendo de la elección.
		if(eleccion=="Circulo") { 
			//Para círculo
			String areaString=JOptionPane.showInputDialog("¿Cual es el radio del circulo?");
			double area= Double.parseDouble(areaString);
			double resultado=circulo(area);
			System.out.println("El resultado es "+resultado);
		}else if(eleccion=="Triangulo") { 
			//Para triángulo.
			String baseString=JOptionPane.showInputDialog("¿Cual es la base del triangulo?");
			double base= Double.parseDouble(baseString);
			String alturaString=JOptionPane.showInputDialog("¿Cual es la altura del triangulo?");
			double altura= Double.parseDouble(alturaString);
			double resultado=triangulo(base,altura);
			System.out.println("El resultado es "+resultado);
		}else if(eleccion=="Cuadrado") { 
			//Para cuadrado.
			String ladoString=JOptionPane.showInputDialog("¿De cuanto es el lado?");
			double lado= Double.parseDouble(ladoString);
			double resultado=cuadrado(lado);
			System.out.println("El resultado es "+resultado);
		}
	}
	
	public static double circulo (double radio) {
		double resultado=(Math.pow(radio, 2))*Math.PI;
		return resultado;
	}
	
	public static double triangulo (double base, double altura) {
		double resultado=(base*altura)/2;
		return resultado;
	}
	
	public static double cuadrado (double lado) {
		double resultado=lado*lado;
		return resultado;
	}
	}

