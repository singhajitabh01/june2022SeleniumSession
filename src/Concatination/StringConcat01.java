package Concatination;

/**
 * Adding integer with string is also String concatenation
 * @author Ajitabhg
 *
 */
public class StringConcat01 {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		String x = "Hello";
		String y = "Java";
		
		System.out.println(a+b+x+y);//30HelloJava
		
		System.out.println("================");
		
		System.out.println(x+y+a+b);//HelloJava1020
		
		System.out.println("================");
		
		System.out.println(x+y+(a+b));//HelloJava30
		
		System.out.println("==================");
		
		System.out.println(x+y+(+a+b));//HelloJava30
		
		System.out.println("........................");
		
		System.out.println(a+b+x+y+a+b);//30HelloJava1020

	}

}
