package sunitaJava.Inheitance;

public class ClassC extends ClassB {
	
	void getAgeOfStudent() {
		System.out.println("Age");
	}


	 public void main(String[]args) {
		 ClassC  Cc= new ClassC();
		 Cc.getName("abcd");
		 Cc.getStudentName();
		 Cc.getAgeOfStudent();
		 Cc.getDateOfBirth();
	System.out.println("Name");	 
	 }
}