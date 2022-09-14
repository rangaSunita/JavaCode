package sunitaJava.Inheitance;

public class ClassDemoInterface implements DemoInterface, DemoInterface1 {

	@Override
	public void getStart() {
		System.out.println("click on Start ");
		

	}
	
	public void play1() {
		System.out.println("clik on play ");
		

	}

	@Override
	public void getStop() {
		System.out.println("click on Stop ");
		
		}

	@Override
	public void sleep() {
		System.out.println("Purrrrr ");

	}

	@Override
	public void speed() {
		System.out.println("Slecte the level ");

	}
	
	public static void main(String[]args) {
		
		ClassDemoInterface demo = new ClassDemoInterface();
		
		demo.getStart();
		demo.getStop();
		demo.speed();
		demo.sleep();
		System.out.println(demo.s);
		System.out.println(demo.i);
		demo.play();
		
		
		
		
	}

	@Override
	public void play() {
		System.out.println("play to continuet");
		
	}

}
