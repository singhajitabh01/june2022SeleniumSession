package _10_ObjRefrence_Function;

public class Browser {
	
	public boolean launchBrowser(String brName) {
		System.out.println("Launch Browser"+brName);
		
		switch (brName) {
		case "chrome":
			System.out.println("Chrome is launching........");
			return true;
		case "firefox":
			System.out.println("firefox is launching........");
			return true;
		case "safari":
			System.out.println("safari is launching........");
			return true;
		default:
			System.out.println("Please pass right browser..."+brName);
			return false;
		}
		
	}
	public static void main(String[] args) {
		Browser br = new Browser();
		boolean flag = br.launchBrowser("chrome");
		System.out.println(flag);
		if(flag) {
			System.out.println("www.amazon.com");
		}
	}
}
 