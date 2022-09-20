package sunitaJava;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> fruit = new TreeSet<String>();
		fruit.add("apple");
       fruit.add("mango");
       fruit.add("grapes");
       fruit.add("banana");
       
      
       
       
       System.out.println("this is the Fruit list"+ fruit);
       System.out.println(fruit.contains("banana"));
       
       
       fruit.remove("apple");
       System.out.println("this is the Fruit list"+ fruit);
	}

}
