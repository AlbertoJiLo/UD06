import java.util.Random;
import javax.swing.JOptionPane;

public class ex09 {
	public static void main (String[] args) {
	boolean check=true;
	int valorMaximo=0;
	int valorMinimo=0;
	//Pedimos al usuario el tamaño del array además del valor mínimo y máximo.
	//Haremos un check para que el número máximo sea mayor que el mínimo.
	String tamañoString=JOptionPane.showInputDialog("Indica el tamaño del array");
	int tamaño=Integer.parseInt(tamañoString);
			while(check) {
			String valorMinimoString = JOptionPane.showInputDialog("¿Cual será el valor minimo posible?");
			valorMinimo = Integer.parseInt(valorMinimoString);
			String valorMaximoString = JOptionPane.showInputDialog("¿Cual será el valor maximo posible?");
			valorMaximo = Integer.parseInt(valorMaximoString);
				if(valorMaximo<valorMinimo) {
					System.out.println("El valor minimo tiene que ser mas pequeño que el maximo");
				}else {
					check=false;
			}
		
			}
	//Llamamos al método para rellenar con los valores indicados.
			int array[]=rellenarArray(tamaño,valorMinimo,valorMaximo);
	//Listamos y sumamos todos los valores.
			listarArray(array);
		}
	//Recorremos las posiciones una a una y generamos un número aleatorio en el rango establecido.
	//Luego retornamos el resultado para utilizarlo en el método de listado.
	public static int[] rellenarArray(int tamaño,int valorMinimo, int valorMaximo) {
		int i=0;
		int resultado[]=new int[tamaño];
			while(i<tamaño){
				Random r = new Random();
				int valor = r.nextInt((valorMaximo-valorMinimo)+1)+valorMinimo;
				resultado[i]=valor;
				i++;
			}
		return resultado;	
	}
	
	//Listamos todas las posiciones con sus valores mientras vamos sumándolos. Al final imprimimos toda
	//la información.
	public static void listarArray (int array[]) {
		int suma=0;
		for(int i=0;i<array.length;i++) {
			suma=suma+array[i];
			System.out.println("Posicion: "+i+"		 Valor: "+array[i]);	
		}
		System.out.println("Suma de todos los valores: "+suma);	
	}
	
}
