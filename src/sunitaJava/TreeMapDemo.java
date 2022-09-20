package sunitaJava;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> fruit= new TreeMap<Integer,String>(); 
		fruit.put(2,"banana");
		fruit.put(4,"apple");
		fruit.put(3,"grapes");
		fruit.put(1,"orange");
		fruit.put(5, null);
		fruit.put(6, null);
		
		
		
		
		
		System.out.println("This is TreeMap fruit"+fruit);
		
		fruit.put(1,"guava");
		System.out.println("This is TreeMap fruit"+fruit);
		
		
	}

}
