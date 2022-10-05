import javax.swing.JOptionPane;

public class ex06 {
	public static void main (String[] args) {
		//Pedimos al usuario introducir un numero positivo usando un while para controlar que lo sea,
		//siendo 0 o más.
		int num=-1;
		while(num<0) {
			String numString=JOptionPane.showInputDialog("Introduce un numero positivo para contar las cifras");
			num=Integer.parseInt(numString);
				if(num<0) {
					System.out.println("Numero invalido. Introduce un numero positivo");
				}
		}
		int numeroDeDigitos=contarDigitos(num);
		System.out.println(numeroDeDigitos);
	}
	
	//Utilizamos Math para contar el numero de digitos controlando que si el usuario escribe un 0
	//le salte que tiene un dígito.
	public static int contarDigitos (int num) {
		if(num==0) {
			return 1;
		}
		int resultado=(int)(Math.log10(num)+1);	
		return resultado;
	}
}
