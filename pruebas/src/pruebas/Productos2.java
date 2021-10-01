package pruebas;

import java.util.Scanner;

public class Productos2 {
	
	private Scanner teclado = new Scanner (System.in);
	private String cad1;
	private String cad2;
	
	public Productos2 () {
		System.out.println("Ingrese la primer cadena: ");
		cad1=teclado.nextLine();
		System.out.println("Ingrese la segunda cadena: ");
		cad2=teclado.nextLine();
	}
	
	public void visualizar() {
		if (cad1.contentEquals(cad2)==true) {
			System.out.println(cad1+" es exactamente igual a "+cad2);
		}else {
			System.out.println(cad1+" no es exactamente igual a "+cad2);
		}
		if (cad1.equalsIgnoreCase(cad2)==true) {
			System.out.println(cad1+" es igual a "+cad2+ "sin tener en cuenta mayusculas/minisculas");
		} else {
			System.out.println(cad1+" no es igual a "+cad2+ "sin tener en cuenta mayusculas/minisculas");
		}
		if (cad1.compareTo(cad2)==0) {
			System.out.println(cad1+" es exactamente igual a "+cad2);
		}else {
			if (cad1.compareTo(cad2)>0) {
				System.out.println(cad1+" es mayor alfabeticamente que "+cad2);
			}else {
				System.out.println(cad2+ " es mayor alfabeticamente que "+cad1);
			}
		}
		char carac1=cad1.charAt(0);
		System.out.println("El primer caracter de "+cad1+" es "+carac1);
		int largo=cad1.length();
		System.out.println("El largo del string "+cad1+" es "+largo);
		String cad3=cad1.substring(0,3);
		System.out.println("Los primeros tres caracteres de "+ cad1+" son "+cad3);
		int posi=cad1.indexOf(cad2);
		if (posi ==-1) {
			System.out.println(cad2+" no esta contenido en "+cad1);
		}else {
			System.out.println(cad2+" esta contenido en "+cad1+ " a partir de la posicion "+posi);
		}
		System.out.println(cad1+ " convertido a mayusculas es "+ cad1.toUpperCase());
		System.out.println(cad1+ " convertido a mayusculas es "+ cad1.toLowerCase());
	}

	public static void main(String[] args) {
		
		Productos2 op = new Productos2();
		op.visualizar();
		
		
		
	}

}
