import javax.swing.JOptionPane;
public class ex03 {
	
	public static void main (String[] args) {
	//Pedimos al usuario que introduzca un numero para saber si es primo controlando que sea un núm positivo.
		int num=-1;
		while(num<0) {
			String numString=JOptionPane.showInputDialog("Introduce un numero para saber si es primo");
			num=Integer.parseInt(numString);
			if(num<0) {
				System.out.println("Numero invalido. Introduce un numero positivo");
			}
		}
		boolean primo=numeroPrimo(num);		
		if(primo) {
			System.out.println(num+" es primo");			
		}else{
			System.out.println(num+" no es primo");	
		}
	}
	//Especificamos que si el número introducido es 0,1 o 4 automáticamente no es primo.
	//Después, comprobamos si el número introducido lo es.
	public static boolean numeroPrimo(int num) {
		if (num == 0 || num == 1 || num == 4) {
			return false;
		}
		for(int i=2; i<num/2;i++) {
				if(num%i==0) {
				return false;
				}
		}
		return true;
	}
	
	
}
