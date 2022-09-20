package sunitaJava;

import java.util.HashSet;

public class HashSetDemo1 {

	public static void main(String[] args) {

HashSet<String> fruit = new HashSet<String>();
        
fruit.add("Apple");
fruit.add("Mango");
fruit.add("Grapes");
fruit.add("Orange");
fruit.add("Banana");



System.out.println("this is the Fruit list"+ fruit);
 for(String a: fruit) {
	 System.out.println(a);
 }
 System.out.println(fruit.contains("Mango"));
 
  fruit.remove("Grapes");
 fruit.add("Mango");
 System.out.println("this is the Fruit list"+ fruit);//its not taking duplicate value.
	}
	

}
