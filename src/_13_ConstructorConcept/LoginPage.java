package _13_ConstructorConcept;

public class LoginPage {
	String username;
	String password;

	public LoginPage(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public void doLogin(String un,String pwd) {
		System.out.println("enter username :"+username);
		System.out.println("enter password :"+password);
		System.out.println("Login Successfully...");
	}
	public static void main(String[] args) {
		LoginPage lp = new LoginPage("admin","admin123");
		lp.doLogin(lp.username, lp.password);
		
		
		LoginPage lp2 = new LoginPage("aji","aji123");
		lp2.doLogin(lp2.username, lp2.password);
				
	}

}
