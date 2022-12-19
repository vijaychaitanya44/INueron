package pod1;

public class Person {

	private String name = null;
	
	public String toString() {
		return name;
	}
	
	public String answerQuestion(Question question) {
		String s= String.valueOf(question.thought);
		return s;
	}
	
	public static void main(String[]args) {
		Person p= new Person();
		p.answerQuestion(null);
	}
}
