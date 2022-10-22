package _12_MainMethodOverLoading;

public class Customer {
	String Name;
	int age;
	static String compnyName = "Amazon";
	
	public void sendMail() {
		System.out.println("send mail");
	}
	
	public static void getInfo() {
		System.out.println("Get information");
	}
	public static void main(String[] args) {
		Customer cs = new Customer();
		cs.sendMail();
		Customer.getInfo();//as it is a static method
	}

}
