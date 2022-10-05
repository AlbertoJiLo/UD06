import java.util.Random;

import javax.swing.JOptionPane;

public class ex12 {
	public static void main (String[] args) {
		int valorMinimo=1;
		int valorMaximo=300;
		boolean check=false;
		int numeroElegido=0;
		//Pedimos al usuario el tamaño del array.	
		String tamañoString=JOptionPane.showInputDialog("Indica el tamaño del array");
		int tamaño=Integer.parseInt(tamañoString);
		//Pedimos un número que tendrá que coincidir más adelante con el último dígito para ser listado. 
		//Además comprobaremos que el número introducido sea válido.
			while(!check) {
		String ultimoNumeroString = JOptionPane.showInputDialog("¿Listaremos los numeros acabados en...?");	
		numeroElegido = Integer.parseInt(ultimoNumeroString);
				if(numeroElegido<0 || numeroElegido>9) {
					System.out.println(numeroElegido+" no es un numero valido. Introduce un numero del 1 al 9");
				}else{
					check=true;
				}
			}
			//Llamaremos al método para rellenar el array
			int array[]=rellenarArray(valorMinimo, valorMaximo, tamaño);
			//Listamos el array.
			listarArray(array,numeroElegido,tamaño);
			
		}
	//Método para rellenar el array de números aleatorios entre 1 y 300.
	public static int[] rellenarArray(int valorMinimo,int valorMaximo, int tamaño) {
		int i=0;
		int array[]=new int[tamaño];
		while(i<tamaño){
			Random r = new Random();
			int valor = r.nextInt(300)+1;
			array[i]=valor;			
			i++;
		}
		return array;
	}
	//Método para comparar el digito final de cada campo del array y guardarlo en uno nuevo mientras se lista.
	public static void listarArray(int[]array,int numeroElegido, int tamaño) {
		int i=0;
		int c=0;
		int ultimoDigito;
		int array2[]=new int[tamaño];
		while(i<tamaño) {
			ultimoDigito=array[i]%10;
			if(ultimoDigito==numeroElegido) {
				array2[c]=array[i];
				System.out.println(array2[c]);
				c++;
			}
		i++;
		}
	}
}
