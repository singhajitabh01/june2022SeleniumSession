package _11_Method_With_ArrayList;

/**
 * Example of method overloading:-Login Page
 * In uber Payment method 
 * 
 * @author Ajitabhg
 *
 */
public class LoginPage {

	public void LoginPage() {
		System.out.println("Login With USername");

	}

	public void LoginPage(String userName,Object Password) {
		System.out.println("Login With Password");

	}

	public void LoginPage(String USername,Object PAssword,int OTP) {
		System.out.println("Login With OTP");
	}

	public void LoginPage(String Username,Object Password,String email) {
		System.out.println("Login with email");
	}
	
	
	
	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
		lp.LoginPage("Aji@123","asd");
		
	}

}
