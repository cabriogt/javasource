package pruebas;
import java.util.Scanner;
public class Productos {
	private Scanner s;
	private String[] producto;
	
	public Productos() {
		
		s = new Scanner(System.in);
		producto= new String[5];
		for (int f = 0; f <5; f++) {
			System.out.print("introduce el nombre del producto :   ");
			producto[f]=s.next();
						
		}
	}
	
	public void visualizar() {
		for (int f = 0; f <5; f++) {
			System.out.println(producto[f]);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Productos op = new Productos();
		op.visualizar();
		
	}
	

}
