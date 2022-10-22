package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Check video 5 5th approach
 */

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebEementHandling {
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		/*2nd approch
		 * WebElement username = driver.findElement(By.id("input-email"));
		 * 
		 * WebElement password = driver.findElement(By.id("input-password"));
		 * 
		 * username.sendKeys("admin123"); password.sendKeys("passwor123");
		 */
		
		/*
		 * 3rd approch By email = By.id("input-email"); By password =
		 * By.id("input-password");
		 * 
		 * getElement(email).sendKeys("ajitabh");
		 * getElement(password).sendKeys("aji@123");
		 */
		/*
		 * 
		 * By email = By.id("input-email");
		 * 
		 * doSendKey(email,"aji@gmail.com");
		 */
		
		//below is the 6th approach for calling method 
		By email = By.id("input-email");
		By pswrd = By.id("input-password");
		
		ElementUtil eutl = new ElementUtil(driver);
		eutl.doSendKey(email, "test");
		eutl.doSendKey(pswrd, "test@123");
		
	}
	public static void doSendKey(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
