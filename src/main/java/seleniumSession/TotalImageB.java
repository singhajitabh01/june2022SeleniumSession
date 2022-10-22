package seleniumSession;
//check video 8 after 
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImageB {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		By allImg = By.tagName("img");
		By allLinks = By.tagName("a");
		Thread.sleep(2000);
		/*
		 * System.out.println("All image Links : "+ getElements(allImg).size());
		 * System.out.println("All Tag Links : "+getElements(allLinks).size());
		 */
		int AllImgTag = getElementsCount(allImg);
		int AllTag = getElementsCount(allLinks);
		System.out.println("All Images Tag count :"+AllImgTag);
		System.out.println("All Links Tag count :"+AllTag);
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	
	public static void getElementTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		ArrayList<String>eleTextList = new ArrayList<String>();
		
		for(WebElement e : eleList) {
			String text = e.getText();
			eleTextList.add(text);
			
		}
		//return getElementTextList;
	}
}
