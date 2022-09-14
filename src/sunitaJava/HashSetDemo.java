package sunitaJava;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<String> haset = new HashSet<String>();
		
		haset.add("BMW");
		haset.add("Ford");
		haset.add("Volvo");
		haset.add("Mazda");
		
		for(String i: haset) {
			System.out.println(i);
		}
		System.out.println(haset.contains("BMW"));
		
		System.out.println(haset.size());
		System.out.println(haset);
		System.out.println(haset.remove("BMW"));
		System.out.println(haset);
		
		HashSet<Integer> number = new HashSet<Integer>();
		
		number.add(2);
		number.add(3);
		number.add(5);
		System.out.println(number);
		
		for(int a= 1; a<= 10; a++) {
			if( number.contains(a)) {
				System.out.println(a + " this number is in Set.");
			}else {
				System.out.println(a + " this number is not in Set.");
			}
			
		}
		
		
	

	}

}
