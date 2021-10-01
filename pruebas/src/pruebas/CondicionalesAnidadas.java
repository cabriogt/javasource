package pruebas;

import java.util.Scanner;

public class CondicionalesAnidadas {

	public static void main(String[] args) {
		
		//utilizamos scnner para introducir datos en la consola
		Scanner teclado = new Scanner (System.in);
		
		//declaramos las variables por separado 
		int nota1;
		int nota2;
		int nota3;
		
		//imprimimos un texto en la consola para ingresar datos
		System.out.println("Ingrese la primera nota: ");
		//se recupera el valor introducido por el usuario y se almacena en la varibale 
		nota1= teclado.nextInt();
		//imprimimos un texto en la consola para ingresar datos
		System.out.println("Ingrese la segunda nota: ");
		//se recupera el valor introducido por el usuario y se almacena en la varibale
		nota2= teclado.nextInt();
		//imprimimos un texto en la consola para ingresar datos
		System.out.println("Ingrese la tercera nota: ");
		//se recupera el valor introducido por el usuario y se almacena en la varibale
		nota3= teclado.nextInt();
		
		//aplicamos la formula para sacar el promedio de las notas
		int prom= (nota1+nota2+nota3) /3;
		
		//aplicaremos condicional anidada para determinar su calificacion 
		
		if (prom >= 9) {//condicional principal if si el prom es mayor a 9
			System.out.println("sobresaliente tu promedio es: "+prom);
			
		} else {//presguntara  con un if 
			if (prom >=6) {//este if tendra la condicion de promedio mayor a 6 
				System.out.println("regular tu promedio es: "+prom);
			}else {//si cualquiera de las primeras dos condionales no se cumple se ejecutara este else 
				System.out.println("reprobado tu promedio es: "+prom);
			}

		}
		
		
	}

}
