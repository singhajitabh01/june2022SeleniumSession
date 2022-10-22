package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementSectionLink {
	static WebDriver driver;
	
	public static void main(String[] args) {		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=20");
		
		List<WebElement> allSections = driver.findElements(By.className("list-group-item"));
		
		int sectionSize = allSections.size();
		System.out.println(sectionSize);
		for(WebElement e : allSections) {
			String allSectionText= e.getText();
			
			System.out.println(allSectionText);
		}
		
	}

}
