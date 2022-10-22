package _11_Method_With_ArrayList;

/**
 * Method Chaining :- When one method is calling another method
 * @author Ajitabhg
 *
 */
public class MethodChaining {
	
	public void m1() {
		m3();
		System.out.println("Print m1");
	}
	
	public void m2() {
		System.out.println("Print m2");
	}

	public void m3() {
		System.out.println("Print m3");
	}

	public static void main(String[] args) {
		MethodChaining mc = new MethodChaining();
		mc.m1();
	}
	
}
//Notes : In main method we not call the method directly as main method 
//which is always statis in nature will store
//in different memory and other method store in heap memory