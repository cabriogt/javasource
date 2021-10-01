package pruebas;

import java.util.Scanner;

public class Persona { //se crea una clase 
	
	private Scanner teclado;//definimos el modo de acceso que es comparable a declarar una variable 
	private String nombre;//se define el nombre de los atributos para utilizar los metodos 
	private int edad;//se define el nombre de los atributos para utilizar los metodos
	
	public void inicializar() { //se crea el metodo inicializar que tiene sus funciones 
		teclado = new Scanner(System.in);
		System.out.print("ingrese nombre: ");
		nombre= teclado.next();
		System.out.println("ingrese edad: ");
		edad= teclado.nextInt();
	}
	
	public void imprimir() {//se crea el metodo imprimir 
		System.out.println("nombre: "+nombre);
		System.out.println("edad: "+edad);
	}
	
	public void esMayorEdad() {// se crea el metodo esMayorEdad
		if (edad>=18 && edad<=65) {
			System.out.println(nombre+" es mayor de edad para trabajar");
		} else if (edad>=65) {
			System.out.println(nombre+" jubilado.");
		}else {
			System.out.println(nombre+" no esmayor de edad no puede trabajar");
		}
		
		
	}
	

	public static void main(String[] args) { //se crea un objeto dentro del metodo main 
		
		Persona persona1 = new Persona();//para crear el objeto primero hay que utilizar el nombre de la clase (Persona) luego creamos el nombre del objeto (persona1) para poder acceder al metodo luego ponemos = new y repetimos el nombre de la clase 
		persona1.inicializar();//ya creado el objeto podemos acceder a cualquier propiedad utlisando el nombre del obejto (persona1). y el nombre del metodo al que queremos acceder (inicializar)
		persona1.imprimir();//ya creado el objeto podemos acceder a cualquier propiedad utlisando el nombre del obejto (persona1). y el nombre del metodo al que queremos acceder (imprimir)
		persona1.esMayorEdad();//ya creado el objeto podemos acceder a cualquier propiedad utlisando el nombre del obejto (persona1). y el nombre del metodo al que queremos acceder (esMayorEdad)
		

	}

}
