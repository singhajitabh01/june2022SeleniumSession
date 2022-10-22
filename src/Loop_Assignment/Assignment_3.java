package Loop_Assignment;
/**
 * In tthis print Hi for every number divisible by 5
 * @author Ajitabhg
 *
 */
public class Assignment_3 {
	public static void main(String[] args) {
		int num = 1;
		while(num<=100) {
			System.out.println(num);
			if(num % 5 == 0) {
				System.out.println("Hi..");
			}
			num++;
		}
	}

}
