package sunitaJava;

import java.io.FileInputStream;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		try {
			FileInputStream fis =new FileInputStream("open file");
		}catch(Exception e ) {
			System.out.println("file not found");
		}finally {
			System.out.println("File close");
		
		}

	}

}

