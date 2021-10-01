package io;

import java.io.File;
import java.io.FileWriter;

public class FileWriterEx1 {

	public static void main(String[] args) {
		
		try (FileWriter writer = new FileWriter (new File("c:\\temp\\test2.txt"),true)){// we create the file 
			
			writer.write("FileWriter text \r\n ");//hacemos el contenido del texto  con \r\n ponemos un enter 
			writer.write("text it\r\n");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
