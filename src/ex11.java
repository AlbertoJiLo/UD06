import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.JOptionPane;

public class ex11 {
	public static void main (String[] args) {
		//Indicamos el tamaño de los array.
		String tamañoString=JOptionPane.showInputDialog("Indica el tamaño de los array");
		int tamaño=Integer.parseInt(tamañoString);	
		int array1[]=new int[tamaño];
		int array2[]=new int[tamaño];
		int i=0;
		//Recorremos ambas arrays, les asignamos valores aleatorios (Los hice con un máximo de 100 para que
		//no salgan números gigantes).
		while(i<tamaño){
			Random r = new Random();
			int valor1 = r.nextInt(100)+1;
			array1[i]=valor1;		
			i++;
		}
		//Clonamos el array 1 en el array 2
		array2=array1.clone();
		//Utilizamos el array clon para randomizarlo en un método
		int array4[]=array2Random(array2,tamaño);	
		//Llamamos al método para multiplicar
		int array3[]=multiArrays(array1,array4,tamaño);
		//Llamamos al método que lista los 3 arrays.
		mostrarArrays(array1,array4,array3,tamaño);
		
		}
	//Método para randomizar los valores prestados del array1 en el array4. He utilizado un ArrayList para que fuera
	//más sencillo de randomizar el contenido sin repetición de valores.
	
	public static int[] array2Random(int[] array2,int tamaño) {
		int i=0;
		ArrayList<Integer> auxArray= new ArrayList<Integer>();
		for(i=0;i<tamaño;i++) {
			auxArray.add(array2[i]);
		}
		Collections.shuffle(auxArray);
		for(i=0;i<tamaño;i++) {
			array2[i]=auxArray.get(i);
		}
		return array2;

		}



	//Método para multiplicar el valor de la posición del primer array por la misma posición del segundo array.
	public static int[] multiArrays (int[] array1, int[] array4, int tamaño) {
		int i=0;
		int array3[] = new int[tamaño];
			while(i<tamaño) {
				array3[i]=array1[i]*array4[i];
				i++;
			}
		return array3;
	}
	//Método para listar los 3 arrays.
	public static void mostrarArrays (int[] array1, int[] array4,int[] array3,int tamaño) {
		int i=0;
		System.out.println("");
		while(i<tamaño) {
			System.out.println("Posicion "+i+":	"+array1[i]+"		"+array4[i]+"		"+array3[i]);
			i++;
		}
		
	}
}


