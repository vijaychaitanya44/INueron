package practice;

public class SwapNumbers {

	void method1() {
		int a = 10;

		int b = 20;
		int temp;
		System.out.println("a is " + a);
		System.out.println("b is " + b);

		temp = a;
		a = b;
		b = temp;

		System.out.println("a is " + a);
		System.out.println("b is " + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SwapNumbers sp1 = new SwapNumbers();
		sp1.method1();
	}

}
