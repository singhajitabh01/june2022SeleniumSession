package _11_Method_With_ArrayList;
/**
 * Exmaple of method overloading(compile time polymorphism)
 * @author Ajitabhg
 * Within the same class when we have :
 * same Name
 * Different Parameter/Sequence of parameter also different
 * 
 */
public class Application {
	
	public void test() {
		System.out.println("HI ");
	}
	
	public int test(int number) {
		return 10;
	}
	public void test(String Name) {
		System.out.println("Hello");
	}
	
	public void test(String name,int number ) {
		System.out.println("HI ");
	}
	
	public void test(int number ,String name) {
		System.out.println("HI ");
	}

}
