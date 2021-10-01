package pruebas;

import java.util.Scanner;

public class Proceso {
	
	public void introducir () {//Se crea el método con parámetros con nombre introducir 
		//Utilizamos scanner para introducir datos en la consola
		Scanner dato = new Scanner(System.in);
		int numero;// se crea una variable para guardar el dato introducido por el usuario 
		
		do { // se crea un loop do while
			System.out.print("Introducir numero: ");// se imprime un texto para pedir un dato 
			numero=dato.nextInt();//se almacena el dato ingresado en la variable numero
			if (numero!=-1) {//se pregunta si el valor es igual o diferente a -1 y si es diferente el valor 
				
				producir(numero);// se llama a otro metodo(producir) para recivir el valor de la variable (numero)
				
			}
			
		} while (numero!=-1);
		
	}
	public void producir(int n) {//se crea el metodo producir para recibir el valor de la variable (numero)
		for (int x = n; x <=n*10;x=x+n) {//se crea un loop for para formar una tabla de multiplicar
			System.out.println(n+"*"+x/n+"="+x);//se imprime el resultado de la tabala de multiplicar 
		}
		
	}
	

	public static void main(String[] args) {
		
		Proceso tabla = new Proceso();
		tabla.introducir();
		
	}

}
