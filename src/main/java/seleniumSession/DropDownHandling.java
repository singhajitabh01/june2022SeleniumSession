package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandling {
	static WebDriver driver; 
	static Select sel;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		//By countryDrop = By.id("Form_getForm_Country");
		WebElement dropdowncheck = driver.findElement(By.id("Form_getForm_Country"));
		
		/*
		 * doSelectDropDownByIndex(countryDrop, 5); doSelectDropDownByIndex(countryDrop,
		 * 15);
		 */
		/*
		 * Select sel = new Select(dropdowncheck); List<WebElement> countryOptionCount =
		 * sel.getOptions(); System.out.println("Total Size"+countryOptionCount.size());
		 */	
		
	}
	
	public static List<WebElement> getDropdownOptions(By locator) {
		sel = new Select(getElement(locator));
		return sel.getOptions();
	}
	
	public int getDropdownCount(By locator) {
		return getDropdownOptions(locator).size();
	}
	
	public static void doSelectDropDownByIndex(By locator,int index) {
		sel = new Select(getElement(locator));
		sel.selectByIndex(index);
	}
	
	public static void doSelectDropDownByVisibleText(By locator,String text) {
		sel = new Select(getElement(locator));
		sel.selectByVisibleText(text);
	}
	
	public static void doSelectDropDownByIndex(By locator,String value) {
		 sel = new Select(getElement(locator));
		 sel.selectByValue(value);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	

}
