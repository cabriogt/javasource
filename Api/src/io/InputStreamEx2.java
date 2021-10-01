package io;

import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx2 {

	public static void main(String[] args) {
		InputStream in = System.in;
		OutputStream out = System.out;
		
		try {
			int input =in.read();
			out.write(input);
			
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
