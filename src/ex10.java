import java.util.Random;
import javax.swing.JOptionPane;

public class ex10 {
	public static void main (String[] args) {
		int i=0;
	//Pedimos al usuario el tamaño del array y ya declaramos uno con ese tamaño.	
		String tamañoString=JOptionPane.showInputDialog("Indica el tamaño del array para llenarlo de numeros primos");
		int tamaño=Integer.parseInt(tamañoString);
		int array[]=new int[tamaño];
	//Generamos un numero aleatorio para comprobar más adelante si será primo. 
	//Estos lo haremos hasta que llenemos el array entero, por lo tanto en un while.
				while(i<tamaño) {	
					int posiblePrimo=primoAleatorio();
	//Comprobamos que sea primo.
					boolean primo=numeroPrimo(posiblePrimo);
	//Rellenamos la posición del array con un primo una vez asegurados.
					if(primo) {
						array[i]=posiblePrimo;
						i++;
					}
				}

	//Listamos el array.
	listarArray(array,tamaño);
			}
	//Generamos un numero, luego ya comprobaremos en otro método si es primo.
	public static int primoAleatorio() {
				Random r = new Random();
				int valor = r.nextInt(1000-1)+1;
				return valor;
	}
	
	//Recorremos las posiciones una a una y generamos un número aleatorio (yo puse un límite de 1 a 1000).
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
	
	//Buscamos el número más grande del array.
	public static int mayorNum(int[] array,int  tamaño) {
		int numMasAlto;
		for(int i=0;i<tamaño;i++) {
			for(int c=i+1;c<tamaño;c++){
				if(array[i]>array[c]) {
					numMasAlto=array[i];
					array[i]=array[c];
					array[c]=numMasAlto;
				}
			}
		}
		return array[tamaño-1];
	}

	
	//Listamos el array y detectamos cual es el mayor de todos.
	
	public static void listarArray (int array[],int tamaño) {
		int numMasAlto;
		//He listado todos las posiciones y podemos ver que son todas aleatorias.
		for(int i=0;i<array.length;i++) {
			System.out.println("Posicion: "+i+"		 Valor: "+array[i]);	
		}

		//El listado anterior cambia después de este for, ya que ordenamos los valores de menor a mayor para
		//después agarrar la última posición y obtener el valor más alto.
		for(int i=0;i<tamaño;i++) {
			for(int c=i+1;c<tamaño;c++){
				if(array[i]>array[c]) {
					numMasAlto=array[i];
					array[i]=array[c];
					array[c]=numMasAlto;
				}
			}
		}
		numMasAlto=array[tamaño-1];
		System.out.print("\n");
		//Podemos comprobarlo aquí:
		for(int i=0;i<array.length;i++) {
			System.out.println("Posicion: "+i+"		 Valor: "+array[i]);	
		}

	
		System.out.println("El numero mas grande del array es: "+numMasAlto);
	}
	
}

