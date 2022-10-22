package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleElementsConcept {
	//static WebDriver driver;
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		List<WebElement> allTag = driver.findElements(By.tagName("a"));		
		int allTagSize = allTag.size();
		System.out.println(allTagSize);
		
		/*for(int i = 0;i<allTag.size();i++) {
			String allText = allTag.get(i).getText();
			if(allText.length()!=0) {
				System.out.println(allText);
			}*/
		
		for(WebElement e : allTag) {
			String allTagText= e.getText();
			
			if(allTagText.length()!=0) {
				System.out.println(allTagText);
				
			}
		}
	}
		/*
		 * public static List<WebElement> getElements(By locator) { return
		 * driver.findElements(locator); }
		 */
}


