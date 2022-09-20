package sunitaJava;

public class ArrayDemo {

	
	public static void main(String[] args) {
     
		int sum =0;
   int[] num = new int[4];
    num[0]=24;
    num[1]=28;
    num[2]=20;
    num[3]= 15;
     System.out.println("array of is Num :"+num[3]);
     
     
    String[] name = { "ram", "joy","Daksh", "tina"};
    
    System.out.println("Name of student :"+name[2]);
    
   
    for(int i  = 0; i<name.length; i++) {
    	
    	System.out.println("name of student:" +name[i]);
    }
    for(int a: num) {
    	//System.out.println(a);
    	try {
			sum += a;
			System.out.println(sum);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    
    		
    
    
    
	}
}
