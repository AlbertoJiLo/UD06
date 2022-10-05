import javax.swing.JOptionPane;

public class ex05 {

	public static void main (String[] args) {
		int num=-1;
		//Pedimos al usuario introducir un numero para pasar a binario comprobando que sea positivo
		while(num<0) {
		String numString=JOptionPane.showInputDialog("Introduce un numero para pasar a binario");
		num=Integer.parseInt(numString);
			if(num<0) {
				System.out.println("Numero invalido. Introduce un numero positivo");
			}
		}
		String binario=aBinario(num);
		System.out.println(binario);
	}
	
	/*En este método vamos a concatenar una String con los datos que conseguimos al dividir
	 y conseguir el resto del número antes introducido*/
	public static String aBinario (int num) {
		String resultadoFinal="";
		while(num!=0) {
			int resultado=num%2;
			String resultadoString=Integer.toString(resultado);
			num=num/2;
			resultadoFinal=resultadoString+resultadoFinal;
			}
	//Si necesitaramos trabajar con este binario podriamos utilizar parseInt para transformarlo desde la String.
		return resultadoFinal;
	}

		
	
}
