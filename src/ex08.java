import javax.swing.JOptionPane;

public class ex08 {
	public static void main (String[] args) {
		
		System.out.println("Vamos a crear un array");
		int array[]=rellenarValores(10);
		listarArray(array);
	}
	
	//Método para rellenar cada posición del array con un valor introducido por el usuario.
	public static int[] rellenarValores (int numeroPosiciones) {
		int i=0;
		int resultado[]=new int[numeroPosiciones];
		while(i<numeroPosiciones){
			String valorString=JOptionPane.showInputDialog("Elije el valor de la posicion "+i+" del array");
			int valor=Integer.parseInt(valorString);
			resultado[i]=valor;
			i++;
		}
		return resultado;
	}
	
	//Método para listar cada una de las posiciones del array y su contenido.
	public static void listarArray (int array[]) {
		for(int i=0;i<array.length;i++) {
			System.out.println("Posicion: "+i+" Valor: "+array[i]);
		}
	}
	
}
