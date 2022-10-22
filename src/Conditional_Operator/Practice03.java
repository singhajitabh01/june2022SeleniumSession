package Conditional_Operator;
/*
 * THis is wrong Way to Writing Code 
 * In this Both if and Else condition getting printed
 * So it's a garbage Code 
 */
public class Practice03 {
	public static void main(String[] args) {
		String Browser = "Chrome";
		if(Browser.equals("FireFox")) {
			System.out.println("Open FireFox");
		}
		if(Browser.equals("Chrome")) {
			System.out.println("OPen Chrome Browser");
		}
		if(Browser.equals("Safari")) {
			System.out.println("OPen Safari Browser");
		}
		else {
			System.out.println("Please Gve correct Browser");
		}
	}
}
