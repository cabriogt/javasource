package pruebas;

import java.util.Scanner;

public class arrays {
	
	private Scanner teclado;
	private int[] sueldo; //se declara el array
	
	public void cargar () {
		teclado = new Scanner(System.in); //se declara el objeto teclado que es el valor introducido por el usuario en la consola
		sueldo =new int [5];//se declara el array que tiene 5 espacios
		for (int i = 0; i< sueldo.length; i++) {//se crea un loop for que ira del 0al 4 para introducir los valores
			System.out.println("introduce sueldo: ");//se imprime un texto en la consola para que el usuario introduzca los valores
			sueldo[i]= teclado.nextInt();//aqui se almacena los valores en el array 
			
		}
	}
	
	public void imprimir() {
		for (int i = 0; i< sueldo.length; i++) {
			System.out.println(sueldo[i]);
			
		}
		
	}
	
	
	

	public static void main(String[] args) {
		
		arrays usuario =new arrays();
		usuario.cargar();
		usuario.imprimir();

	}

}
