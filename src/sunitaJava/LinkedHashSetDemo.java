package sunitaJava;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> fruit = new LinkedHashSet<String>();
		
		fruit.add("abc");
		fruit.add("dfe");
		fruit.add("rte");
		fruit.add("nbg");
		fruit.add("bdr");
		 fruit.add(null);
		 fruit.add(null);
		 
System.out.println("this is fruit LinkedHashSet"+fruit);

   for(String xyz: fruit) {
	   System.out.println(xyz);
	  
	   
   }
	}

}
