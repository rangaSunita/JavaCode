package sunitaJava;

public class IfElseDemo {

	public static void main(String[] args) {
		
		int a= 40, b= 20, c = 150;
		if(a>b &&  b>c) {
			System.out.println(a);
		}else if(b>c && c>a) {
			System.out.println(b);
		}else
			System.out.println(c);

	}

}
