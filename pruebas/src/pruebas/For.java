package pruebas;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		//Utilizamos scanner para introducir datos en la consola
		Scanner teclado = new Scanner(System.in);
		
		//declaramos las variables
		int suma,f,valor,promedio;
		
		//asignamos el valor de la variable suma 
		suma= 0;
		
		//llamamos a la funcion For 
		for (f= 1; f <=10; f++) {//f=1 corresponde al contador de la estructura,f<=10 corresponde a la condicion y f++ corresponde al incrementador de la estructura 
			//se imprime un texto en la consola para ingresar un dato
			System.out.println("Ingrese valor: ");
			System.out.println("valor de f:"+f);
			//se recupera el valor introducido en la consola y se almacena en la variable valor
			valor=teclado.nextInt();
			//aplicamos una suma la variable suma + el valor que es el numero introducido en la consola 
			suma = suma+valor;
		}
		//imprimimos el resultado de la suma en la consola 
		System.out.print("la suma es:"+suma);
				

	}

}
