package pruebas;

import java.util.Scanner;

public class CondicionalesAnidadas2 {

	public static void main(String[] args) {
		
		//utilizamos scanner para introducir datos en la consola
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
				
		if (prom == 9 || prom  == 10) {//condicion principal 
			System.out.println("sobresaliente tu promedio es: "+prom);
		}else if (prom ==8 || prom ==7 ) {//2da condicion
			System.out.println("regular tu promedio es: "+prom);
		} else if (prom ==6 ) {//3ra condicion
			System.out.println("suficiente tu promedio es: "+prom);
		}else if (prom ==5 ) {//4ta condicion
			System.out.println("reprobado tu promedio es: "+prom);
		}else {//si no se cumple ninguna condicion anterior ejecuta este codigo 
			System.out.println("repite el curso tu promedio es: "+prom);
		}
		
		
	}

}
