package sunitaJava;

import java.util.Scanner;

public class EvenAndOdd {

	public static void main(String[] args) {
		Scanner  scanner = new Scanner(System.in);
		System.out.println("Enter your value: " );
		int num = scanner.nextInt();
		
		if(num % 2 ==0)
		{
			System.out.println("value is even No. "+ num);	
		}else
		System.out.println("value is odd No. "+ num);
		
		
		

	}

}
