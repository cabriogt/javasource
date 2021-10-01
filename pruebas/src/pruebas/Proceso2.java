package pruebas;

import java.util.Scanner;

public class Proceso2 {
	
	public void introducirPorTeclado() {
		Scanner input = new Scanner(System.in);//Utilizamos Scanner para pedir un dato al usuario 
		System.out.println("introduce el 1er valor: ");//imprimimos un texto para pedir un dato
		int numero1=input.nextInt();//recuperamos el dato y lo almacenamos en la variable numero1
		System.out.println("introduce el 2do valor: ");
		int numero2=input.nextInt();
		System.out.println("introduce el 3er valor: ");
		int numero3=input.nextInt();
		int superior,inferior;
		superior =algoritmoSuperior(numero1,numero2,numero3);//definimos las varibales superior que llaman el retorno de un valor  de otro metodo
		inferior =algoritmoInferior(numero1,numero2,numero3);
		System.out.println("el numero mayor es:  "+superior);//Se imprime el resultado del metodo que determina el valor superior  
		System.out.println("el numero menor es:  "+inferior);
		
	}
	
	public int algoritmoSuperior(int num1,int num2,int num3) { //se crea el metodo y se declara las variables  que ocuparemos
		int sup;//se crea la variable sup que almacena el resultado de este metodo 
		if (num1 > num2 && num1 > num3) { // se emplea un loop if con la condicion de comparar un dato para determinar el numero mayor
			sup=num1; // se almacena el numero que resulte mayor de la primera comparacion 
		}else {
			if(num2>num3){// luego se compara el num 2 y 3 para saber cual el mayor
				sup=num2;//se almacena el valor que resulte mayor de el numero 2 y 3
			}else {
				sup=num3;//aqui se determina que el numero 3 es el mayor 
			}
		}
		return sup;// aqui retornamos el valor que resulte mayor de los 3 numeros para poder ocuparlo en el primer metodo 
	}
	
	public int algoritmoInferior(int num1,int num2,int num3) {
		int inf;
		if (num1 < num2 && num1 < num3) {
			inf=num1;
		}else {
			if(num2<num3){
				inf=num2;
			}else {
				inf=num3;
			}
		}
		return inf;
	}
	
	

	public static void main(String[] args) {
		
		Proceso2 resultado = new Proceso2();
		resultado.introducirPorTeclado();
		
		
		

	}

}
