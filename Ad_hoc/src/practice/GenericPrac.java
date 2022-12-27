package practice;

public class GenericPrac {

	public static void main(String[]args) {
		Gen<String> g1 = new Gen<String>("Vijay");
		g1.show();
		System.out.println(g1.getObj());
		
		Gen<Integer> g2 = new Gen<Integer>(890);
		g2.show();
		System.out.println(g2.getObj());
		
		Gen<Double> g3 = new Gen<Double>(890.02);
		g3.show();
		System.out.println(g3.getObj());
		
	}
	
}

class Gen <T>{
	
	T obj;
	
	Gen(T obj) {
		
		this.obj = obj;
	}
	
	public void show() {
		System.out.println("type of object is:"+obj.getClass().getName());
	}
	
	public T getObj() {
		return obj;
		
	}
}
