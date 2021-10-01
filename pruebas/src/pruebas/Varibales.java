package pruebas;

import java.util.Scanner;

public class Varibales {

	public static void main(String[] args) {
		
		//Primero definimos los valores
		
		Scanner  teclado = new Scanner(System.in);
		String texto;
		float division;
		int num1,num2,suma,rest,mult,div; //las variables se pueden definir todas juntas con coma como seprador o una por una.
		texto ="Ingrese un valor:  ";
		
		//Despues introducimos los valores por el teclado
			
		System.out.print(texto);
		num1 = teclado.nextInt();
		System.out.print(texto);
		num2 =teclado.nextInt();
		
		//Utilizamos los operadores para realizar las operaciones
				
		suma= num1+ num2;
		rest= num1 -num2;
		mult= num1 * num2;
		div= num1 /num2;
		
		//Por ultimo IMprimimos los resultados 
				
		System.out.print("La suma de los valores es de:"+ suma);
		System.out.println();
		System.out.print("La resta de los valores es de:"+ rest);
		System.out.println();
		System.out.print("La multiplicacion de los valores es de:"+ mult);
		System.out.println();
		System.out.print("La division de los valores es de:"+ div);
		System.out.println();
	}

}
