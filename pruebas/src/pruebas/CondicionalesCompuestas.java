package pruebas;

import java.util.Scanner;

public class CondicionalesCompuestas {

	public static void main(String[] args) {
		//Se utiliza Scanner para introducir unm dato en la consola
		Scanner teclado = new Scanner(System.in);
		//Se declara la vabriale 
		int valor1,valor2;
		//Se imprime un texto en la consola para pedir un valor1
		System.out.print("Introduce el sueldo: ");
		//se recupera el valor introducido y se almacena en la variable
		valor1= teclado.nextInt();
		//Se imprime un texto en la consola para pedir un valor1
		System.out.print("Introduce el sueldo: ");
		//Se imprime un texto en la consola para pedir el valor2
		valor2= teclado.nextInt();
		
		
		//Se utiliza una condicional compuesta if /else 
		
		if (valor1>valor2) {//Se utiliza un operador de comparacion que se interpreta "si valor1 es mayor a valor2  ejecuta este codigo" 
			//Se imprime el codigo que cumple la primera condicional
			System.out.println("El valor introducido en primer lugar es el mayor");
			//Se imprime el valor guardado en la variable valor1
			System.out.println(valor1);
		}else {//else ejecutara lo opuesto a la condicional 1 (if)  "si valor2 es mayor a valor1  ejecuta este codigo
			//Se imprime el codigo que cumple con la segunda condicional
			System.out.println("El valor introducido en segundo lugar es el mayor");
			//Se imprime el valor guardado en la variable valor2
			System.out.println(valor2);
		}
		
		
		

	}

}
