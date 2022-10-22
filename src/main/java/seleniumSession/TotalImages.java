package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/");
		
		List<WebElement> AllImage = driver.findElements(By.tagName("img"));
		
		System.out.println(AllImage.size());
		
		/*
		 * for(WebElement e :AllImage) { String srcAttr = e.getAttribute("src"); String
		 * altAttr = e.getAttribute("alt"); System.out.println("All src attributes : "
		 * +srcAttr+ ":" + altAttr );
		 * //System.out.println("All alt Attributes : "+altAttr); }
		 */
    }
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
}