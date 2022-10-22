package Conditional_Operator;
/**
 * Print value in integer/double /String /float / char
 * @author Ajitabhg
 * Note only String Char and integer value alllowed
 */
public class Assignment_1 {

	public static void main(String[] args) {
		int percentage = 30;
		switch (percentage) {
		case 80:
			System.out.println("Print Value as pass");
			break;
		case 60:
			System.out.println("Value as B+");
			break;
		case 30:
			System.out.println("Value as c");	
			break;
		default:
			System.out.println("Please add correct value :"+percentage);
			break;
		}

	}

}
