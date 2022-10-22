package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {
	
	private WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}
	public void doSendKey(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	
	public  WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public void doClick(By locator) {
		getElement(locator).click();
	}
	
	public String doGetText(By locator) {
		return getElement(locator).getText();
	}

    public String getAttributeText(By locator,String attributeValue) {
		return getElement(locator).getAttribute(attributeValue);
	}
    
    public boolean doEleIsDisplay(By locator) {
		return getElement(locator).isDisplayed();
	}
    
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	//**********************Dropdown Utils******************
	
	
	public void doSelectDropDownByIndex(By locator,int index) {
		Select sel = new Select(getElement(locator));
		sel.selectByIndex(index);
	}
	
	public void doSelectDropDownByVisibleText(By locator,String text) {
		Select sel = new Select(getElement(locator));
		sel.selectByVisibleText(text);
	}
	
	public void doSelectDropDownByIndex(By locator,String value) {
		Select sel = new Select(getElement(locator));
		sel.selectByValue(value);
	}
	
	
}
