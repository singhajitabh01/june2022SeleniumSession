package seleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class WebDriverBasics {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\AjitabhS\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\AjitabhS\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://trackon.in/");
		
		String title = driver.getTitle();
		System.out.println("Title of Page is : "+title);
		
		//Validation added 
		
		if(title.equals("Trackon Couriers Pvt.Ltd.")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}

	}

}
