package practice;

public class LamdExp {

	public static void main(String[] args) {
		
		Ball b = new Ball();
		
		b.show();
		
}
}
@FunctionalInterface
interface Apple {
	void show();

}

class Ball implements Apple{
	
	public void show() {
		System.out.println("Ball says HI");
	}
	
}