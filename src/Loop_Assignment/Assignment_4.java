package Loop_Assignment;
/**
 * Only print number divisible by 5
 * @author Ajitabhg
 *
 */
public class Assignment_4 {
	public static void main(String[] args) {
		int a = 5;
		while(a<=100) {
			if(a % 5 == 0){
				System.out.println("NUmber is divisible by "+a);
				
			}
			a++;
		}
		System.out.println("Number is divisible");
	}

}
