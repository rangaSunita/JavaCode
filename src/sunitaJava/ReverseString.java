package sunitaJava;

public class ReverseString {
	

	public static void main(String[] args) {
   String s = "star";
 //1. by using for loop. 
   int len= s.length();
   
   String re = " ";
   for(int i = len-1; i>= 0; i--) {
	   re= re + s.charAt(i);
   }
    System.out.println(re);
   
	//2. by using StrinBuffer Class.	  
		StringBuffer sf = new StringBuffer(s);
		
		System.out.println(sf.reverse());
	
   


	}

}
