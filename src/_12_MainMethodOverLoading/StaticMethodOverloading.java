package _12_MainMethodOverLoading;

public class StaticMethodOverloading {
	
	public static void printLogo() {
		System.out.println("Amazon Login");
	}
	
	public static void printLogo(int i) {
		System.out.println("Nokia Login");
	}
	
	public static void printLogo(String Flipkart) {
		System.out.println("FlipKart Login");
	}
	
	public static void main(String[] args) {
		StaticMethodOverloading.printLogo("FlipLogo");
		StaticMethodOverloading.printLogo();
	}



}
