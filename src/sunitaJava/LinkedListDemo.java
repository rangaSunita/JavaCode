package sunitaJava;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> slist = new LinkedList<String> (); 
		
		slist.add("Apple");
		slist.add("Mango");
		slist.add("Grapes");
		slist.add("Orange");
  System.out.println(" this is a list of Fruits"+ slist);
  
  for(String a: slist){
	  System.out.println(a);
  }
		

	slist.add(2, "Guava");
	System.out.println(" This is new list after adding more fruit"+ slist);
	
	System.out.println(slist.contains("Orange"));
	slist.remove();
	System.out.println(" This is new list after removing fruit"+ slist);
	slist.get(2);
	slist.add(0, "Apple");
	 for(String a: slist){
		  System.out.println(a);
	 }


	}

}
