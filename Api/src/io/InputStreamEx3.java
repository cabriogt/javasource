package io;

import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx3 {

	public static void main(String[] args) {
		InputStream in = System.in;
		OutputStream out = System.out;
		
		byte b[]=new byte [100];
		
		try {
			
			while (in.read(b)!=1) {
				 out.write(b);
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
