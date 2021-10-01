package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputStreamEx1 {

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
		
	
		
		
		
		
		
		
		FileInputStream fis= null;
		BufferedInputStream bis= null;
		FileOutputStream fos = null;
		BufferedInputStream bos = null;
		
		try {
			
				//fis = new FileInputStream("c:\\temp\\picture.jpg");
				fis = new FileInputStream("c:\\temp\\Rolling.mp3");
				bis = new BufferedInputStream (fis);
				//fos = FileOutputStream("c:\\temp\\picture_copy2.jpg");
				fos = FileOutputStream("c:\\temp\\Rolling_copy2.mp3");
				bos = new BufferedInputStream (fos);
				
				
				int data;
				while ((data=bis.read())!+-1) {
					bos.write(data);
				} 
				bos.flush();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				bis.close();
				fis.close();
				bos.close();
				fos.close();
			}catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
			
		
		

	}

}
