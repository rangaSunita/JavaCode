package sunitaJava;

public class MultiArrayDemo {

	public static void main(String[] args) {
		
	int[][] b= {{10,20,30},{40,30,20},{10,30,50}};
	
	for(int i=0; i<b.length; i++)
	{
		
		for(int j=0; j<b[i].length;j++){
			
			
			System.out.println(b[i][j]+"");
		}
	
	int	a[][] =new int[2][2];
		
	System.out.println(a.length);
	a[0][0] = 10;
	a[0][1] = 25;
	
	a[1][0] = 10;
	a[1][1] = 20;
	System.out.println(a[1][0]);
	
	for(int x=0; x<a.length; x++)
	{
		
		for(int y=0; y<a[x].length;y++){
			
			System.out.println(a[x][y]+" ");
		}
	
		}
		
		}
	}
	
	
	}

	


