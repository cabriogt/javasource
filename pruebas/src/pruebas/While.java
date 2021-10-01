package pruebas;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		//Utilizamos scanner para introducir datos en la consola
		Scanner teclado = new Scanner(System.in);
		//Declaramos las variables 
		int n,x;
		//imprimimos un texto en la consola para introducir un dato
		System.out.print("Ingrese el valor final: ");
		//recuperamos el dato introducido en la consola 
		n = teclado.nextInt();
		//asignamos el valor d ela variable x = 1
		x=0;
		
		//llamamos a la funcion while 
		
		while (x<=n) {//la condicion es que x es menor o igual a n  es decir que el ciclo para hasta que x sea igual el numero en la n 
			System.out.print("valor de x: "+x);//aqui imprimimos el valor de x
			System.out.println("/ valor de n:"+n);//aqui  imprimimos el valor de n que es el valor que introducimos 
			x = x +1;// aqui sumamos 1 a x cada vez que la line se repite  
		}
		
		

	}

}
