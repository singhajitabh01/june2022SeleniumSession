package Conditional_Operator;
/**
 * THis is also a garbage code as in this code will first check till chrome 
 * So performance wise not good
 * This is also a garbage/ugly code 
 * @author Ajitabhg
 *
 */

public class Practice04 {

	public static void main(String[] args) {
		String Browser = "Chrome";
		
		if(Browser.equals("FireFox")) {
			System.out.println("Print FireFox");	
		}else if(Browser.equals("edge")) {
			System.out.println("Print edge");
	}else if(Browser.equals("Chrome")) {
		System.out.println("Print Chrome");
	}else {
		System.out.println("Print THe Correct Browser");
	}
}
}
