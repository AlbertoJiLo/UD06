import javax.swing.JOptionPane;

public class ex07 {
	public static void main (String[] args) {
		//Creo un menú para elegir la moneda a la que convertir los euros
				String[] opciones= {"Libras","Dolares","Yenes"};
				String eleccion= (String) JOptionPane.showInputDialog(null,"Elije una moneda","Euros a...",
						JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);
				System.out.println(eleccion);
				
		//Dependiendo de la eleccion nos pedirá el número de euros a convertir a la moneda específica
		if(eleccion=="Libras") {
			String eurosString=JOptionPane.showInputDialog("¿Cuantos euros quieres convertir a Libras?");
			double euros=Double.parseDouble(eurosString);
			eurosALibras(euros);
		}else if (eleccion=="Dolares") {
			String eurosString=JOptionPane.showInputDialog("¿Cuantos euros quieres convertir a Dolares?");
			double euros=Double.parseDouble(eurosString);
			eurosADolares(euros);
		}else if (eleccion=="Yenes") {
			String eurosString=JOptionPane.showInputDialog("¿Cuantos euros quieres convertir a Libras?");
			double euros=Double.parseDouble(eurosString);
			eurosAYenes(euros);
		}
	}
	
	//Estos tres métodos harán la conversión y directamente imprimirán el resultado en pantalla
	public static void eurosALibras (double euros) {
		double resultado=euros*0.86;
		System.out.println(euros+ " euros son " +resultado+ " libras");
	}
	public static void eurosADolares (double euros) {
		double resultado=euros*1.28611;
		System.out.println(euros+ " euros son " +resultado+ " dolares");
	}
	public static void eurosAYenes (double euros) {
		double resultado=euros*129.852;
		System.out.println(euros+ " euros son " +resultado+ " yenes");
	}
}
