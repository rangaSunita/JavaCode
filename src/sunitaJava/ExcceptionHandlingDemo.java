package sunitaJava;

public class ExcceptionHandlingDemo {

	public static void main(String[] args) {
		

		   try {
			   int a= 30 ; int b=0;
			   int c =a/b;
			   System.out.println(c);
			   System.out.println(3);
			   System.out.println(6);
		   }
		   catch(ArithmeticException e) {
			   
			   System.out.println();
			   System.out.println("can not find file.");
		   
	} 	   
	}

}
