package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputStreamEx3 {

	public static void main(String[] args) {
		
		
		try (FileInputStream fis= new FileInputStream("c:\\temp\\picture.jpg")){
			long start = System.currentTimeMillis();
			while(fis.read()!=-1) {}
			long end = System.currentTimeMillis();
			System.out.println("FileInputStream only "+(end-start));
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		
		
		try (FileInputStream fis= new FileInputStream("c:\\temp\\picture.jpg"));
			BufferedInputStream bis = new BufferedInputStream(fis)){
			long start = System.currentTimeMillis();
			while(bis.read()!=-1) {}
			long end = System.currentTimeMillis();
			System.out.println("FileInputStream only "+(end-start));
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		

	}

}
