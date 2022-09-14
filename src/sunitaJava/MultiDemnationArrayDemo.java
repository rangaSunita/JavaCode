package sunitaJava;

public class MultiDemnationArrayDemo {

	public static void main(String[] args) {
		
		String[][] name = {{"sonu","monu","joy"},{"anu","renu","pihu"}};
		
		for(int i=0; i<name.length; i++)
		{
			
			for(int j=0; j<name[i].length;j++){
				
				
				System.out.println(name[i][j]+"");
			}
	
		}
		System.out.println(name.length);

		System.out.println(name[0][2]);
	}
	}
	
	
		

