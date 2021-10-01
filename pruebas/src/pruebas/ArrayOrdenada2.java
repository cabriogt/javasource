package pruebas;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;


public class ArrayOrdenada2 {
	
	private Scanner teclado;
	private Integer []sueldo;
	
	public void cargar() {
		teclado = new Scanner(System.in);
		sueldo = new Integer[5];//se crea el array
		for (int f = 0; f < sueldo.length; f++) {//usamos for para hacer nuestro array de mayor a menor 
			sueldo[f]= teclado.nextInt();
		}
	}
	
	public void ordenar () {
		Arrays.sort(sueldo,Collections.reverseOrder());//utilizamos sort y reverse order para hacer el array de forma decendente
	}
	
	public void imprimir () {
		for (int f = 0; f < sueldo.length; f++) {
			System.out.println(sueldo[f]);
			
		}
	}
		

	public static void main(String[] args) {
		
		ArrayOrdenada2 usuario = new ArrayOrdenada2();
		usuario.cargar();
		usuario.ordenar();
		usuario.imprimir();
		
		
	}

}