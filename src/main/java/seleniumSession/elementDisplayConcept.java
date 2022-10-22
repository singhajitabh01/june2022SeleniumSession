package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class elementDisplayConcept {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By SearchBox = By.name("search");
		
		if(doEleIsDisplay(SearchBox)) {
			System.out.println("Element is Display");
			Thread.sleep(2000);
			doSendKey(SearchBox, "samsung");
		}else {
			System.out.println("Element Not Display");
		}
			
	}
	
	public static boolean doEleIsDisplay(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKey(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	

}
