package sunitaJava;

public class ConstractorDemo {
	String name;
	int i;
	ConstractorDemo(String name, int i) 
	{   this.name = name;
	    this.i = i;
	}
      ConstractorDemo()
      {
	
        }
	    


	public static void main(String[] args) {
		
		ConstractorDemo c1 = new ConstractorDemo("John ", 10);
		ConstractorDemo c2 = new ConstractorDemo("Sara ", 20 );
		ConstractorDemo c3 = new ConstractorDemo("Tina ",  30);
		System.out.println( c3.name +c3.i);
		System.out.println( c1.name +c1.i);
		System.out.println( c2.name+c2.i);
	
	}

	}
