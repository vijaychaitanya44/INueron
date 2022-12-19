package pod1;

public class Question {
private static int number=0;
public final int thought;

public Question() {
	thought= number++;
	System.out.println(thought);
}

public static void main(String[]args) {
	Question q = new Question();
	
	
}
}
