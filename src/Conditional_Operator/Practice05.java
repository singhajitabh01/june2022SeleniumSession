package Conditional_Operator;

public class Practice05 {
	public static void main(String[] args) {
		String Browser = "safari";
		switch (Browser) {
		case "chrome":
			System.out.println("Print Chrome");
			break;
		case "Fire":
			System.out.println("Print Fire");
			break;
		case "Opera":
			System.out.println("Print Opera");
			break;
			default:
			System.out.println("Print Correct Browser :"+Browser);//append the Browser value
			break;
		}
	}

}
//Note :- Switch Case only work with integer and String and Char Value