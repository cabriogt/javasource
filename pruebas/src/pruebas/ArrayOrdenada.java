package pruebas;
import java.util.Scanner;
import java.util.Arrays;


public class ArrayOrdenada {
	
	private Scanner teclado;
	private int[]sueldo;
	
	public void cargar () {
		teclado = new Scanner(System.in);
		sueldo = new int[5];//se crea ek array
		for (int f = 0; f < sueldo.length; f++) {
			System.out.print("introduce sueldo: ");
			sueldo[f]= teclado.nextInt();
		}
	}
	
	public void ordenar () {
		Arrays.parallelSort(sueldo);//usamos sort para hacer nuestro array de menor a mayor
	}
	
	public void imprimir () {
		for (int f = 0; f < sueldo.length; f++) {
			System.out.println(sueldo[f]);
			
		}
	}
	
		

	public static void main(String[] args) {
		
		ArrayOrdenada usuario = new ArrayOrdenada();
		usuario.cargar();
		usuario.ordenar();
		usuario.imprimir();
		
		
	}

}
