package sunitaJava;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> fruit= new LinkedHashMap<Integer,String>();
		
		fruit.put(2,"banana");
		fruit.put(4,"apple");
		fruit.put(3,"grapes");
		fruit.put(1,"orange");
		fruit.put(4,"mango");
		fruit.put(null ,"abgh");
		fruit.put(6, null);
		fruit.put(1,"guava");
		
		
       System.out.println(fruit.getOrDefault(4," "));
		
		System.out.println("this is LinkedHashMap fruit"+fruit);
		
		
		
	}

}
