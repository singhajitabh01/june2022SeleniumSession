package IncrementalAndDecremental;

public class PreIncrement {

	public static void main(String[] args) {
		int b = 1;
		int c = ++b;
		
		System.out.println(b);//2
		System.out.println(c);//2
		
		System.out.println("====================");
		
		int pop = 100;
		System.out.println(++pop);
		System.out.println(pop);

	}

}
