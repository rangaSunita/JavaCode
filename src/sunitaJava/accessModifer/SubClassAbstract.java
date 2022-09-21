package sunitaJava.accessModifer;

public class SubClassAbstract extends DemoAbstract{
	
	 public void sound() {  
	  
	  System.out.println("this is sound");
  }
	  
	  public void eat() {
		  System.out.println("how to eat");
	  }
	  public static void main(String[] args) {
		  DemoAbstract dc = new SubClassAbstract();
		  dc.sleep();
		  dc.eat();
		  dc.sound();
		  
	  }

  }







