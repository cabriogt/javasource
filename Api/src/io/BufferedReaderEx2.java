package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class BufferedReaderEx2 {

	public static void main(String[] args) {
		
		try(FileReader fr = new FileReader ("src/io/BufferedInputStreamEx5.java");
			BufferedReader br = new BufferedReader (fr);) {
				
			//char cduf[]= new char[100];
			
			String line = "";
			int i=1;
			while ((line=br.readLine())!=null) {
					System.out.println(i +" "+line);
					i++;
					
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
		
	}

}
