package pruebas;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		//Utilizamos scanner para introducir datos en la consola
		Scanner teclado = new Scanner(System.in);
		
		//Se declara la variable valor que es el numero que recibe del usuario en la consola 
		int valor;
		
		do {//llamamos a la funcion Do While
			//imprimimos un texto en la consola para introducir un valor
			System.out.println("Introduce el valor entre 0 y 999 (0 finalizar): ");
			//recuperamos el valor introducido en la consola y lo almacenamosen la variable valor.
			valor = teclado.nextInt();
			//lalamamos a la funcion If 
			if (valor>=100) {//aplicamos una condicion para continuar el ciclo
				System.out.println("contiene  3 numeros =  "+valor);		
			}if(valor<=99 && valor>=10) {//aplicamos otra condicion para aplicar otra parte del codigo 
				System.out.println("contiene 2 numeros = "+valor);
			}else if(valor<=9) {//aplicamos otra condiciona para aplicar otra parte del codigo 
				System.out.println("contiene 1 numero = "+valor);
			}	
		} while (valor!=0);//aplicamos una condicion para detener el ciclo 
			
			
		
	}

}
