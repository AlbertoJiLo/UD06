import javax.swing.JOptionPane;

public class ex04 {
	public static void main (String[] args) {
		//Pedimos al usuario introducir un numero comprobando que sea positivo.
		long num=-1;
		while(num<0) {
		String numString=JOptionPane.showInputDialog("Introduce un numero para calcular su factorial");
		num=Integer.parseInt(numString);
			if(num<0) {
				System.out.println("Numero invalido. Introduce un numero positivo");
			}
		}
		long resultado=factorial(num);
		System.out.println("El factorial de "+num+" es "+resultado);
		
		
	}
	
	//Calculamos el factorial
	public static long factorial(long num) {
		long i=num;
		long resultado=num;
			while(i!=1) {
				num--;
				resultado=resultado*(num);
				i--;
			}
			return resultado;
	}
}

