package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Guddan {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By username = By.id("input-email");
		By password = By.id("input-password");
		
		//driver.findElement(By.id("input-email"));
		//driver.findElement(username);
		//driver.findElement(password);
		
		sendElement(username, "varsha");
		sendElement(password,"varsha123");
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void sendElement(By locator,String value) {
		getElement(locator).sendKeys(value);
	}

}
