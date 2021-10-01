package pruebas;

import java.util.Scanner;

public class CondicionalesSimples {

	public static void main(String[] args) {
		//Scanner nos ayuda a introducir datos en la consola 
		Scanner teclado = new Scanner(System.in);
		//Se declara la variable sueldo como float esdecir una cifra con decimal 
		float sueldo;
		//Se imprime en la consola el texto para que el usuario coloque su cifra
		System.out.print("Introduce el sueldo:  ");
		//Se recupera el valor que introduce el usuario y se almacena en la variable sueldo 
		sueldo= teclado.nextFloat();
		
		//Se utiliza la condicional if 
		
		if (sueldo>3000)/*condicion*/ { //Dentro de las llavez se pone el codigo que debe de ejecutar
			System.out.println("EL usuario tiene que declarar impuestos");	
		}
		//se pueden utulizar todas las condicionales que queramos 
		if (sueldo<=3000) {//aqui utlizamos un operador de condicion que se lee "si el sueldo es menor o igual a 3000" escribe el codigo de la parte de abajo 
			System.out.println("EL usuario no tiene que declarar impuestos");	
		}
		
		if (sueldo>6000 && sueldo<10000) {//aqui se utiliza el operador logico "and" que siginifica que se deben de cumplir las dos condiciones utilizadas
			System.out.println("El usuario tiene que pagar una bonificacion de 1000 pesos");	
		}
		if (sueldo==20000 || sueldo==30000) {// aqui utilizamos el operador logico "or" que significa que se solo se debe de cumplir una de las dos condiciones para ejecutar el codigo
			System.out.println("EL usuario paga el 10% de su sueldo");	
		}

	}

}
