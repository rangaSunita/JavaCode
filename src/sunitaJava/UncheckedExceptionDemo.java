package sunitaJava;

public class UncheckedExceptionDemo {

	public static void main(String[] args) {
		try {
			   int a= 30 ; int b=0;
			   int c =a/b;
			   System.out.println(c);
			   System.out.println(3);
			   System.out.println(6);
		   }
		   catch(ArithmeticException e) {
			   
			   System.out.println(2);
			   System.out.println("can not find file.");
		   } finally {
			   System.out.println("None");
		   }
		   

	}

}
