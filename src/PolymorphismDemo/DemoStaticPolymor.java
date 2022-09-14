package PolymorphismDemo;

public class DemoStaticPolymor {

	void show( int a ){
		System.out.println(10);
	}
	
     void show(String abc){

      System.out.println("hello");
       }

public static void main(String[]args) {  
	
	DemoStaticPolymor Dsp = new DemoStaticPolymor();
	
	  
	    Dsp.show(2);
	    
	    Dsp.show("abd");
	
      }
}
   

    

