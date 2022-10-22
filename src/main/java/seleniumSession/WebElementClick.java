package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementClick {
	static WebDriver driver; 
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		/*
		 * driver.findElement(By.id("username")).sendKeys("Ajitabh");
		 * driver.findElement(By.id("password")).sendKeys("Aji@123");
		 */		
		//driver.findElement(By.id("")).click();
		
		By username = By.id("username");
		By password = By.id("password");
		By loginBtn = By.id("loginBtn");
		sendValue(username, "ajitabh@gmail.com");
		sendValue(password, "aji@123");
		doClick(loginBtn);
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void sendValue(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
}
