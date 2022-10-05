import javax.swing.JOptionPane;
import java.util.Random;

public class ex02 {
	public static void main (String[] args) {
	boolean check=true;
	int valorMaximo=0;
	int valorMinimo=0;
	//Pedimos al usuario cuantos números quiere y el rango de valores posibles
	String cantidadString = JOptionPane.showInputDialog("¿Cuantos numeros aleatorios quieres?");
	int cantidad = Integer.parseInt(cantidadString);
	//Hacemos un check para asegurarnos que el valor mínimo es más pequeño que el máximo.
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
	numrandom(cantidad,valorMaximo,valorMinimo);
	

	}
	//Método para generar y listar los números aleatorios con los parámetros anteriores.
	public static void numrandom (int cantidad, int valorMaximo, int valorMinimo) {
		int i=0;
			while(i<cantidad) {
				Random r = new Random();
				int resultado = r.nextInt((valorMaximo-valorMinimo)+1)+valorMinimo;
				System.out.println(resultado);
				i++;
			}
	}
}
