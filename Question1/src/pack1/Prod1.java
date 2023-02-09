package pack1;

public class Prod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prod1 p = new Prod1();

		System.out.println(p.toString());

		System.out.println(Prod2.class.isAssignableFrom(Prod3.class));
		System.out.println(Prod3.class.isAssignableFrom(Prod2.class));
	}
}