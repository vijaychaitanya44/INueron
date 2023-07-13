package practice;

public class SwapNumbers {

	int  method1() {
		int a = 10;

		int b = 10;
		int temp;
		System.out.println("a is " + a);
		System.out.println("b is " + b);

		if(a==b) {
			return 0;
		}
		temp = a;
		a = b;
		b = temp;

		System.out.println("a is " + a);
		System.out.println("b is " + b);
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SwapNumbers sp1 = new SwapNumbers();
		sp1.method1();
	}

}
