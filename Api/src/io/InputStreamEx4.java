package io;

import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;

public class InputStreamEx4 {

	public static void main(String[] args) {
		
		InputStream in = System.in;
		OutputStream out= System.out;
		
		byte[] datas =new byte[100];
		
		System.out.print("nombre :");
		
		try {
			int nameBytes = in.read(datas);
			String name = new String(datas,0,nameBytes-2);
			System.out.print("what do you want: ");
			int commentBytes = in.read(datas);
			String comment = new String (datas,0,commentBytes-2);
			System.out.println("algo :"+name);
			System.out.println("algo 2:  "+comment);
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();
				out.close();
			}catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		

	}

}
