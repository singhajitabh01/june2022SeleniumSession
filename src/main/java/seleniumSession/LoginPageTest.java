package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {
	public static void main(String[] args) throws Exception {
		BrowserUtil bru = new BrowserUtil();
		WebDriver driver = bru.LaunchBrowser("chrome");
		
		bru.launchUrl("https://naveenautomationlabs.com/");
		
		System.out.println(bru.getPageTitle());
		
		By email = By.id("input-email");
		By pswrd = By.id("input-password");
		
		ElementUtil eu = new ElementUtil(driver);
		eu.doSendKey(email, "naveen");
		eu.doSendKey(pswrd, "password@123");
	
		
	}

}
