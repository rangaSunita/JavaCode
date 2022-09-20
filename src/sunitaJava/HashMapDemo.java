package sunitaJava;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> fruit= new HashMap<Integer,String>(); 
		
		fruit.put(2,"banana");
		fruit.put(4,"apple");
		fruit.put(3,"grapes");
		fruit.put(1,"orange");
		fruit.put(4,"mango");
		fruit.put(null ,"abgh");
		fruit.put(6, null);
		
		
		
		fruit.put(1,"guava");
	
		System.out.println(fruit.getOrDefault(4," "));
		
		System.out.println("iterating fruit"+fruit);
		
			
	}

}
