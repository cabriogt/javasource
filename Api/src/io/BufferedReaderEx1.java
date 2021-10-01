package io;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderEx1 {

	public static void main(String[] args) {
		
		try(FileReader fr = new FileReader ("c:\\temp\\file1.txt");
			BufferedReader br= new BufferedReader(fr);
			FileReader fw =new FileReader("c:\\temp\\test5.txt");
			BufferedReader bw= new BufferedReader(fw)) {
			
			String line= "";
			
			while ((line=br.readLine())!=null) {
				bw.write(line);
				bw.newLine();
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
