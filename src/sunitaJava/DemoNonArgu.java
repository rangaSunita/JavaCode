package sunitaJava;

public class DemoNonArgu {
		
	 DemoNonArgu() {
		 
	 }
	 
	int  DemoNonArgu(int i,int j) {
		  return i+j;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoNonArgu demo = new DemoNonArgu();
		
		 System.out.println("adding two numbers "+demo.DemoNonArgu(20,30));
	}

}
