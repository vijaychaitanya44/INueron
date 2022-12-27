package practice;



public class SubClass extends Parent{

	 void method1() {
		 super.method1();
		 System.out.println("SuperSubClass method1");
	 }
	 
	 void method5() {
		 super.method2();
		 this.method1();
		 System.out.println("Parent method1");
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubClass c = new SubClass();
		SubClass c2 = new SubClass();
		Parent p = new SubClass();
		//c.method1();
		
		System.out.println(c.getClass().getName());
		
		
		//p.method2();
		c2.method5();
		
		
		
		//SubClass sc = new Parent();
		
	}

}
 class Parent {
	 
	 void method1() {
		 System.out.println("Parent method1");
	 }
	 
	 void method2() {
		 System.out.println("Parent method2");
	 }
	
	 
	 void method3() {
		 System.out.println("Parent method3");
	 }
}